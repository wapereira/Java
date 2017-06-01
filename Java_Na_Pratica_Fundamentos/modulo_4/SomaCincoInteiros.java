package modulo_4;

public class SomaCincoInteiros {
    
    public static void main(String[] args) {
        
        int contador = 1;
        int valor = 0;
        
        while (contador <=5){
            valor = valor + contador;
            contador++;
        }
        System.out.println(("Soma dos 5= "+valor));
        
    }
    
}
