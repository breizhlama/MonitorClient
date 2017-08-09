package com.imanity.monitor

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.imanity.monitor.profile.UserProfile

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun authenticate(username: String, password : String): UserProfile {
        val profile: UserProfile = UserProfile("Doe", "John", "doej20", "jdo","john.doe@gmail.com")

        return profile;
    }
}
