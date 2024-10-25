package com.example.statemanagementapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import android.widget.CheckBox;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    private TextView textViewCount;
    private Button buttonIncrement;
    EditText editText;
    CheckBox ch;
    private Switch switch1;

    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Button buttonIncrement = findViewById(R.id.buttonIncrement);
        editText = findViewById(R.id.EditText);
        ch = findViewById(R.id.checkBox);
        textViewCount = findViewById(R.id.textViewCount);
        Switch switch1= findViewById(R.id.switch1);
        TextView TextView2 = findViewById(R.id.TextView2);




        ch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked) {
                    TextView2.setVisibility(View.VISIBLE);
                }else {
                    TextView2.setVisibility(View.GONE);
                }
            }
        });



        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked) {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                }else {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                }
            }
        });

        buttonIncrement.setOnClickListener(v -> {
            count++;
            textViewCount.setText(String.valueOf(count));
        });
        
            }
        }

