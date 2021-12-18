package com.example.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText user_field;
    private Button main_btn;
    private TextView result_info;
    //https://youtu.be/zzV2aML_zNg

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user_field = findViewById(R.id.User_Field);
        main_btn = findViewById(R.id.main_btn);
        result_info = findViewById(R.id.result_info);

        main_btn.setOnClickListener(new View.OnClickListener()
        {@Override
            public void onClick(View view) {
            if (user_field.getText().toString().trim().equals(""))
                Toast.makeText(MainActivity.this, R.string.vvedite_text, Toast.LENGTH_LONG).show();
            else {

            }
        }
        });
    }
}