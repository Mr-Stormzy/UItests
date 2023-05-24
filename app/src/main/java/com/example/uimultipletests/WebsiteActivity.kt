package com.example.uimultipletests

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class WebsiteActivity : AppCompatActivity() {
    lateinit var webpage:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_website)
        webpage = findViewById(R.id.mweb)
        var settings = webpage.settings
        settings.javaScriptEnabled = true
        webpage.loadUrl("https://www.emobilis.ac.ke")
    }
}