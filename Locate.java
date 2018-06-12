package com.example.meghana.shopfriend;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Created by Meghana on 23-03-2018.
 */

public class Locate extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.locate);
        ImageView i=(ImageView)findViewById(R.id.imageView2);
        i.setImageResource(R.drawable.connected_smart_market);

    }
}
