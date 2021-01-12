package com.zh.permission;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class PrivateActivity extends AppCompatActivity {

    public static void launch(Context context,String desc){
        Intent intent=new Intent(context,PrivateActivity.class);
        intent.putExtra("desc",desc);
        context.startActivity(intent);
    }

    private TextView tvPrivate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_private);
        tvPrivate=findViewById(R.id.tv_private);
        tvPrivate.setText(getIntent().getStringExtra("desc"));
    }
}
