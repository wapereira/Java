package modulo_4;

import java.util.Scanner;

public class Divida {

    public static void main(String[] args) {
        
        Scanner entra = new Scanner(System.in);
        double divida, dividaFinal;
        float juros;
        int qtdMeses;
        
        
        System.out.println("Valor da divida: ");
        divida = entra.nextDouble();
        System.out.println("Numero de parcelas: ");
        qtdMeses = entra.nextInt();
        
        System.out.println("Juros de (%): ");
        juros = entra.nextFloat();
        juros = (float)(juros*(divida/100));
        dividaFinal = qtdMeses +juros+divida;
        System.out.println("Total a pagar com juros: "+(float)dividaFinal);
    }
    
}
