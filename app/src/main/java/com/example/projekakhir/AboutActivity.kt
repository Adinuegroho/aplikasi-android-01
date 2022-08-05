package com.example.projekakhir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class AboutActivity : AppCompatActivity() {

    private var title: String = "About"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        setActionBar(title)
    }

    private fun setActionBar(title: String) {
        supportActionBar?.title = title
    }
}