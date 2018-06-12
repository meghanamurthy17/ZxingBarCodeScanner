package com.example.meghana.shopfriend;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by Meghana on 21-04-2018.
 */

public class icici extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.icici);
        WebView view=(WebView)this.findViewById(R.id.wicici);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl("http://m.icicibank.com/");

    }
}
