#include <stdio.h>
#include <stdlib.h>


float massimo(FILE *fp){
    float massimo,num;
    int nn =0;
    while(fscanf(fp,"%f",&num)!=EOF){
                if(nn == 0){
                    massimo=num;
                }else if(massimo < num){
                    massimo=num;
                }
                nn++;
        }
    return massimo;
}

void main(){
    FILE *fp;
    float num,massimoF;
    float somma,media;
    int nn;
    char nomeFileIn[]="numeri.dat";
    char nomeFileOut[]="risultati.dat";
    fp=fopen(nomeFileIn,"r");
    if(fp==NULL){
        printf("non esiste il file\n");
    }else{
        nn=0;
        somma=0;
        while(fscanf(fp,"%f",&num)!=EOF){
                somma+=num;
                nn++;
        }
        fclose(fp);
        fp=fopen(nomeFileIn,"r");
        massimoF=massimo(fp);
        fclose(fp);
        fp=fopen(nomeFileOut,"w");
        fprintf(fp,"Massimo: %.2f\n",massimoF);
        fclose(fp);
        fp=fopen(nomeFileOut,"a");
        if(nn!=0){
            media=somma/nn;
            fprintf(fp,"media = %.2f",media);
            fprintf(stdout,"media %.2f",media);
        }else{
            fprintf(fp,"nessun numero",media);
            fprintf(stdout,"nessun numero",media);
        }
    }
    fclose(fp);
}