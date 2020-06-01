package com.example.listviewandwebview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

public class Main2Activity extends AppCompatActivity {
    WebView w;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        w = (WebView) findViewById(R.id.web);
        Intent i = getIntent();
        Bundle b = i.getExtras();
        String data = b.getString("a");
        w.loadUrl("https://" + data);
    }
}
