
package modulo_3;

//Switch Case = teste de caso, caso o teste for verdadeiro,
//interrompe o código e retorna o valor do caso testado.

//default: Caso nenhuma condição seja verdadeira retorna o valor padrão.

public class Teste2SwitchCase {
    
    public static void main(String[] args) {
     
        int mes = 7;
        switch (mes){
            
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Desembro");
                break;
            default:
                System.out.println("Mês inválido");
            
        }
        
    }
    
}
