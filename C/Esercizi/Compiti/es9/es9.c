/*
Author: Ferrando
Date: 
Es 9
*/

#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>
#include <math.h>

void inverti(int a){
    if(a==0) return;
	else {
		printf("%d", a%10);
		return inverti(a/10);
	}
    
}

void main(){
    int a;
    printf("inserire un numero: ");
    scanf("%d",&a);
    inverti(a);
    printf("\n");
}