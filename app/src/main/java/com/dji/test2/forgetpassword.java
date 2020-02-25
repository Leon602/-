package com.dji.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.view.View;

public class forgetpassword extends AppCompatActivity {
    ImageButton imageButton5 ,imageButton3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgetpassword);
        imageButton3=findViewById(R.id.nextpage);
        imageButton5=findViewById(R.id.goback);

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent();
                intent.setClass(forgetpassword.this,sign2.class);
                startActivity(intent);
            }
        });
        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent();
                intent.setClass(forgetpassword.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }

}

