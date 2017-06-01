package modulo_1;

import java.util.Arrays;
import java.util.Scanner;

/*
Neste código vamos criar dois arrays (A e B), o usuário entrará com os 5 elementos do array
A e o array B será criado multiplicando cada valor do array A por 5, depois utilizando o método sort,
o arry B será ordenado e por fim o usuário poderá pesquisar um valor de array.
*/

public class PesquisaVet {

    public static void main(String[] args) {
        Scanner x = new Scanner (System.in);
        int[] vetA = new int [5];
        int[] vetB = new int [5];
        
        int y=0; //Essa variável informará com qual elemento do array estamos lidando.
        
        for (int i=0; i<=4; i++){
            System.out.println("Elemento "+y+" vetor A: " );
            System.out.println();
            vetA[i]=x.nextInt();
            vetB[i]=vetA[i]*5;
            y++;
        }
        
        Arrays.sort(vetB);
        System.out.println("Exibindo vetorB ordenadamente: ");
        for (int i=0; i<=4; i++){
            System.out.println("Elemento "+i+" vetor B: "+vetB[i]);
        }
        
        System.out.println("Pesquisando no sortB");
        int elemento=0;
        while (elemento!=99){
            System.out.println("Entre com o elemento a ser pesquísado: ");
            elemento = x.nextInt();
            System.out.println("Indice pesquisado: "+Arrays.binarySearch(vetB, elemento));
            
        }
        System.out.println("Saiu");
    }
    
}
