
package modulo_3;

//Teste de condição if (SE) / else (SE NÃO).

public class TesteIfElse {
    
    public static void main(String[] args) {
        
        int num = 10;
        
        if (num >10){
            System.out.println("maior que 10");
        } else{
            if (num <10){
                System.out.println("menor que 10");
            } else{
                System.out.println("igual a 10");
            }
        }
    }
}
