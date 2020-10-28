#ifndef __grafica_h
#define __grafica_h


#include "myUtility.h"
#include <stdio.h>
#include <stdlib.h>

#define R 9					//Numero di righe
#define C 8					//Numero di colonne

//Caratteri stampati a video
#define g1 		 'X'		//Carattere del giocatore 1
#define g2 		 'O'		//Carattere del giocatore 2
#define vuoto  '.'		//Carattere per uno spazio vuoto
#define CVitt  'V' 		//Carattere per segnare la combinazione vincente

//Valori nella matrice
#define vuotoI 0		//Valore di uno spazio vuoto
#define g1I 1				//Valore del giocatore 1
#define g2I 2				//Valore del giocatore 2
#define vI 3				//Valore per segnare la combinazione vincente

//Valori che può assumere f in gioca
#define FGioca 0		//Partita in corso
#define FG1 1				//Ha vinto il giocatore 1
#define FG2 2				//Ha vinto il giocatore 2
#define FPareggio 3 //Pareggio

//Varie
#define CN 15							//Numero dei caratteri dei nomi dei giocatori
#define NGV 4							//Numero Gettoni per la Vittoria

//Tipologia di Gioco
#define UvsU 1			//User contro User

//Tipologia Giocatore
#define User 1


//disegna una riga di lung caratteri car a partire dalla posizione (x,y)
void riga(int x, int y, int lung, char car);

//disegna una riga di lung caratteri car a partire dalla posizione (x,y)
//utilizzando il colore color
void rigaColore(int x, int y, int lung, char car, int color);

//disegna una colonna di lung caratteri car a partire dalla posizione (x,y)
void colonna(int x, int y, int lung, char car);

//disegna una colonna di lung caratteri car a partire dalla posizione (x,y)
//utilizzando il colore color
void colonnaColore(int x, int y, int lung, char car, int color);

//disegna un quadrato pieno di lato l con angolo alto sx nella posizione (x,y)
//usando il carattere car
void quadratoPieno(int x, int y, int lato, char car);

//disegna un quadrato pieno di lato l con angolo alto sx nella posizione (x,y)
//usando il carattere car e utilizzando il colore color
void quadratoPienoColore(int x, int y, int lato, char car, int color);

//disegna un quadrato vuoto di lato l con angolo alto sx nella posizione (x,y)
//usando il carattere car
void quadratoVuoto(int x, int y, int lato, char car);

//disegna un quadrato vuoto di lato l con angolo alto sx nella posizione (x,y)
//usando il carattere car e utilizzando il colore color
void quadratoVuotoColore(int x, int y, int lato, char car, int color);

//disegna un rettangolo pieno di base b e altezza h
//con angolo alto sx nella posizione (x,y)
//usando il carattere car
void rettangoloPieno(int x, int y, int b, int h, char car);

//disegna un rettangolo pieno di base b e altezza h
//con angolo alto sx nella posizione (x,y)
//usando il carattere car e utilizzando il colore color
void rettangoloPienoColore(int x, int y, int b, int h, char car, int color);

//disegna un rettangolo vuoto di base b e altezza h
//con angolo alto sx nella posizione (x,y)
//usando il carattere car
void rettangoloVuoto(int x, int y, int b, int h, char car);

//disegna un rettangolo vuoto di base b e altezza h
//con angolo alto sx nella posizione (x,y)
//usando il carattere car e utilizzando il colore color
void rettangoloVuotoColore(int x, int y, int b, int h, char car, int color);


//disegna un triangolo pieno di altezza h
//con vertice nella posizione (x,y)
//usando il carattere car
void triangolo(int x, int y, int h, char car);

//disegna un triangolo pieno di altezza h
//con vertice nella posizione (x,y)
//usando il carattere car e utilizzando il colore color
void triangoloColore(int x, int y, int h, char car, int color);

void stampa(int m[R][C]);
char stampaCasella(int x);
void stampaTitolo(void);
void stampaRigaPiena(void);


////////////----------------///////////

void riga(int x,int y, int lung, char car){
	int k;
	for (k=0;k<lung;k++){
			gotoxy(x+k,y);
			printf("%c",car);
			}
	return;
}

void rigaColore(int x,int y, int lung, char car, int color){
	int k;
	textcolor(color);
	for (k=0;k<lung;k++){
			gotoxy(x+k,y);
			printf("%c",car);
			}
	return;
}

void colonna(int x,int y, int lung, char car){
	int k;
	for (k=0;k<lung;k++){
			gotoxy(x,y+x);
			printf("%c",car);
			}
	return;
}

void colonnaColore(int x,int y, int lung, char car, int color){
	int k;
	textcolor(color);
	for (k=0;k<lung;k++){
			gotoxy(x,y+k);
			printf("%c",car);
			}
	return;
}


void quadratoPieno(int x,int y,int lato,char car){
	int riga;
	int colonna;
	for (riga=0;riga<lato;riga++){
		gotoxy(x,y+riga);
		for (colonna=0;colonna<lato;colonna++){
			printf("%c",car);}}
	return;
}


