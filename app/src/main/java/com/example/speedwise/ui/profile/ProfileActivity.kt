package com.example.speedwise.ui.profile

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.speedwise.R
import com.example.speedwise.ui.login.LoginActivity

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        /*val btnChangePassword = findViewById<Button>(R.id.btnChangePassword)
        btnChangePassword.setOnClickListener {
            startActivity(Intent(this, ChangePasswordActivity::class.java))
        }*/

        val btnSignOut = findViewById<Button>(R.id.btnSignOut)

/*
        tvEmail.text = "student@email.com" // Optional: Load from SharedPreferences or DB
*/

        btnSignOut.setOnClickListener {
            Toast.makeText(this, "Signed out!", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }



    }

}
/*
class ChangePasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)
        */
/*
                val btnResetPassword = findViewById<Button>(R.id.btnResetPassword)*//*

        val btnChangePassword = findViewById<Button>(R.id.btnChangePassword)
        btnChangePassword.setOnClickListener {
            startActivity(Intent(this, ChangePasswordActivity::class.java))
        }

        */
/*btnResetPassword.setOnClickListener {
            Toast.makeText(this, "Reset link sent to your email.", Toast.LENGTH_LONG).show()
            finish()
        }*//*


        btnChangePassword.setOnClickListener {
            Toast.makeText(this, "Password changed successfully.", Toast.LENGTH_LONG).show()
            finish()
        }
    }
}*/
