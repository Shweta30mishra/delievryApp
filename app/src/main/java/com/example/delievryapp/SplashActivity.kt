package com.example.delievryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.TextView
import com.airbnb.lottie.LottieAnimationView

class SplashActivity : AppCompatActivity() {
    var txtView: TextView? = null
    var animationView: LottieAnimationView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        txtView = findViewById(R.id.txtMsg)
        animationView = findViewById(R.id.lottie)

        txtView?.animate()?.translationY(-1400F)?.setDuration(2700)?.setStartDelay(0)
        animationView?.animate()?.translationX(2000F)?.setDuration(2000)?.setStartDelay(2900)

        val handler = Handler()
        handler.postDelayed({
            // do something after 5000m
                            val Intent = Intent(this,MainActivity::class.java)
            startActivity(Intent)
        }, 5000)

}
}