package com.example.visualizzatoreimmagini;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ArrayList<Integer> listaImmagini;
    int pos;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pos=0;
        listaImmagini=new ArrayList<Integer>();

        Button btnAvanti=(Button)findViewById(R.id.btnForwardImg);
        Button btnIndietro=(Button)findViewById(R.id.btnImgBackward);
        btnAvanti.setOnClickListener(this);
        btnIndietro.setOnClickListener(this);
        caricaImmagini();
        img=(ImageView)findViewById(R.id.imageView);
        img.setImageResource(listaImmagini.get(0));
        btnIndietro.setEnabled(false);
    }


    @Override
    public void onClick(View v) {
        int len=listaImmagini.size();
        if(v.getId()==R.id.btnForwardImg){
            if(pos<len-1)
                pos++;
        }
        else {
            if(pos>0)
                pos--;
        }
        Button btnAvanti=(Button)findViewById(R.id.btnForwardImg);
        Button btnIndietro=(Button)findViewById(R.id.btnImgBackward);
        img.setImageResource(listaImmagini.get(pos));
        if(pos==len-1){
            btnAvanti.setEnabled(false);
        }
        else
            btnAvanti.setEnabled(true);

        if(pos==0)
            btnIndietro.setEnabled(false);
        else
            btnIndietro.setEnabled(true);
    }

    public void caricaImmagini(){
        int id;
        int i=1;
        do{
            id = this.getResources().getIdentifier("img" + i, "mipmap", "visualizzatoreimmagini");
            if(id!=0)
                listaImmagini.add(id);
            i++;
        }while(id!=0);
    }

}