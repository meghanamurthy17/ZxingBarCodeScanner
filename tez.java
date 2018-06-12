package com.example.meghana.shopfriend;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by Meghana on 21-04-2018.
 */

public class tez extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tez);
        WebView view=(WebView)this.findViewById(R.id.wtez);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl("https://tez.google.com/");

    }
}
