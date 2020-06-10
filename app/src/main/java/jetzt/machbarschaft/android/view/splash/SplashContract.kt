package jetzt.machbarschaft.android.view.splash

class SplashContract {

    interface View {
        fun showLoadingDialog()
        fun hideLoadingDialog()
        fun showError()
        fun showToken(userToken: String)
    }

    interface Presenter {
        fun bindView(view: SplashContract.View)
        fun unbindView()
        fun authFirebase(email: String, password: String)
        fun registerFirebase(email: String, password: String)
        fun setToken()
        fun getUser()
    }

}