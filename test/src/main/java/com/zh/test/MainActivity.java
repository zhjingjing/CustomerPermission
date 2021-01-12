package com.zh.test;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View view) {
        if (ActivityCompat.checkSelfPermission(this,"com.zh.permission.auth")== PackageManager.PERMISSION_GRANTED){
            launch();
        }else{
            ActivityCompat.requestPermissions(this,new String[]{"com.zh.permission.auth"},1101);
        }
    }

    private void  launch(){
        Intent intent = new Intent();
        intent.setClassName("com.zh.permission","com.zh.permission.PrivateActivity");
        intent.putExtra("desc","这是来自与test的调用");
        startActivity(intent);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode==1101&&grantResults[0]==PackageManager.PERMISSION_GRANTED){
            launch();
        }
    }
}
