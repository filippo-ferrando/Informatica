#include <stdio.h>
#include <stdlib.h>


void main(){
    FILE *fp;
    FILE *fc;

    float x = 0;
    float somma=0, media=0;
    int cnt = 0;

    fp = fopen("numeri.dat", "r");

    fc = fopen("risultati.dat", "w");
    

    if(fp == NULL){
        printf("Impossibile aprire il file in lettura");
    }else{
        while(fscanf(fp,"%f",&x) !=EOF){
            printf("%f\n", x);
            somma += x;
            cnt++;
        }
        if(cnt != 0){
            media = somma / cnt;
            fprintf(fc, "%f", &media);
        }
        
    }

    fclose(fp);
    fclose(fc);
}