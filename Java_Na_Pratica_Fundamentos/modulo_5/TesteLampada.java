
package modulo_5;

public class TesteLampada {

    public static void main(String[] args) {
        Lampada lamp = new Lampada();
        
        
        lamp.setligar("Lampada Ligada");
        System.out.println(lamp.getimprimir());
        
        lamp.setdesligar("Lampada Desligada");
        System.out.println(lamp.getimprimir());
    }
    
}
