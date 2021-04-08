package com.example.visualizzatoreconspinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

//import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    //ArrayList<Integer> listaImmagini;

    String[] listaNomiImmagini;
    int[] listaIdImmagini;
    int pos1, nImg;

    ImageView imageViewer;
    Spinner cboImmagini;
    Button btnPrecedente;
    Button btnSuccessiva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pos1 =0; nImg=0;
        //listaImmagini=new ArrayList<Integer>();
        btnSuccessiva=(Button)findViewById(R.id.btnSuccessiva);
        btnPrecedente=(Button)findViewById(R.id.btnPrecedente);
        ArrayAdapter<String> spinnerAdapter;

        listaNomiImmagini = getResources().getStringArray(R.array.descArray);
        listaIdImmagini= new int[listaNomiImmagini.length];

        //spinnerAdapter = new ArrayAdapter<String>(this,
        //        android.R.layout.simple_spinner_item, listaCombo);
        spinnerAdapter = new ArrayAdapter<String>(this,
                R.layout.text_view_item, listaNomiImmagini);

        cboImmagini = (Spinner) findViewById(R.id.cboImmagini);
        cboImmagini.setAdapter(spinnerAdapter);

        btnPrecedente.setOnClickListener(this);
        btnSuccessiva.setOnClickListener(this);
        cboImmagini.setOnItemSelectedListener(this);

        caricaImmagini();
        imageViewer = (ImageView) findViewById(R.id.imageViewer);
        btnSuccessiva.setEnabled(false);

    }

    public void caricaImmagini(){
        int id;
        int i=1;
        do{
            id = this.getResources().getIdentifier("img" + i,
                    "mipmap", "com.example.visualizzatoreconspinner");
            if(id!=0)
                listaIdImmagini[i-1]=id;
                //listaImmagini.add(id);
            i++;
        }while(id!=0);
        //nImg=listaImmagini.size();
        nImg=listaIdImmagini.length;
    }

    private void gestisciPulsanti(int pos){
        btnPrecedente.setEnabled(true);
        btnSuccessiva.setEnabled(true);
        if(pos == nImg-1)
            btnSuccessiva.setEnabled(false);

        if(pos == 0)
            btnPrecedente.setEnabled(false);
    }


    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btnSuccessiva){
            if(pos1 < nImg -1)
                pos1++;
        }
        else {
            if(pos1 > 0)
                pos1--;
        }
        //imageViewer.setImageResource(listaImmagini.get(pos1));
        imageViewer.setImageResource(listaIdImmagini[pos1]);
        cboImmagini.setSelection(pos1);
        gestisciPulsanti(pos1);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view,
                               int position, long id) {
        pos1=position;
        //imageViewer.setImageResource(listaImmagini.get(pos1));
        imageViewer.setImageResource(listaIdImmagini[pos1]);
        gestisciPulsanti(pos1);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
