package com.example.traduttore;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String[] listaCifreIta;
    String[] listaCifreEng;
    String[] listaCifreFra;
    int[] ListaImmagini;
    int pos1, nImg;

    Spinner cboItaliano;
    TextView lblCifraTradotta;
    ImageView imageViewer;
    Button traduci;
    RadioButton inglese;
    RadioButton francese;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cboItaliano = (Spinner) findViewById(R.id.cboItaliano);
        lblCifraTradotta = (TextView) findViewById(R.id.lblVisualizza);
        imageViewer = (ImageView) findViewById(R.id.imageView);
        traduci = (Button) findViewById(R.id.btnTraduci);
        inglese = (RadioButton) findViewById(R.id.rbtnInglese);
        francese = (RadioButton) findViewById(R.id.rbtnFrancese);
    }
}