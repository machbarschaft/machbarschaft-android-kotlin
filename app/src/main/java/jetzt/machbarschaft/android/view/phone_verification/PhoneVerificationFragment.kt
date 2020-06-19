package jetzt.machbarschaft.android.view.phone_verification

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.gms.tasks.Task
import com.google.firebase.FirebaseException
import com.google.firebase.FirebaseTooManyRequestsException
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.PhoneAuthCredential
import com.google.firebase.auth.PhoneAuthProvider
import com.google.firebase.auth.PhoneAuthProvider.ForceResendingToken
import jetzt.machbarschaft.android.R

class PhoneVerificationFragment : Fragment()  {

    private val LOG_TAG = "VerifyPhoneActivity"
    private val EXTRA_PHONE_NUMBER = "phoneNumber"
    private val SAVE_PHONE_NUMBER = "phoneNumber"
    private val SAVE_VERIFICATION_IN_PROGRESS = "verificationInProgress"

    private val mPhoneNumber: String? = null
    private val verificationInProgress = false
    private val btnSendCode: Button? = null
    private val verificationCallbacks: VerificationCallbacks? =
        null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_phone_verification, container, false)
    }

    /**
     * Navigates back to the login activity.
     */
    private fun navigateToLogin() {
        //TODO
//        startActivity(
//            Intent(this, LoginActivity::class.java)
//                .putExtra(LoginActivity.EXTRA_PHONE_NUMBER, mPhoneNumber)
//        )
//        finishAfterTransition()
    }

    private fun onLoginDone() {
        Toast.makeText(context, R.string.successfull_auth, Toast.LENGTH_SHORT)
            .show()

        //TODO
//        startActivity(Intent(this, HomeActivity::class.java))
//        finishAfterTransition()
    }

    /**
     * Call this method to sign into firebase.
     *
     * @param credential The credential to sign in with.
     */
    private fun signIn(credential: PhoneAuthCredential) {
        FirebaseAuth.getInstance().signInWithCredential(credential)
            .addOnCompleteListener(requireActivity()) { task: Task<AuthResult?> ->
                if (task.isSuccessful) {
                    onLoginDone()
                } else {
                    Toast.makeText(context, R.string.verify_error_generic, Toast.LENGTH_LONG)
                        .show()
                }
            }
    }

    inner class VerificationCallbacks : PhoneAuthProvider.OnVerificationStateChangedCallbacks() {

        private var mResendToken: PhoneAuthProvider.ForceResendingToken? = null
        private var mVerificationId: String? = null

        override fun onVerificationCompleted(phoneAuthCredential: PhoneAuthCredential) {
            signIn(phoneAuthCredential)
        }

        override fun onVerificationFailed(exception: FirebaseException) {
            Log.e(
                LOG_TAG,
                "Phone number verification failed",
                exception
            )

            var errorText: Int = R.string.verify_error_generic
            if (exception is FirebaseTooManyRequestsException) {
                errorText = R.string.verify_error_sms_send_failed
            }
            Toast.makeText(context, errorText, Toast.LENGTH_LONG).show()

            navigateToLogin()
        }

        override fun onCodeSent(verificationId: String, forceResendingToken: ForceResendingToken) {
            mVerificationId = verificationId
            mResendToken = forceResendingToken
        }

        override fun onCodeAutoRetrievalTimeOut(verificationId: String) {
            btnSendCode!!.isEnabled = true
        }
    }

}