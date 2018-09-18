package com.example.mahru.assignment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate:Starting");
        Button btnrealtiveLayout =(Button) findViewById(R.id.button3);
      Button btnconstraintLayout=(Button) findViewById(R.id.button1);
        btnrealtiveLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG,"onclick:clicked realtivelayout");
                Intent intent=new Intent(MainActivity.this,relativeLayout.class);
                 startActivity(intent);

             }
        });
        btnconstraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG,"onclick:clicked constraintlayout");
                Intent intent1=new Intent(MainActivity.this,constraintLayout.class);
                startActivity(intent1);
            }
        });
    }
}
