#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>
#include <math.h>

#define LUNG 20
#define NPROVE 10
#define PART_MAX 5

typedef struct concorrente
{
    char nome[LUNG];
    int punteggio[NPROVE];
    int totale;

} Concorrente;

void iscrizione(Concorrente g[], int n, int prove)
{
    for (int k = 0; k < n; k++)
    {
        printf("\nInserisci il nome: ");
        fflush(stdin);
        scanf("%s", g[k].nome);
        g[k].totale = 0;
        for (int  i= 0; i < prove; i++)
        {
            printf("Inserisci il punteggio della %d gara ", i + 1);
            scanf("%d", &g[k].punteggio);
            g[k].totale = g[k].totale +g[k].punteggio[i];  
        }
        printf("%d", g[k].totale);
          
    }
}

void main()
{
    Concorrente gara[PART_MAX];

    iscrizione(gara, PART_MAX, NPROVE);

    //VisGara(gara, PART_MAX);

    //VisClassifica(gara, PART_MAX);
}
