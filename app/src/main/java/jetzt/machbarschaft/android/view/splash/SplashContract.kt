package jetzt.machbarschaft.android.view.splash

import jetzt.machbarschaft.android.service.testapi.data.UserResponse

class SplashContract {

    interface View {
        fun showLoadingDialog()
        fun hideLoadingDialog()
        fun showUsers(user: List<UserResponse>)
        fun showError()
    }

    interface Presenter {
        fun bindView(view: SplashContract.View)
        fun unbindView()
        fun getAllUsers()
    }

}