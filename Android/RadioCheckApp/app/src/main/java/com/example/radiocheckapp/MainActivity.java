package com.example.radiocheckapp;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnInvia = (Button) findViewById(R.id.btnInvia);
        EditText txtNome = (EditText) findViewById(R.id.txtNome);
        EditText txtEta = (EditText) findViewById(R.id.txtEta);
        EditText txtMail = (EditText) findViewById(R.id.txtMail);
        RadioButton optInformatica = (RadioButton) findViewById(R.id.optInformatica);
        RadioButton optElettrotecnica = (RadioButton) findViewById(R.id.optElettrotecnica);
        RadioButton optMeccanica = (RadioButton) findViewById(R.id.optMeccanica);
        RadioButton optRobotica = (RadioButton) findViewById(R.id.optRobotica);
        RadioButton optChimica = (RadioButton) findViewById(R.id.optChimica);
        CheckBox chkSport = (CheckBox) findViewById(R.id.chkSport);
        CheckBox chkMusica = (CheckBox) findViewById(R.id.chkMusica);
        CheckBox chkTeatro = (CheckBox) findViewById(R.id.chkTeatro);


        btnInvia.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String messaggio;
                String aggiunta = "";

                messaggio = txtNome.getText() + "\n" + txtEta.getText() + "\n" +
                        txtMail.getText() + "\n";
                //optInformatica.setActivated(true);
                if (optInformatica.isChecked()) messaggio += optInformatica.getText()+ "\n";
                if (optMeccanica.isChecked()) messaggio += optMeccanica.getText()+ "\n";
                if (optElettrotecnica.isChecked()) messaggio += optElettrotecnica.getText()+ "\n";
                if (optRobotica.isChecked()) messaggio += optRobotica.getText()+ "\n";
                if (optChimica.isChecked()) messaggio += optChimica.getText()+ "\n";

                if (chkSport.isChecked()) aggiunta += chkSport.getText() + ", ";
                if (chkMusica.isChecked()) aggiunta += chkMusica.getText() + ", ";
                if (chkTeatro.isChecked()) aggiunta += chkTeatro.getText() + ", ";
                if (!aggiunta.isEmpty())
                    messaggio += "Hobbies = " +aggiunta;

                android.app.AlertDialog.Builder dialog;
                dialog = new android.app.AlertDialog.Builder(MainActivity.this );
                dialog.setTitle("Dati immessi");
                dialog.setMessage(messaggio);
                dialog.show();
            }
        });

    }
}