package com.example.mahru.assignment2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class constraintLayout extends AppCompatActivity {
    private static final String TAG = "constraintLayout";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constraint_layout);
        Log.d(TAG,"oncreate: Starting");
        Button btn =(Button) findViewById(R.id.btnsignUp2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG,"on click: clicked signup 2");
                Intent intent=new Intent(constraintLayout.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
