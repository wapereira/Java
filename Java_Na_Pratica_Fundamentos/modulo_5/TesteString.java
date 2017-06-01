package modulo_5;

public class TesteString {

    public static void main(String[] args) {
        
        String nome = "William";
        String sobrenome = "Pereira";
        
        System.out.println("Concatenando: "+ nome + " " + sobrenome);
        System.out.println("Tudo maiuscula: "+ nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tudo minuscula: "+ nome.toLowerCase() + " " + sobrenome.toLowerCase());
        System.out.println("Retorna o caractere da posição: " +nome.charAt(3));
        System.out.println("Retorna a quantidade de caracteres: "+ nome.length());
        System.out.println("Recebe um int e retorna a partir de uma posição: "+ sobrenome.substring(3));
        System.out.println("Recebe um char e retorna a posição da primeira ocorrência: "+ nome.indexOf('a'));
        System.out.println("Verifica se termina com o valor especificado: "+ nome.endsWith("am") + sobrenome.endsWith("ira"));
        System.out.println("Verifica se começa com o valor especificado: "+ nome.startsWith("wi") + sobrenome.startsWith("per"));
    }
    
}
