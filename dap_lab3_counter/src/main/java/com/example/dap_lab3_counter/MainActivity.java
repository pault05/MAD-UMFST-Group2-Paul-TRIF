package com.example.dap_lab3_counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int x = 0;
    TextView textView;
    Button btn_counter;
    Button btn_message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        btn_counter = findViewById(R.id.button_count);
        btn_message = findViewById(R.id.button_message);

        btn_counter.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
            x++;
            textView.setText(String.valueOf(x));

            }
        });

        btn_message.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You pressed the button!", Toast.LENGTH_SHORT).show();
            }
        });


    }
}