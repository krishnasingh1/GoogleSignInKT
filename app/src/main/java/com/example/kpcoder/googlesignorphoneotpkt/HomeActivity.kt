package com.example.kpcoder.googlesignorphoneotpkt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.kpcoder.googlesignorphoneotpkt.utils.FirebaseUtils.auth

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val email = intent.getStringExtra("email")
        val displayName = intent.getStringExtra("name")

        findViewById<TextView>(R.id.textView).text = email + "\n" + displayName

        findViewById<Button>(R.id.signOutBtn).setOnClickListener {
            auth.signOut()
            startActivity(Intent(this , MainActivity::class.java))
        }
    }
}