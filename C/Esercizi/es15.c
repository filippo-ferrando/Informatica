#include <stdio.h>
#include <stdio.h>
#include <string.h>
#include <math.h>

#define LUNG 100

int inserisciPositivo(){
    int n;
    do{
        printf("inserisci un numero positivo: ");
        scanf("%d", &n);
    }while(n < 0 || LUNG - 1);
    return n;
}


void stringaRandom(int n, char s[LUNG]){
    srand(time(NULL));
    for(int k=0;k<n;k++){
        s[k]= rand()%(126-32+1)+32;
    }
    s[n]='\0';

}



void main(){
    int nCar;
    char stringa[LUNG];
    nCar =inserisciPositivo;
    stringaRandom(nCar, stringa);
    printf("%s", stringa);

}