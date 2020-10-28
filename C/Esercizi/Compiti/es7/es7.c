/*
Author: Ferrando
Date: 
Es 7
*/

#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>
#include <math.h>

void pot2(int *a){
    *a = (*a)*(*a);
}

void main(){
    int a;
    printf("inseire un numero: ");
    scanf("%d",&a);
    pot2(&a);
    printf("%d\n",a);
}