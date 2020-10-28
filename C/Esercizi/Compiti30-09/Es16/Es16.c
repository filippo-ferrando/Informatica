/*
Author: Ferrando Filippo
Date: 
Es 16
*/

#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>
#include <math.h>
#include <string.h>

#define LUNG 100

void isVocale(char s[])
{
    for (int k = 0; s[k] != '\0'; k++)
    {
        if (s[k] == 'a' || s[k] == 'e' || s[k] == 'i' || s[k] == 'o' || s[k] == 'u' || s[k] == 'A' || s[k] == 'E' || s[k] == 'I' || s[k] == 'O' || s[k] == 'U' || s[k] == 'é' || s[k] == 'è')
        {
            s[k] = ' ';
        }
    }
}

void main()
{
    char s[LUNG];
    fflush(stdin);
    fgets(s, LUNG, stdin);
    isVocale(s);
    printf("%s", s);
}
