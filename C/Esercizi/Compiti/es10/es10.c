/*
Author: Ferrando
Date: 
Es 9
*/

#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>
#include <math.h>

void crescenti(int *x, int *y,int *z){
    int a,b,c;
    a=*x;
    b=*y;
    c=*z;
    if(a<b && b<c){
        printf("sono gia' in ordine crecente \n");
    }else{
        if(a<c && c<b){
            *x=a;
            *y=c;
            *z=b;
        }else{
            if(b<a&&a<c){
                *x=b;
                *y=a;
                *z=c;
            }else{
                if(b<c && c<a){
                    *x=b;
                    *y=c;
                    *z=a;
                }else{
                    if(c<b && b<a){
                        *x=c;
                        *y=b;
                        *z=a;
                    }else{
                        *x=c;
                        *y=a;
                        *z=b;
                    }
                }
            }
        }
    }
}       

void main(){
    int x,y,z;
    printf("Inseire primo numero: ");
    scanf("%d",&x);
    printf("Inserire secondo numero: ");
    scanf("%d",&y);
    printf("insierire terzo numero: ");
    scanf("%d",&z);
    crescenti(&x,&y,&z);
    printf("%d %d %d \n",x,y,z);
}