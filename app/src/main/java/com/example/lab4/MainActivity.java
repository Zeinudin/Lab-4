package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button buttonchangedname;
    ImageView avataricon;
    ImageButton universityicon;
    boolean flag = true;

    private final static String name = "Zeinundin";
    private final static String lastName = "Lirov";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        avataricon = (ImageView) findViewById(R.id.imageView);
        universityicon = (ImageButton) findViewById(R.id.imageButton);
        avataricon.setImageResource(R.drawable._0f44f24_2895_4dee_9c0c_afbaefd7d32f);
        universityicon.setImageResource(R.drawable.unnamed);
        buttonchangedname = (Button) findViewById(R.id.button_changed_name);


    }

    public void onMyButtonClick(View view) {
        String buttonContent = buttonchangedname.getText().toString();
        Toast toast;

        if (buttonContent.equals(name)) {
            buttonchangedname.setText(lastName);
            toast = Toast.makeText(getApplicationContext(), "My last name", Toast.LENGTH_LONG);
            toast.show();
            toast = Toast.makeText(getApplicationContext(), "I changed my name", Toast.LENGTH_LONG);
            toast.show();
        }

    }
    public void onMyImageButtonClick(View view) {
        universityicon.setBackgroundColor(Color.BLACK);
        Toast toast = Toast.makeText(getApplicationContext(), "My first name", Toast.LENGTH_SHORT);
        String buttonContent = buttonchangedname.getText().toString();

        if(buttonContent.equals(lastName)) {
            buttonchangedname.setText(name);
            toast.show();
        }

    }
}