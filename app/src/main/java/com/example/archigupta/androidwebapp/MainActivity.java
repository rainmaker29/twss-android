package com.example.archigupta.androidwebapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends Activity {

    private Button customButton;
    private Button urlButton;
    String url = "https://fathomless-wildwood-64610.herokuapp.com/";

    public void onCreate(Bundle savedInstanceState) {
        final Context context = this;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
                intent.putExtra("url", url);
                startActivity(intent);

//        urlButton = (Button)findViewById(R.id.url);
//        customButton = (Button) findViewById(R.id.custom_html_button);

//        urlButton.setOnClickListener(new OnClickListener() {
//
//            @Override
//            public void onClick(View arg0) {
//                Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
//                intent.putExtra("url", url);
//                startActivity(intent);
//            }
//
//        });
//        customButton.setOnClickListener(new OnClickListener() {
//
//            @Override
//            public void onClick(View arg0) {
//                Intent intent = new Intent(context, WebActivity.class);
//                startActivity(intent);
//            }
//
//        });
    }
}

