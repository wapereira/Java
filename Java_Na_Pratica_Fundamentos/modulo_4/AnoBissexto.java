package modulo_4;

import java.util.Scanner;

public class AnoBissexto {

    public static void main(String[] args) {
        
        Scanner informeAno = new Scanner(System.in);
        int ano;
        System.out.println("Informe o ano: ");
        ano = informeAno.nextInt();
        
        if ( ano % 4 == 0 && ano % 100 != 0 ||  ano % 400 == 0 ){
            System.out.println(ano+ " é bissexto");
        }
        else{
            System.out.println(ano+ " não é bissexto");
        }
        
    }
    
}
