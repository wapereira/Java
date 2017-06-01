
package modulo_6;

public class Produtos {

    String nome;
    double peso;
    int contador;
    
    void produto (String nome, double peso){
        this.nome = nome;
        this.peso = peso;
        contador++;
        
    }
    int contador(){
        return contador;
    }

  
    
}
