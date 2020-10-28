/*
Author: Ferrando
Date: 
Es 6
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
bool isRettangolo(int a,int b,int c){
    int ipo;
    if(a > c && a > b){
        ipo=a;
        if(sqrt((b*b)+(c*c))==ipo){
            return true;
        }else{
            return false;
        }
    }else if(b > c){
        ipo=b;
        if(sqrt((a*a)+(c*c))==ipo){
            return true;
        }else{
            return false;
        }
    }else{
        ipo=c;
        if(sqrt((b*b)+(a*a
        ))==ipo){
            return true;
        }else{
            return false;
        }
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
        if(isRettangolo(a,b,c)==true){
            printf("e' un triangolo rettangolo\n");
        }else{
            printf("non puo' essere un triangolo rettangolo\n");
        }
    }else{
        printf("NO\n");
    }
}