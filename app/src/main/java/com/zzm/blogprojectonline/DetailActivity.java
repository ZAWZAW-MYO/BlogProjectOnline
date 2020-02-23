package com.zzm.blogprojectonline;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        WebView webView=findViewById(R.id.newsDeatails);

//        Get data from main activity//
        Bundle b= getIntent().getExtras();
        String url=b.getString("url");
        webView.loadUrl(url);
        webView.getSettings().setJavaScriptEnabled(true);

    }
}
