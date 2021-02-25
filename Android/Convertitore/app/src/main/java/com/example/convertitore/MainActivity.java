package com.example.convertitore;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    final double cambioEuroLira = 1936.27;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnEuroLire = (Button) findViewById(R.id.btnEuroLire);
        Button btnLireEuro = (Button) findViewById(R.id.btnLireEuro);

        btnLireEuro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                liraToEuro(v);
            }
        });

        btnEuroLire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                euroToLire(v);
            }
        });
    }

    protected void liraToEuro(View v){
        EditText txtLira = (EditText) findViewById(R.id.txtLira);
        EditText txtEuro = (EditText) findViewById(R.id.txtEuro);
        double lira = Double.parseDouble(txtLira.getText().toString());
        double euro = lira / cambioEuroLira;
        txtEuro.setText(String.valueOf(euro));
    }

    protected void euroToLire(View v){
        EditText txtLira = (EditText) findViewById(R.id.txtLira);
        EditText txtEuro = (EditText) findViewById(R.id.txtEuro);
        double euro = Double.parseDouble(txtEuro.getText().toString());
        double lira = euro * cambioEuroLira;
        txtLira.setText(String.valueOf(lira));
    }

}