package com.example.meghana.shopfriend;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by Meghana on 21-04-2018.
 */

public class hdfc extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hdfc);
        WebView view=(WebView)this.findViewById(R.id.whdfc);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl("https://mobilebanking.hdfcbank.com/mobilebanking/");

    }
}
