package com.goqw.dentalclinic

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

/**
 * Minimal GoQw app: a single screen whose WebView loads the web app
 * the bot generated (see README — the bot replaces https://mdirfanahmedrabbe-design.github.io/goqw-dental-clinic/ with
 * the site's live URL, e.g. https://<name>.netlify.app/).
 *
 * Choice: WebView wrapper (not a native screen). The bot already
 * builds the whole app as a website, so the APK is a thin shell around
 * that site — one codebase serves both the browser app and the APK.
 */
class MainActivity : AppCompatActivity() {

    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView = findViewById(R.id.webview)
        webView.webViewClient = WebViewClient()
        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true
        webView.loadUrl("https://mdirfanahmedrabbe-design.github.io/goqw-dental-clinic/")
    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        if (::webView.isInitialized && webView.canGoBack()) {
            webView.goBack()
        } else {
            super.onBackPressed()
        }
    }
}
