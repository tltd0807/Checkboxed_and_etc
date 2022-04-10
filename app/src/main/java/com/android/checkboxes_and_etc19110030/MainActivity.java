package com.android.checkboxes_and_etc19110030;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox cb1,cb2,cb3,cb4,cb5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setContentView(R.layout.activity_main);
        cb1= findViewById(R.id.chocolate);
        cb2= findViewById(R.id.sprinkles);
        cb3= findViewById(R.id.crushed);
        cb4= findViewById(R.id.cherries);
        cb5= findViewById(R.id.orio);

    }

    public void onShowToastButtonClicked(View view) {
        String mess="Toping: ";
        if(cb1.isChecked()) mess+=" Chocolate syrup";
        if(cb2.isChecked()) mess+=" Sprinkles";
        if(cb3.isChecked()) mess+=" Crushed nuts";
        if(cb4.isChecked()) mess+=" Cherries";
        if(cb5.isChecked()) mess+=" Orio cookie crumbles";
        Toast.makeText(this, mess, Toast.LENGTH_SHORT).show();

    }
}