package com.example.toggleswitch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ToggleButton tb;
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    Switch sb;
    Button btn;
    ConstraintLayout cl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tb = findViewById(R.id.TB1);
        sb = findViewById(R.id.SB1);
        btn = findViewById(R.id.BTN);
        cl = findViewById(R.id.CL);

    }

    public void Pressed(View view) {
        if(tb.isChecked()){
            if(sb.isChecked()){
                cl.setBackgroundResource(R.drawable.green);
            }
            else{
                cl.setBackgroundResource(R.drawable.red);
            }
        }
        else{
            if(sb.isChecked()){
                cl.setBackgroundResource(R.drawable.blue);
            }
            else{
                cl.setBackgroundResource(R.drawable.purple);
            }
        }
    }
}