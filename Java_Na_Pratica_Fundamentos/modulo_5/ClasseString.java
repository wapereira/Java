
package modulo_5;

public class ClasseString {

    public static void main(String[] args) {
        String y1 = "abc";
        String y2 = "abc";
        
        if (y1 == y2){
            System.out.println("Valores de y1 e y2 são iguais");
        }else {
            System.out.println("Valores de y1 e y2 são diferentes");
        }
        
        String x1 = new String ("abc");
        String x2 = new String ("abc");
        
        if (x1 == x2){
            System.out.println("Valores de x1 e x2 são iguais");
        }else {
            System.out.println("Valores de x1 e x2 são diferentes");
        }
        
        if (x1.equals(x2)){ //equals utilizado para comparar conteúdo dos objetos
            System.out.println("Objetos X são iguais");
        }else {
            System.out.println("Objetos X são diferentes");
        }
            
    }
    
}
