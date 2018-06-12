package com.example.meghana.shopfriend;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.StrictMode;
import android.os.SystemClock;
import android.support.design.widget.TextInputEditText;
import android.support.v7.widget.Toolbar;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;

import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;


/**
 * Created by Meghana on 23-03-2018.
 */

public class BillPage extends Activity implements ZXingScannerView.ResultHandler{
private ZXingScannerView scanView;
private EditText input;

String barno;
String no="978071818554";
int sum=0;
int count=0;
String[] name={"How_to_be_a_bawse","Lays","Snickers","Kit-Kat","water-bottle"};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bill);
        Button b45=(Button)findViewById(R.id.b45);
        b45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BillPage.this,OnlineSite.class);
                startActivity(intent);
            }
        });
        Button bscan=(Button)findViewById(R.id.bscan);
        bscan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scanView=new ZXingScannerView(BillPage.this);
                setContentView(scanView);
                scanView.setResultHandler(BillPage.this);
                scanView.startCamera();
            }

        });

    }




    protected void onPause(){
        super.onPause();
        scanView.stopCamera();
    }
    @Override
    public void handleResult(final Result result1) {
Log.v("handleResult",result1.getText());
Log.e("handleResult", result1.getBarcodeFormat().toString());

        barno=result1.getText();
          if (barno.equals("490590104903")) {
              sum = sum + 719;
              count = 0;
          }
            else if (barno.equals("028400160148")) {
                sum = sum + 9;
                count = 1;
            }
            else if (barno.equals("040000002635")) {
                sum = sum + 18;
                count = 2;

            }
            else if (barno.equals("034000002467")) {
                sum = sum + 36;
                count = 3;

            }
            else if (barno.equals("8906017290033")) {
                sum = sum + 18;
                count = 4;

            }

        final AlertDialog.Builder builder=new AlertDialog.Builder(this);
                builder.setTitle("Scan Result:");

// Add the buttons
        builder.setPositiveButton("Scan again", new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int id){
                    setContentView(scanView);
                    //scanView.setResultHandler(this);
                    scanView.startCamera();


                }

        });
        builder.setNegativeButton("Proceed", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                // User cancelled the dialog
                Intent intent1=new Intent(BillPage.this,BillPage.class);
                startActivity(intent1);
            }
        });
switch (count){
    case 0:
        builder.setMessage("Product:"+name[0]+" \n Price:799\n Total_Sum:"+String.valueOf(sum));
        break;
    case 1:
        builder.setMessage("Product:"+name[1]+" \n Price:10\n Offer price:9\n Total_Sum: "+String.valueOf(sum));
        break;
    case 2:
        builder.setMessage("Product:"+name[2]+" \n Price:20\n Offer price:18\nTotal_Sum:"+String.valueOf(sum));
        break;
    case 3:
        builder.setMessage("Product:"+name[3]+" \n Price:40\n Offer price:36\nTotal_Sum:"+String.valueOf(sum));
        break;
    case 4:
        builder.setMessage("Product:"+name[4]+" \n Price:20\nOffer price:18" +
                "\n Total_Sum:"+String.valueOf(sum));
        break;
}

        final AlertDialog alertDialog=builder.create();

        alertDialog.show();
        // Resume Scanning
        SystemClock.sleep(1000);
        scanView.resumeCameraPreview(this);
scanView.stopCamera();

    }



}
