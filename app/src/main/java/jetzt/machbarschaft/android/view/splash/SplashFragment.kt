package jetzt.machbarschaft.android.view.splash

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import jetzt.machbarschaft.android.R
import kotlinx.android.synthetic.main.fragment_first.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class SplashFragment : Fragment(), SplashContract.View {

    private var presenter: SplashContract.Presenter? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        presenter = SplashPresenter()
        presenter?.bindView(this)

        view.findViewById<Button>(R.id.button_load_users).setOnClickListener {
            presenter?.registerFirebase("test@test.de", "123456")
        }

        view.findViewById<Button>(R.id.button_next_fragment).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
    }

    override fun showLoadingDialog() {
        loading_progress_bar.visibility = View.VISIBLE
    }

    override fun hideLoadingDialog() {
        loading_progress_bar.visibility = View.GONE
    }

    override fun showError() {
        textview_response.text = "error on loading"
    }

    override fun showToken(userToken: String) {
        textview_response.text = "loaded ${userToken} users"

    }
}