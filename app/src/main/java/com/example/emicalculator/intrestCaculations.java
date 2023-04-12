package com.example.emicalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class intrestCaculations extends AppCompatActivity {


    AppCompatButton btnAmonunt,btnRate,btnDurestion,btnCaculate,btnReset;
    TextView txtValue,txtIntrest;
    ImageView imgBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intrest_caculations);
        initview();
    }

    private void initview() {
        btnAmonunt = findViewById(R.id.btnAmonunt);
        btnRate = findViewById(R.id.btnRate);
        btnDurestion = findViewById(R.id.btnDurestion);
        btnCaculate = findViewById(R.id.btnCaculate);
        btnReset = findViewById(R.id.btnReset);
        txtValue = findViewById(R.id.txtValue);
        txtIntrest = findViewById(R.id.txtIntrest);



        btnCaculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}