package com.example.fooddeliver
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.coroutines.delay
import org.xml.sax.HandlerBase


class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)
        SetContentView(R.layout.activity_main)
        Handler().postDelayed({
            val intent = Intent(packageContext this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }, delayMillis(2000))
    }
}