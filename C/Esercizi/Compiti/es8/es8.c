/*
Author: Ferrando
Date: 
Es 8
*/

#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>
#include <math.h>

void pot2(int *a){
    *a = (*a)*(*a);
}


float ipo(int a,int b){
    float ipo;
    pot2(&a);
    pot2(&b);
    ipo=sqrt(a+b);
    return ipo;
}

void main(){
    int a,b;
    float i;
    printf("Inseire un cateto: ");
    scanf("%d",&a);
    printf("Inserire un cateto: ");
    scanf("%d",&b);
    i=ipo(a,b);
    printf("%f\n",i);
}