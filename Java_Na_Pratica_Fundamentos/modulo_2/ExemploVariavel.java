package modulo_2;


public class ExemploVariavel {

    int contador = 10; // variavel de instância
    
    public void variaveis(){
        int contador = 20; /// variavel local
        System.out.println(this.contador);
        System.out.println(contador);
    }
    
    public static void main(String[] args) {
        
        ExemploVariavel w = new ExemploVariavel();
        w.variaveis();
        
        System.out.println("");
        
        int x = 10; //declarando uma variavel ja atribuindo um valor.
        
        System.out.println(x); // imprimi somente variavel.
        System.out.println("Valor de X= "+ x); //Sinal de "=" utilizado para concatenar a variavel ao texto a ser exibido.
        
        int y = 77;
        System.out.println(y);
        System.out.println("Valor de y= "+y);
        
        int z = y + 5;
        System.out.println("Valor de z= "+z);
        
    }
    
}
