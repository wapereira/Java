
package modulo_4;

public class ExibeImpar {

    public static void main(String[] args) {
        
        ExibeImpar ei;
        ei = new ExibeImpar();
        ei.exibir();
        
        
    }
    //Inicio do método
    //public = Modificador / qualquer um pode acessar.
    //Void = método não possui valor de retorno.
    public void exibir() {
        
        int contador = 1;
        
        while (contador <=20){
            if (contador % 2 != 0){
                System.out.println(contador+ " é ímpar");
            }
            contador++;
        }
        
    }
    //Fim do método
    
}
