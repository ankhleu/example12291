package com.example1.student.example1229_1;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ImageView iv=(ImageView)findViewById(R.id.imageView);
        String uriString =getIntent().getExtras().get(Intent.EXTRA_STREAM).toString();
        iv.setImageURI(Uri.parse(uriString));


    }
}
