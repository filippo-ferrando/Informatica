#include <stdlib.h>
#include <stdio.h>

int inputN(){
    int n;
    do{
        printf("inserire un numero: ");
        scanf("%d",&n);
    }while(n<0);

    return n;
}

char inputCar(){
    char c;
    
    fflush(stdin);
    
    printf("inserire un carattere: ");
    scanf("%c",&c);
    
    return c;
}

void stampa(int n,char c){
    for(int k=0;k<n;k++){
        printf("%c",c);
    }
}

void quadrato(int n,char c){
    for(int k=0;k<n;k++){
        printf("\n\n");
        for(int j=0;j<n;j++){
            printf("%c",c);
        }
    }
    printf("\n");
}

void triangolo(int n,char c){
    for(int k=0;k<n;k++){
        printf("\n\n");
        for(int j=0;j<=k;j++){
            printf("%c",c);
        }
    }
    printf("\n");
}

void scax(){
    
}

void  main(){
    int n;
    char c;
    
    c=inputCar();
    n=inputN();

    printf("\n");

    stampa(n,c);
    quadrato(n,c);
    triangolo(n,c);
}