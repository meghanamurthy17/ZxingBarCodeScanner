package com.example.meghana.shopfriend;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

/**
 * Created by Meghana on 27-03-2018.
 */

public class ListPage extends Activity {

        private ZXingScannerView scanView;
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.listviews);
            populateListView();
        }

    private void populateListView() {
        // Create list of items
        String[] myItems = {"Blue", "Green", "Purple", "Red"};

        // Build Adapter
        // TODO: CHANGE THE [[ to a less than, ]] to greater than.
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,     // Context for the activity.
                R.layout.listviews,  // Layout to use (create)
                myItems);   // Items to be displayed

        // Configure the list view.
        ListView list = (ListView) findViewById(R.id.lv1);
        list.setAdapter(adapter);
    }

    private void registerClickCallback() {
        ListView list = (ListView) findViewById(R.id.lv1);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {



            @Override
            // TODO: CHANGE THE [[ to a less than, ]] to greater than.
            public void onItemClick(AdapterView<?> paret, View viewClicked, int position, long id) {
                TextView textView = (TextView) viewClicked;
                String message = "You clicked # " + position
                        + ", which is string: " + textView.getText().toString();
                Toast.makeText(ListPage.this, message, Toast.LENGTH_LONG).show();
            }
        });
    }



}
