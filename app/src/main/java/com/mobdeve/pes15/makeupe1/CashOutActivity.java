package com.mobdeve.pes15.makeupe1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CashOutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cash_out);
        getSupportActionBar().hide();
        ImageView villarica_img = findViewById(R.id.villarica_img);
        ImageView tambunting_img = findViewById(R.id.tambunting_img);
        ImageView pp_img = findViewById(R.id.pp_img);
        ImageView puregold_img = findViewById(R.id.puregold_img);
        ImageView bayad_img = findViewById(R.id.bayad_img);

        ImageView cashout_img = findViewById(R.id.cashout_img);
        cashout_img.setVisibility(View.GONE);

        villarica_img.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                cashout_img.setVisibility(View.VISIBLE);
                cashout_img.setImageResource(R.drawable.villarica);
            }
        });
        tambunting_img.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                cashout_img.setVisibility(View.VISIBLE);
                cashout_img.setImageResource(R.drawable.tambunting);
            }
        });
        pp_img.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                cashout_img.setVisibility(View.VISIBLE);
                cashout_img.setImageResource(R.drawable.palawanpawnshop);
            }
        });
        puregold_img.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                cashout_img.setVisibility(View.VISIBLE);
                cashout_img.setImageResource(R.drawable.puregold);
            }
        });
        bayad_img.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                cashout_img.setVisibility(View.VISIBLE);
                cashout_img.setImageResource(R.drawable.bayad_center_logo_png_3);
            }
        });



    }
}