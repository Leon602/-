package com.dji.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    private Button btnlogin;
    private TextView txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnlogin=(Button)findViewById(R.id.login);
        btnlogin.setOnClickListener(AA);
        TextView textView = (TextView) findViewById(R.id.textView);

        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
    View.OnClickListener AA = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this,Main2Activity.class );

            startActivity(intent);

        }
    };
}
