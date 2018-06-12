package com.example.meghana.shopfriend;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.ActivityChooserView;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

/**
 * Created by Meghana on 20-04-2018.
 */

public class OnlineSite extends Activity {
    Button b1,b2,b3,b4,b5;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onlinesite);
        b1=(Button)findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(OnlineSite.this,paytm.class);
                startActivity(intent2);
            }
        });
        b2=(Button)findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(OnlineSite.this,tez.class);
                startActivity(intent2);
            }
        });
        b3=(Button)findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(OnlineSite.this,sbi.class);
                startActivity(intent2);
            }
        });
        b4=(Button)findViewById(R.id.b4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(OnlineSite.this,icici.class);
                startActivity(intent2);
            }
        });
        b5=(Button)findViewById(R.id.b5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(OnlineSite.this,hdfc.class);
                startActivity(intent2);
            }
        });
    }
}