void quadratoPienoColore(int x,int y,int lato,char car,int color){
	int riga;
	int colonna;
	textcolor(color);
	for (riga=0;riga<lato;riga++){
		gotoxy(x,y+riga);
		for (colonna=0;colonna<lato;colonna++){
			printf("%c",car);
		}
	}
	return;
}

void quadratoVuoto(int x, int y, int lato, char car){
	int riga;
	int colonna;
	for (riga=0;riga<lato;riga++){
		for (colonna=0;colonna<lato;colonna++){
			if(riga==0 || riga==lato-1 ||colonna==0 || colonna==lato-1){
					gotoxy(x+colonna,y+riga);
					printf("%c",car);
			}
		}
	}
	return;
}

void quadratoVuotoColore(int x,int y,int lato,char car,int color){
	int riga;
	int colonna;
	textcolor(color);
	for (riga=0;riga<lato;riga++){
		for (colonna=0;colonna<lato;colonna++){
			if(riga==0 || riga==lato-1 ||colonna==0 || colonna==lato-1){
				gotoxy(x+colonna,y+riga);
				printf("%c",car);
			}
		}
	}
	return;
}

void rettangoloPieno(int x,int y,int b,int h,char car){
	int riga;
	int colonna;
	for (riga=0;riga<h;riga++){
		gotoxy(x,y+riga);
		for (colonna=0;colonna<b;colonna++){
				printf("%c",car);
		}
	}
	return;
}

void rettangoloVuoto(int x,int y,int b,int h,char car){
	int riga;
	int colonna;
	for (riga=0;riga<h;riga++){
		for (colonna=0;colonna<b;colonna++){
			if(riga==0 || riga==h-1 ||colonna==0 || colonna==b-1){
				gotoxy(x+colonna,y+riga);
				printf("%c",car);
			}
		}
	}
	return;
}
void rettangoloPienoColore(int x,int y,int b,int h,char car,int color){
	int riga;
	int colonna;
	textcolor(color);
	for (riga=0;riga<h;riga++){
		gotoxy(x,y+riga);
		for (colonna=0;colonna<b;colonna++){
				printf("%c",car);
		}
	}
	return;
}

void rettangoloVuotoColore(int x,int y,int b,int h,char car,int color){
	int riga;
	int colonna;
	textcolor(color);
	for (riga=0;riga<h;riga++){
		for (colonna=0;colonna<b;colonna++){
			if(riga==0 || riga==h-1 ||colonna==0 || colonna==b-1){
				gotoxy(x+colonna,y+riga);
				printf("%c",car);
			}
		}
	}
	return;
}

void triangolo(int x, int y, int h, char car){
	int temp,cnt,altroTemp=1;
	for(cnt=0;cnt<h;cnt++){
		gotoxy(x-(cnt+1),y+cnt-1);
		for(temp=0;temp<altroTemp;temp++){
			printf("%c",car);
		}
		altroTemp=altroTemp+2;
	}
	return;
}

void triangoloColore(int x, int y, int h, char car, int color){
	int temp,cnt,altroTemp=1;
	textcolor(color);
	for(cnt=0;cnt<h;cnt++){
		gotoxy(x-(cnt+1),y+cnt-1);
		for(temp=0;temp<altroTemp;temp++){
			printf("%c",car);
		}
		altroTemp=altroTemp+2;
	}
	return;
}

//riga arcobaleno

void rigaarcobaleno(int x, int y, int lato, char car, int sfondo){
    int cnt;
    cnt=0;
    int colore;

    gotoxy(x,y);
    while(cnt<lato){
        colore = sfondo + rand() % 14;
        textcolor(colore);
        delay(15);
        printf("%c", car);
        cnt=cnt+1;
    }
}

#endif

void stampa(int m[R][C]){
  int i,j;
  printf("\n");
  stampaRigaPiena();  //Stampo prima riga |---|---|--...
  
  for(i=0; i<R; i++){ //Stampo le righe centrali
    printf("   |");
    for(j=0; j<C; j++)
      printf(" %c |",stampaCasella(m[i][j]));
    printf("\n");
    stampaRigaPiena();
  }
  stampaRigaPiena();  //Stampo prima riga |---|---|--...
  printf("   |");
  for(j=1; j<=C; j++)
    printf(" %d |", j);
  printf("\n");
  stampaRigaPiena();  //Stampo prima riga |---|---|--...
  printf("\n");
}
void stampaRigaPiena(){
  int i,j;
  printf("   |");
  for(j=1; j<=C; j++)
    printf("---|");
  printf("\n");
}
char stampaCasella(int x){
	char c;
	switch(x){
		case 0:
	    c=vuoto; break;
    case 1:
    	c=g1; break;
   	case 2:
    	c=g2; break;
   	case 3:
   		c=CVitt; break;
	}
	return c;
}
void stampaTitolo(void){
  printf("\n\n\t ### Forza quattro ###\n\n");
}


