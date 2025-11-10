//LEGGERE LE ISTRUZIONI NEL FILE README.md

import java.util.Scanner;
import java.util.Random;

// Classe principale, con metodo main
class Esercizio {

    public static Scanner in = new Scanner( System.in );

    public static void assegnaMatrice( int [][]M, int n, int m, int val ) {
        int i,j;
        i=0;
        j=0;
        for(j=0, j<=m-1,++j){
        for (i=0, i<=n-1, ++i){
            M[i][j]=val;
        }
    }
    }
    public static void azzeraMatrice(int [][]M,int n,int m) {
        assegnaMatrice([][]M,n,m,0);
    }

    public static void riempiCasuale( int [][]M,n,m,parMin,parMax ) {
        Random rand = new Random();
        int i,j,r;
        i=0;
        while(i<=n-1){
            j=0;
            while(j<=m-1){
                r=rand.nextInt((parMax+1-parMin)-parMin);
                ++j
            }
           
            ++i
        }
    }

    public static void main(String args[]) {
        //SCRIVERE QUI IL CODICE RICHIESTO DALL'ESERCIZIO  
    }
}

//LEGGERE LE ISTRUZIONI NEL FILE README.md