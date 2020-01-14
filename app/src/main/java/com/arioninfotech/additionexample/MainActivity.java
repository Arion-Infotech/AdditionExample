package com.arioninfotech.additionexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtnumber1,txtnumber2,txtresult;
    Button btnSum;
    double number1,number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtnumber1=findViewById(R.id.txtnumber1);
        txtnumber2=findViewById(R.id.txtnumber2);
        txtresult=findViewById(R.id.txtresult);
        btnSum=findViewById(R.id.btnsum);
        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(txtnumber1.getText().toString().isEmpty() ){
                    Toast.makeText(getApplicationContext(),
                            "Please Enter First Number",Toast.LENGTH_LONG).show();
                }
                else if(txtnumber2.getText().toString().isEmpty() ){
                    Toast.makeText(getApplicationContext(),
                            "Please Enter Second Number",Toast.LENGTH_LONG).show();
                }
                else{
                    number1=Double.parseDouble(txtnumber1.getText().toString());
                    number2=Double.parseDouble(txtnumber2.getText().toString());

                    txtresult.setText(""+(number1+number2));
                }
            }
        });
    }  }
