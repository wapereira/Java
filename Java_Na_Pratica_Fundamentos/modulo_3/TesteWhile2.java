package modulo_3;

public class TesteWhile2 {

    public static void main(String[] args) {
        
        int num = 0;
        
        while(num < 100){
            
            if (num % 4 == 0){
                System.out.println(num+" é dividido por 4");
            }
            if (num % 2 !=0){
                System.out.println(num+" é Impar");
            }
            num++;
        }
        
    }
    
}
