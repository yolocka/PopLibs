package com.example.poplibshomework

import android.os.Handler
import java.util.*


class LoginContract {

    interface View {
        fun setSuccess()
        fun setError(error: Int)
        fun setInfoMessage(message: Int)
        fun showProgress()
        fun hideProgress()
        fun getHandler(): Handler
    }

    interface Presenter {
        fun onAttach(view: View)
        fun onLogin(login: String, password: String)
        fun onCredentialsConfirmation()
        fun onNewUserCreate()
    }

    interface Model {
        fun addNewUser(): Int
        fun getUserEmail(): Int
    }
}