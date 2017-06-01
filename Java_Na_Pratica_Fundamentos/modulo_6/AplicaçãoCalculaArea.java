
package modulo_6;

public class AplicaçãoCalculaArea {
    
    public static void main(String[] args) {
        Retangulo rl = new Retangulo(3.5, 3.5); // estanciar o parametro e atribui dois valores
        Retangulo r2 = new Retangulo(); // sobrecarga do metodo construtor;
        System.out.println("Area do retangulo = "+rl.calculaArea());
        System.out.println("Area do retangulo 2 = "+r2.calculaArea());
    }
    
}
