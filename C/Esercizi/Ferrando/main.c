#include "Grafica.h"

//Dimensioni campo da gioco
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



//Prototipi funzioni
void azzera(int m[R][C]);
void gioca(char n1[CN], char n2[CN], int tg1, int tg2);

int inserisci(int m[R][C], int c);
int controllaF(int m[R][C], const int g, const int r, const int c, const int e);
int giocatoreP(int g);
int esiste(int r, int c);


//Corpi delle funzioni
int main(int argc, char *argv[]){
  char n1[CN]="Giocatore A", n2[CN]="Giocatore B", r, k=0;
  int m[R][C], tipoGioco=1, tg1=User, tg2=User;
  srand(time(NULL));

  clrscr();
  stampaTitolo();
  printf("\n\t User vs User");
  printf("\nInserisci il nome del giocatore:\n   ");
  scanf("%s", n1);
  fflush(stdin);
  printf("Inserisci il nome del secondo giocatore:\n   ");
  scanf("%15s", n2);
  fflush(stdin);    
  gioca(n1, n2, tg1, tg2);
  
  do{
    printf("\n\nVuoi fare una nuova partita? (s/n)");
    scanf("%c", &r);
    fflush(stdin);
    gioca(n1, n2, tg1, tg2);
  }while(r=='s' || r=='S');
  
  return 0;
}



//###############################
void gioca(char n1[CN], char n2[CN], int tg1, int tg2){
  int m[R][C], t=1, f, nt=0, r, c, g=g2I;
  
  f=FGioca;
  azzera(m);
  
  do{
    clrscr();
    stampaTitolo();
    g=giocatoreP(g);
    printf("g=%d   tg=%d\n",g, g==g1I?tg1:tg2);
    printf("Mossa numero: %d\n",++nt);
    if(t)
      printf("E' il turno di %s (%c)\n\n", n1,g1);
    else
      printf("E' il turno di %s (%c)\n\n", n2,g2);
    stampa(m);
    
    //Se gioca l'utente
    if( (g==1 && tg1==User) || (g==2 && tg2==User)){
      while(1){
        printf("In che colonna vuoi mettere il gettone?  ");
        scanf("%d", &c);
			  fflush(stdin);
			  c--;
        if(c<0 || c>=C)
          continue;
        r=inserisci(m,c);
        if(r!=-1)
          break;
      }
    }
    m[r][c]=g;
    f=controllaF(m,g,r,c,1) ? g : f;
    if(nt==R*C && f==0){
      f=FPareggio;
      break;
    }
  }while(!f);
  
  clrscr();
  stampaTitolo();
  stampa(m);
  switch(f){
    case 1:
      printf("\n\nHa vinto %s (%c)", n1, g1);
      break;
    case 2:
      printf("\n\nHa vinto %s (%c)", n2, g2);
      break;
    case 3:
      printf("\n\nPareggio");
      break;
  }
}

//###############################
int giocatoreP(int g){
	return g==g1I ? g2I : g1I;
}	


//###############################
int inserisci(int m[R][C], int c){
  int i;
  for(i=R-1; i>=0; i--)
    if(m[i][c]==vuotoI)
      return i;
  return -1;
}


//###############################
int controllaF(int m[R][C], const int g, const int r, const int c, const int e){
	int r2, c2, x, ret=0, i, ok;
	
	//Controllo diagonale \ ___
	if(esiste(r-1,c-1) && m[r-1][c-1]==g)
	  if(x=controllaF(m,g,r-1,c-1,e)!=0)
	    ret=ret||x;
  if(r<R-(NGV-1) && c<C-(NGV-1)){
  	ok=1;
    for(i=0; i<NGV && (ok*=(m[r][c]==m[r+i][c+i] || m[r+i][c+i]==vI)); i++) ;
    if(ok){
    	if(e)
        for(i=0; esiste(r+i, c+i) && m[r+i][c+i]==g; i++)
          m[r+i][c+i]=vI;
      ret=1;
    }
  }
  
  //Controllo diagonale /  ___
	if(esiste(r+1,c-1) && m[r+1][c-1]==g)
	  if(x=controllaF(m,g,r+1,c-1,e)!=0)
	    ret=ret||x;
  if(r>(NGV-2) && c<C-(NGV-2)){
  	ok=1;
    for(i=0; i<NGV && (ok*=(m[r][c]==m[r-i][c+i]) || m[r-i][c+i]==vI); i++) ;
    if(ok){
    	if(e)
        for(i=0; esiste(r-i, c+i) && m[r-i][c+i]==g; i++)
          m[r-i][c+i]=vI;
      ret=1;
    }
  }
  
	//Controllo riga
	if(esiste(r,c-1) && m[r][c-1]==g)
	  if(x=controllaF(m,g,r,c-1,e)!=0)
	    ret=ret||x;
  if(c<C-(NGV-1)){
  	ok=1;
    for(i=0; i<NGV && (ok*=(m[r][c]==m[r][c+i] || m[r][c+i]==vI)); i++) ;
    if(ok){
    	if(e)
        for(i=0; esiste(r, c+i) && m[r][c+i]==g; i++)
          m[r][c+i]=vI;
      ret=1;
    }
  }
	
	//Controllo colonna
	if(r<R-(NGV-1)){
	  ok=1;
		for(i=0; i<NGV && (ok*=(m[r][c]==m[r+i][c] || m[r+i][c]==vI)); i++) ;
		if(ok){
    	if(e)
			  for(i=0; i<NGV; i++) //Non serve controllare se sono pi� di 4
          m[r+i][c]=vI;
      ret=1;
		}
	}
	
  return ret;
}


//###############################
int esiste(int r, int c){
	if(r>=0&&r<R && c>=0&&c<C)
	  return 1;
	return 0;	
}


//###############################
void azzera(int m[R][C]){
  int i,j;
  for(i=0; i<R; i++)
    for(j=0; j<C; j++)
      m[i][j]=0;
}


//###############################
