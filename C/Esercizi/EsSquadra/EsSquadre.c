/*
Filippo Ferrando
*/


#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <stdbool.h>
#include <string.h>

#define LUNG 20
#define DIM 100

/*
Si scriva un programma che definisca una struttura che permetta di contenere
una serie di dati Squadra(struct squadra) del tipo:
nome squadra (stringa di lunghezza 20) ;
goal fatti (intero) ;
goal subiti (intero).
Il programma deve permettere nell'ordine le seguenti operazioni:
Memorizzare i dati in un vettore di strutture "campionato";
Stampare a terminale tutti i nomi delle squadre che hanno fatto un numero di goal maggiore del numero dei goal subiti.
Letto a terminale il nome di una squadra stampare a video i goal fatti e i goal subiti o dire che non � presente nell'elenco
Esempio di contenuto dell'array di struct:
{"juventus", 1, 10, 12},
{"milan", 8, 7, 6},
{"inter", 10, 13, 11},
{"palermo", 2, 9, 10},
{"lazio", 5, 8, 4},
{"udinese", 14, 5, 7}
*/

typedef struct squadra{
    char nome[LUNG];
    int goalSubiti;
    int goalFatti;
}Squadra;






int inserisciNumero(char msg[],int max){
    int n;
    do{
        printf("%s",msg);
        scanf("%d",&n);
    }while(n<0||n>max);
    return n;
}

Squadra caricaSquadra(){
    Squadra sq;
    printf("Inserisci il nome della squadra: ");
    fflush(stdin);
    scanf("%s",sq.nome);
    sq.goalFatti=inserisciNumero("\nInserisci goal fatti: ",30);
    sq.goalSubiti=inserisciNumero("\nInserisci goal subiti: ",30);
    return sq;
}

void goalMag(Squadra camp[],int ns){
    printf("Le squadre che hanno subito meno goal di quelli che hanno fatto sono: ");
    for(int k=0;k<ns;k++){
        if(camp[k].goalFatti>camp[k].goalSubiti){
            printf("%s",camp[k].nome);
        }
    }
}

void inserimentoSquad(Squadra camp[],int ns){
    char s[LUNG];
    int k;
    printf("Inserire il nome della squadra: ");
    scanf("%s",s);
    for(k=0;k<ns;k++){
        if(strcmp(s,camp[k].nome)==0){
            prinf("Goal fatti: %d",camp[k].goalFatti);
            prinf("Goal subiti: %d",camp[k].goalSubiti);
            k=ns+1;
        }
    }
    if(k<=ns){
        printf("La squadra inserita non esiste");
    }
}

void main(){
    Squadra campionato[DIM];
    int nSquadre=0;

    printf("Caricamento squadre: \n");
    nSquadre=inserisciNumero("Inserisci numero squadre: ",DIM);

    for(int k=0;k<nSquadre;k++){
        campionato[k]=caricaSquadra();
    }
    goalMag(campionato,nSquadre);
    inserimentoSquad(campionato,nSquadre);
}
