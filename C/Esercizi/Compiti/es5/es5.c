/*
Author: Ferrando
Date: 
Es 5
*/

#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>
#include <math.h>

bool isTriangolo(int a,int b,int c){
    if(a < b+c && b < a+c && c < a+b && a > abs(b-c) && b > abs(a-c) && c > abs(a-b)){
        return true;
    }else{
        return false;
    }
}

void main(){
    int a,b,c;
    printf("Inseire primo numero: ");
    scanf("%d",&a);
    printf("Inserire secondo numero: ");
    scanf("%d",&b);
    printf("insierire terzo numero: ");
    scanf("%d",&c);
    if(isTriangolo(a,b,c)==true){
        printf("Sono i lati di un triangolo\n");
    }else{
        printf("NO\n");
    }
}