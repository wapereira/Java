/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo_1;

/**
 *
 * @author willi
 */
public class ElementosEstaticos {
    
    static int contadorElementos;
    
    //sempre que uma nova instancia é criada o construtor é chamado.
    public  ElementosEstaticos(){
        contadorElementos++;
    }
    
    public static void main(String[] args) {
        ElementosEstaticos e1 = new ElementosEstaticos();
        ElementosEstaticos e2 = new ElementosEstaticos();
        
        //System.out.println("Número contador = "+e1.contadorElementos);
        //System.out.println("Número contador = "+e2.contadorElementos);
        System.out.println("Qtd elementos = "+ElementosEstaticos.contadorElementos);
        
        //int qtd = e1.contadorElementos + e2.contadorElementos;
        //System.out.println("Qtd elementos = "+qtd );
    }
    
}
