package com.example.mahru.assignment2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class relativeLayout extends AppCompatActivity{
    private static final String TAG = "relativeLayout";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout);
        Log.d(TAG,"oncreate: Starting");
        Button gotoMain =(Button ) findViewById(R.id.btnsignUp1);
         gotoMain.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Log.d(TAG,"on click: clicked signup 1");
                 Intent intent=new Intent(relativeLayout.this,MainActivity.class);
                 startActivity(intent);
             }
         });
    }
}
