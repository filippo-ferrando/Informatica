package com.example.convertitoreliquidi;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    final double cambioLitroGallone = 3.785;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLitriGalloni = (Button) findViewById(R.id.btnLitriGalloni);
        Button btnGalloniLitri = (Button) findViewById(R.id.btnGalloniLitri);

        btnGalloniLitri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GalloniToLitri(v);
            }
        });

        btnLitriGalloni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LitriToGalloni(v);
            }
        });
    }

    protected void GalloniToLitri(View v){
        EditText txtLitri = (EditText) findViewById(R.id.txtLitri);
        EditText txtGalloni = (EditText) findViewById(R.id.txtGalloni);
        double galloni = Double.parseDouble(txtGalloni.getText().toString());
        double litro = galloni * cambioLitroGallone;
        txtLitri.setText(String.valueOf(litro));
    }

    protected void LitriToGalloni(View v){
        EditText txtLitri = (EditText) findViewById(R.id.txtLitri);
        EditText txtGalloni = (EditText) findViewById(R.id.txtGalloni);
        double litro = Double.parseDouble(txtLitri.getText().toString());
        double galloni = litro / cambioLitroGallone;
        txtGalloni.setText(String.valueOf(galloni));
    }

}