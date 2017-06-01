package modulo_6;

public class TesteProdutos {

    public static void main(String[] args) {
        Produtos feijaoPreto = new Produtos();
        feijaoPreto.produto("Feijão", 3.5);
        feijaoPreto.produto("Outro feijão", 1.7);
        
        Produtos cafeTorrado = new Produtos();
        cafeTorrado.produto("cafe", 4.6);

        Produtos beterrabaArgentina = new Produtos();
        beterrabaArgentina.produto("beterraba", 2.7);
                
        //Vamos mostrar quantos feijao. cafe, e beterraba foram criados
        System.out.println("Qtd feijão: " +feijaoPreto.contador);
        System.out.println("Qtd cafe: " +cafeTorrado.contador);
        System.out.println("Qtd beterraba: "+beterrabaArgentina.contador);
    }
    
}
