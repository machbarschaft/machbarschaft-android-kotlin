package jetzt.machbarschaft.android.view.splash

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import jetzt.machbarschaft.android.R
import java.io.File

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class SplashFragment : Fragment() {

    private val myHandler = Handler()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    override fun onResume() {
        super.onResume()

        val user: FirebaseUser? = FirebaseAuth.getInstance().currentUser
        if (user == null) {
            myHandler.postDelayed({ this.startLogin() }, 1200)
        } else {
            myHandler.postDelayed({ this.startApp() }, 1200)
        }
    }

    private fun fixGoogleMapBug() {
        val googleBug: SharedPreferences =
            context?.getSharedPreferences("google_bug", Context.MODE_PRIVATE)!!
        if (!googleBug.contains("fixed")) {
            val corruptedZoomTables = File(context?.filesDir, "ZoomTables.data")
            corruptedZoomTables.delete()
            googleBug.edit().putBoolean("fixed", true).apply()
        }
    }

    private fun startApp() {
//        this.startActivity(Intent(this, HomeActivity::class.java))
    }

    private fun startLogin() {
        findNavController().navigate(R.id.action_splash_to_login)
    }
}