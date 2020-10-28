/*
Author: Filippo Ferrando
Date: 
Es 16
*/

#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>
#include <math.h>
#define LUNG 100

int VocaliDispari(char s[])
{
    int d=0;
    for (int k = 0; s[k] != '\0'; k++)
    {
        if (s[k] == 'a' || s[k] == 'e' || s[k] == 'i' || s[k] == 'o' || s[k] == 'u')
        {
            d++;
        }
    }
    if (d % 2 == 0)
    {
        return 0;
    }
    else
    {
        return 1;
    }
}

void main()
{
    int k;
    char s[LUNG];
    fgets(s, LUNG, stdin);
    k = VocaliDispari(s);
    if (k == 1)
    {
        printf("le vocali sono dispari\n");
    }
    else
    {
        printf("le vocali sono pari\n");
    }
}