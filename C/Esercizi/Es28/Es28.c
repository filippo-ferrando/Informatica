#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <stdbool.h>
#include <string.h>

#define LUNG 100
#define NG 7
#define DIM 100

typedef struct azione
{
    char nome[LUNG];
    int vet[NG];
} Azione;

Azione caricaAzioni()
{
    Azione s;
    fflush(stdin);
    printf("inserire nome azione: \n");
    scanf("%s", s.nome);
    for (int k = 0; k < NG; k++)
    {
        printf("inserire valore azione: \n");
        scanf("%d", &s.vet[k]);
    }
    return s;
}

int caloA(Azione borsa, int nA)
{
    int c = 0;
    for (int k = 0; k < nA; k++)
    {
        for (int j = 0; j < NG; j++)
        {
            borsa[k].vet[j] = 0;
        }
    }
}

void main()
{
    Azione borsa[DIM];
    int nA = 0; //numero azioni
    printf("numero azioni: \n");
    scanf("%d", &nA);
    for (int j = 0; j < nA; j++)
    {
        borsa[j] = caricaAzioni();
    }
}
