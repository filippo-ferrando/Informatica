package com.example.radioui;



import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnInvia = (Button) findViewById(R.id.btnInvia);
        EditText txtNome = (EditText) findViewById(R.id.txtNome);
        EditText txtEta = (EditText) findViewById(R.id.txtEta);
        EditText txtMail = (EditText) findViewById(R.id.txtMail);
        RadioButton optInformatica = (RadioButton) findViewById(R.id.optInformatica);
        RadioButton optElettronica = (RadioButton) findViewById(R.id.optElettronica);
        RadioButton optMeccanica = (RadioButton) findViewById(R.id.optMeccanica);
        CheckBox chkSport = (CheckBox) findViewById(R.id.chkSport);
        CheckBox chkMusica = (CheckBox) findViewById(R.id.chkMusica);
        CheckBox chkTeatro = (CheckBox) findViewById(R.id.chkTeatro);



        btnInvia.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String message;
                String aggiunta = "";
                message = txtNome.getText() + "\n" + txtEta.getText() + "\n" + txtMail.getText() + "\n";



                if (optInformatica.isChecked()) message += optInformatica.getText() + "\n";
                if (optMeccanica.isChecked()) message += optMeccanica.getText() + "\n";
                if (optElettronica.isChecked()) message += optElettronica.getText() + "\n";

                if(chkMusica.isChecked()) aggiunta += chkMusica.getText() + ", ";
                if(chkSport.isChecked()) aggiunta += chkSport.getText() + ", ";
                if(chkTeatro.isChecked()) aggiunta += chkTeatro.getText() + ", ";
                if(!aggiunta.isEmpty())
                    message += "Hobbies = " + aggiunta;

                android.app.AlertDialog.Builder dialog;
                dialog = new android.app.AlertDialog.Builder(MainActivity.this);

                dialog.setTitle("Dati inseriti: ");
                dialog.setMessage(message);
                dialog.show();

            }
        });


    }
}