/*
Author: Michele Giraudo
Date: 
Es 17
*/

#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>
#include <math.h>
#include <string.h>
#define LUNG 100

bool isMinuscolo(char c)
{
    if (c >= 97 && c <= 122)
    {
        return true;
    }
    else
    {
        return false;
    }
}

void upper(char s[])
{
    for (int k = 0; s[k] != '\0'; k++)
    {
        if (isMinuscolo(s[k]) == true)
        {
            s[k] = s[k] - 32;
        }
    }
}

void main()
{
    char s[LUNG];
    fgets(s, LUNG, stdin);
    upper(s);
    printf("%s", s);
}
