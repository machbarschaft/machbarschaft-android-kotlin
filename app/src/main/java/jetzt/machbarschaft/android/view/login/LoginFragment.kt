package jetzt.machbarschaft.android.view.login

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
import jetzt.machbarschaft.android.util.value
import kotlinx.android.synthetic.main.fragment_login.*

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class LoginFragment : Fragment() {
    companion object {
        const val EXTRA_PHONE_NUMBER = "phoneNumber"
    }

    private var phoneNumberTextView: EditText? = null
    private var loginButton: Button? = null
    private var countryCodeTextView: AutoCompleteTextView? = null

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

        introSlidesPager.adapter = IntroPagerAdapter(requireActivity().supportFragmentManager)
        introSlidesIndicator.setupWithViewPager(introSlidesPager, true)

        // Get UI elements
        phoneNumberTextView = input_phone_number
        loginButton = btn_login

        // Button click handlers

        // Button click handlers
        loginButton?.setOnClickListener { login() }

        val countryCodes =
            resources.getStringArray(R.array.country_codes)

        //TODO needs to be fixed
        /*val countryCodeAdapter = context?.let {
            ArrayAdapter(
                context!!,
                R.layout.login_phone_dropdown_menu_popup_item,
                countryCodes
            )
        }
        countryCodeTextView = filled_exposed_dropdown_country_code_login
        countryCodeTextView!!.setText(countryCodes[0], false)
        countryCodeTextView!!.setAdapter(countryCodeAdapter)
*/
        // Fill in phone number if given
        val phoneNumber: String? =
            requireActivity().intent.getStringExtra(EXTRA_PHONE_NUMBER)

        if (phoneNumber != null) {
            for (countryCode in countryCodes) {
                if (!phoneNumber.startsWith(countryCode)) {
                    continue
                }
                val phoneNumberSecondPart = phoneNumber.substring(countryCode.length)

                // Set data in views
                countryCodeTextView!!.setText(countryCode)
                phoneNumberTextView!!.setText(phoneNumberSecondPart)
                break
            }
        }
    }

    private fun login() {
        val phoneNumber = PhoneNumberFormatterUtil.getPhoneNumber(
            countryCodeTextView.value(), phoneNumberTextView.value()
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
    private fun validate(phoneNumber: String): Boolean {
        var valid = false
        if (Patterns.PHONE.matcher(phoneNumber).matches()) {
            phoneNumberTextView!!.error = null
            valid = true
        } else {
            phoneNumberTextView!!.error = getString(R.string.login_error_invalid_phone_number)
        }
        return valid
    }
}
