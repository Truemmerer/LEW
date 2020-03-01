package com.example.lew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        webView=findViewById(R.id.webviewid);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://linux-einsteiger-wiki.de");
    }
}
