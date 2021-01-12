package com.zh.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View view) {
        Intent intent = new Intent();
        intent.setClassName("com.zh.permission","com.zh.permission.PrivateActivity");
        intent.putExtra("desc","这是来自与test的调用");
        startActivity(intent);
    }
}
