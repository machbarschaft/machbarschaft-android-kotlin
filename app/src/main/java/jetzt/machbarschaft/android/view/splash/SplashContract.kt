package jetzt.machbarschaft.android.view.splash

class SplashContract {

    interface View {
        fun showUser()
        fun showError()
    }

    interface Presenter {
        fun bindView(view: SplashContract.View)
        fun unbindView()
        fun getAllUsers()
    }

}