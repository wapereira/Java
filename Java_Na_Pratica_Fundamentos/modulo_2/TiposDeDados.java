package modulo_2;


public class TiposDeDados {
    public static void main(String[] args) {
        boolean bo = true; //armazena um valor lógico true (verdadeiro) ou false (falso)
        byte by = -122; //Compreende valores de -128 a 127. Muito utilizado para economizar espaço em disco.
        short sh = 30654; //Compreende valores de -32768 a 32767
        int i = 200; // Tipo inteiro, suporta numeros de 32 bits. Este tipo de dado é padrão para
                    //operações com números inteiros no Java;
        long lo = 53676; //Suporta números de 64 bits.
        float fl = 55.60F; //Armazena números de ponto flutuantes (dízimas) com 32 bits. Para definirmos
                           //um valor com este tipo de dados devemos atribuir-lhe um "F" ou "f" no final.
        double db = 60.42D; //Armazena números de ponto flutuantes (dízimas) com 64 bits. Para definirmos
                           //um valor com este tipo de dados devemos atribuir-lhe um "D" ou "d" no final.
        char ch = 'T'; //Criado para armazenar um caracter Unicode;
        String st = "Java na prática"; //Armazena texto.
        
        System.out.println(bo);
        System.out.println(by);
        System.out.println(sh);
        System.out.println(i);
        System.out.println(lo);
        System.out.println(fl);
        System.out.println(db);
        System.out.println(sh);
        System.out.println(st);
        
    }   
    
}
