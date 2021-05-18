package com.example.lesson7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    WebView w1;
    EditText e1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        w1 = (WebView) findViewById(R.id.w1);
        w1.getSettings().setJavaScriptEnabled(true);
        w1.setWebViewClient(new MyWebViewClient());
        e1 = (EditText) findViewById(R.id.e1);

    }

    public void sendToUrl(View view) {
        String url = e1.getText().toString();
        w1.loadUrl(url);
    }

    private class MyWebViewClient extends WebViewClient {
        public boolean shouldOverideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}