
package modulo_1;

public class Array {

    public static void main(String[] args) {
        
        int i1 = 0;
        int i2 = 1;
        int i3 = 2;
        int i4 = 3;
        int i5 = 4;
        
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);
        
        
    int[] ar = new int[10]; //Instancia de um objeto do tipo array. A variavel ac armazena uma referência de um array criada com 10 elementos
    
        for(int i = 0; i < ar.length; i++){
            ar[i] = i;
        }
        System.out.println();
        //Exebindo os valores dos elementos de um array
        for (int i=0; i < ar.length; i++){
            System.out.println(ar[i]);
        }
    }
    
}
