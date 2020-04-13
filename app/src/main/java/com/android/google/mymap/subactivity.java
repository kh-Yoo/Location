package com.android.google.mymap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class subactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subactivity);

        TextView tx1 = (TextView)findViewById(R.id.textview1);
        Intent intent = getIntent(); /*데이터 수신*/

        String location = intent.getExtras().getString("location"); /*String형*/
        tx1.setText(location);
    }
}
