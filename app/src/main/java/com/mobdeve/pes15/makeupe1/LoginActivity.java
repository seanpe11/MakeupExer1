package com.mobdeve.pes15.makeupe1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EditText number_etv = findViewById(R.id.number_etv);
        Intent dataIntent = getIntent();
        String number = dataIntent.getStringExtra("NUMBER");
        number_etv.setText(number);


        Button actual_login_btn = findViewById(R.id.actual_login_btn);
        actual_login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number_etv.getText().toString().length() != 11){
                    Toast.makeText(getApplicationContext(), "Please make sure the number is in 11 digit format",Toast.LENGTH_SHORT).show();
                } else {
                    Intent i = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(i);
                    finish();
                }
            }
        });


    }
}