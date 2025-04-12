package com.example.bookxpert_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spalsh)

        // Delay for 2 seconds, then move to MainActivity
        lifecycleScope.launch {
            delay(2000) // 2000 milliseconds = 2 seconds
            startActivity(Intent(this@SplashActivity, HomeActivity::class.java))
            finish() // close the splash screen so it doesn't stay in back stack
        }
    }
}