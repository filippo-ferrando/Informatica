package com.example.ferrando_filippo_verificamorse;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

import android.os.Bundle;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity
        implements AdapterView.OnItemSelectedListener {

    String[] alfabetoNato;
    String[] alfabetoMorse;
    String[] alfabeto;

    final int maxMorseCharacter = 5;

    int[] ListaIdAlfabeto;
    int pos, nAlfabeto;

    Spinner cboAlfabeto;

    EditText traduzioneNato = (EditText) findViewById(R.id.txtTraduzioneNato);

    RadioButton rb1Primo = (RadioButton) findViewById(R.id.rb1Primo);
    RadioButton rb2Primo = (RadioButton) findViewById(R.id.rb2Primo);
    RadioButton rb3Primo = (RadioButton) findViewById(R.id.rb3Primo);
    RadioButton rb1Secondo = (RadioButton) findViewById(R.id.rb1Secondo);
    RadioButton rb2Secondo = (RadioButton) findViewById(R.id.rb2Secondo);
    RadioButton rb3Secondo = (RadioButton) findViewById(R.id.rb3Secondo);
    RadioButton rb1Terzo = (RadioButton) findViewById(R.id.rb1Terzo);
    RadioButton rb2Terzo = (RadioButton) findViewById(R.id.rb2Terzo);
    RadioButton rb3Terzo = (RadioButton) findViewById(R.id.rb3Terzo);
    RadioButton rb1Quarto = (RadioButton) findViewById(R.id.rb1Quarto);
    RadioButton rb2Quarto = (RadioButton) findViewById(R.id.rb2Quarto);
    RadioButton rb3Quarto = (RadioButton) findViewById(R.id.rb3Quarto);
    RadioButton rb1Quinto = (RadioButton) findViewById(R.id.rb1Quinto);
    RadioButton rb2Quinto = (RadioButton) findViewById(R.id.rb2Quinto);
    RadioButton rb3Quinto = (RadioButton) findViewById(R.id.rb3Quinto);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alfabeto = getResources().getStringArray(R.array.array_alfabeto);
        alfabetoMorse = getResources().getStringArray(R.array.array_morse);
        alfabetoNato = getResources().getStringArray(R.array.array_nato);

        cboAlfabeto = (Spinner) findViewById(R.id.cboAlfabeto);


        ListaIdAlfabeto = new int [alfabeto.length];
        cboAlfabeto.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);

    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        traduzioneNato.setText(alfabetoNato[position]);

        for (int k=0; k<maxMorseCharacter; k++){
            if(alfabetoMorse[position].charAt(k) == '*' && k==0){
                rb1Primo.setChecked(false);
                rb2Primo.setChecked(true);
                rb3Primo.setChecked(false);
            }
            if(alfabetoMorse[position].charAt(k) == '-' && k==0){
                rb1Primo.setChecked(true);
                rb2Primo.setChecked(false);
                rb3Primo.setChecked(false);
            }
            if(alfabetoMorse[position].charAt(k) == '_' && k==0){
                rb1Primo.setChecked(false);
                rb2Primo.setChecked(false);
                rb3Primo.setChecked(true);
            }

            if(alfabetoMorse[position].charAt(k) == '*' && k==1){
                rb1Secondo.setChecked(false);
                rb2Secondo.setChecked(true);
                rb3Secondo.setChecked(false);
            }
            if(alfabetoMorse[position].charAt(k) == '-' && k==1){
                rb1Secondo.setChecked(true);
                rb2Secondo.setChecked(false);
                rb3Secondo.setChecked(false);
            }
            if(alfabetoMorse[position].charAt(k) == '_' && k==1){
                rb1Secondo.setChecked(false);
                rb2Secondo.setChecked(false);
                rb3Secondo.setChecked(true);
            }

            if(alfabetoMorse[position].charAt(k) == '*' && k==2){
                rb1Terzo.setChecked(false);
                rb2Terzo.setChecked(true);
                rb3Terzo.setChecked(false);
            }
            if(alfabetoMorse[position].charAt(k) == '-' && k==2){
                rb1Terzo.setChecked(true);
                rb2Terzo.setChecked(false);
                rb3Terzo.setChecked(false);
            }
            if(alfabetoMorse[position].charAt(k) == '_' && k==2){
                rb1Terzo.setChecked(false);
                rb2Terzo.setChecked(false);
                rb3Terzo.setChecked(true);
            }

            if(alfabetoMorse[position].charAt(k) == '*' && k==3){
                rb1Quarto.setChecked(false);
                rb2Quarto.setChecked(true);
                rb3Quarto.setChecked(false);
            }
            if(alfabetoMorse[position].charAt(k) == '-' && k==3){
                rb1Quarto.setChecked(true);
                rb2Quarto.setChecked(false);
                rb3Quarto.setChecked(false);
            }
            if(alfabetoMorse[position].charAt(k) == '_' && k==3){
                rb1Quarto.setChecked(false);
                rb2Quarto.setChecked(false);
                rb3Quarto.setChecked(true);
            }

            if(alfabetoMorse[position].charAt(k) == '*' && k==4){
                rb1Quinto.setChecked(false);
                rb2Quinto.setChecked(true);
                rb3Quinto.setChecked(false);
            }
            if(alfabetoMorse[position].charAt(k) == '-' && k==4){
                rb1Quinto.setChecked(true);
                rb2Quinto.setChecked(false);
                rb3Quinto.setChecked(false);
            }
            if(alfabetoMorse[position].charAt(k) == '_' && k==4){
                rb1Quinto.setChecked(false);
                rb2Quinto.setChecked(false);
                rb3Quinto.setChecked(true);
            }
        }


    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}