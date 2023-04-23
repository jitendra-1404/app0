package com.example.game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login extends AppCompatActivity {

    Intent intent;
    EditText e1,e2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        e1 = findViewById(R.id.et1);
        e2 = findViewById(R.id.et2);
        b1 = findViewById(R.id.b);
        intent = new Intent(this,MainActivity.class);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("pl1",e1.getText().toString());
                intent.putExtra("pl2",e2.getText().toString());
                startActivity(intent);
            }
        });

    }
}