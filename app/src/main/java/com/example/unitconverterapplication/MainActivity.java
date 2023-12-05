package com.example.unitconverterapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button btn;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.edit_text);
        textView = findViewById(R.id.text_view);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // get user input
                String inputText = editText.getText().toString();
                // convert user input(string) into double
                double kilos = Double.parseDouble(inputText);
                // convert kilos to pounds
                double pounds = makeConversion(kilos);
                // display data to the user
                textView.setText("" +pounds);
            }
        });
    }

    public double makeConversion(double kilos){
        return kilos * 2.20462;
    }
}