package com.example.emicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CaculterActivity extends AppCompatActivity {


    EditText EMIamount,EMIrate,EMItime;

    TextView textviewcalculate,textTinterest,Tamount,Resent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caculter);
        initview();
    }

    private void initview() {

            EMIamount=findViewById(R.id.EMIamount);
            EMIrate=findViewById(R.id.EMIrate);
            EMItime=findViewById(R.id.EMItime);
            textTinterest=findViewById(R.id.textTinterest);
            textviewcalculate=findViewById(R.id.textviewcalculate);
            Tamount=findViewById(R.id.Tamount);
            Resent=findViewById(R.id.Resent);

            textviewcalculate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Integer p=Integer.parseInt(EMIamount.getText().toString());
                    Integer r=Integer.parseInt(EMIrate.getText().toString());
                    Integer n=Integer.parseInt(EMItime.getText().toString());

                    Float Totalrate = Float.valueOf(((p*r)/100));

                    String totalint = String.valueOf(Totalrate);
                    textTinterest.setText(Float.toString(Float.parseFloat(totalint)));

                    float total =p+Totalrate;
                    String totalamt = String.valueOf(total);
                    Tamount.setText(totalamt);



                }
            });
            Resent.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    EMIamount.setText(null);
                    EMIrate.setText(null);
                    EMItime.setText(null);

                }
            });
        }
    }