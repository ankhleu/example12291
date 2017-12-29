package com.example1.student.example1229_1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void click1(View v)
    {
        Intent it=new Intent();
        it.setAction(Intent.ACTION_SEND);
        it.setType("text/plain");
        it.putExtra(Intent.EXTRA_TEXT,"測試文test/test");
        startActivity(it);
        Log.d("Log","this is on create");
    }

    public void click2(View v)
    {
            Intent it=new Intent();
            it.setAction(Intent.ACTION_SEND);
            it.setType("image/jpeg");
            Uri uri=Uri.parse("android.resource://"+getApplicationContext().getPackageName()+"/"+R.drawable.jptrip);
            it.putExtra(Intent.EXTRA_STREAM,uri);
            startActivity(it);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Log","this is onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Log","this is onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Log","this is onDestroy");
    }
}
