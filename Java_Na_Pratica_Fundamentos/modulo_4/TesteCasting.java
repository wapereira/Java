
package modulo_4;


public class TesteCasting {

    public static void main(String[] args) {
        
        int x = 10; //Declaração normal de uma variavel do tipo int
        double y =x; //Valor de x convertido para Double, Casting Implícito
        long z =10L; //Por padrão o 10 é um int, depois convertido paralong
        
        float w = 10.0f; // por padrão 10.0 é um double, depois convertido para float
        int r = (int)14.5; // Casting explicito, converte double para int truncado
                           // o valor descimal
        
        byte b = 127; 
        
        System.out.println(x+ ", "+y+", "+z+", "+w+", "+r+", "+b);
        
    }
    
}
