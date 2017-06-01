
package modulo_4;

import java.util.Scanner;

public class Ordena {

    public static void main(String[] args) {
        //Scanner = Tipo de variavel
        //infor = Nome da variavel
        // new = estancia o objeto a classe scanner
        Scanner infor = new Scanner(System.in);
        int x, y;
        
        System.out.println("Digite o valor de X: ");
        x = infor.nextInt();
        System.out.println("Digite o valor de Y: ");
        y = infor.nextInt();
        System.out.println("");
        if (x >y){
            System.out.println(y);
            System.out.println(x);
        }else {
            System.out.println(x);
            System.out.println(y);
        }
        
    }
    
}
