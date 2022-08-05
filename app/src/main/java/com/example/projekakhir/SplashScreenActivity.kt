package com.example.projekakhir

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.VideoView

class SplashScreenActivity : AppCompatActivity() {

    var videoView: VideoView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_splash_screen)
        supportActionBar?.hide()

        videoView = findViewById(R.id.img_spashscreen)

        val path = "android.resource://" + packageName + "/" + R.raw.logo
        val uri = Uri.parse(path)

        videoView!!.setVideoURI(uri)
        videoView!!.start()

        videoView!!.setOnCompletionListener {
            if (isFinishing){
                true
            }
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}