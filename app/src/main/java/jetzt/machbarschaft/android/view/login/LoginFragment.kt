package jetzt.machbarschaft.android.view.login

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import jetzt.machbarschaft.android.R
import jetzt.machbarschaft.android.util.PhoneNumberFormatterUtil
import kotlinx.android.synthetic.main.fragment_login.*

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class LoginFragment : Fragment() {

    val EXTRA_PHONE_NUMBER = "phoneNumber"

    private var phoneNumberTextView: EditText? = null
    private var loginButton: Button? = null
    private val countryCodeTextView: AutoCompleteTextView? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Sets the Custom Pager Adapter to display the different slides in the application
        val introSlidesPager: ViewPager = intro_slides_pager
        val introSlidesIndicator: TabLayout = intro_slides_indicator

        introSlidesPager.adapter = CustomPagerAdapter(activity!!.supportFragmentManager)
        introSlidesIndicator.setupWithViewPager(introSlidesPager, true)

        // Get UI elements

        // Get UI elements
        phoneNumberTextView = input_phone_number
        loginButton = btn_login

        // Button click handlers

        // Button click handlers
        loginButton?.setOnClickListener { login() }
    }

    private fun login() {
        val phoneNumber: String = PhoneNumberFormatterUtil.getPhoneNumber(
            countryCodeTextView!!.text.toString(), phoneNumberTextView!!.text.toString()
        )

        if (!validate(phoneNumber)) {
            loginButton!!.isEnabled = true
            return
        }
        loginButton!!.isEnabled = false

        //TODO
//        startActivity(
//            Intent(this, VerifyPhoneActivity::class.java)
//                .putExtra(VerifyPhoneActivity.EXTRA_PHONE_NUMBER, phoneNumber)
//        )
//        finishAfterTransition()
    }

    /**
     * Checks if the Phone Number is actually valid.
     *
     * @param phoneNumber The phone number to validate.
     * @return True if phone number is legit.
     */
    private fun validate(phoneNumber: String?): Boolean {
        var valid = false
        if (phoneNumber != null && Patterns.PHONE.matcher(phoneNumber).matches()) {
            phoneNumberTextView!!.error = null
            valid = true
        } else {
            phoneNumberTextView!!.error = getString(R.string.login_error_invalid_phone_number)
        }
        return valid
    }
}