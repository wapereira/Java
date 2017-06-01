/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo_2;

/**
 *
 * @author willi
 */
public class SalarioProfessor {
    
    public static void main(String[] args) {
        
        int ht; //horas trabalhadas no mês.
        double vh; // valor de hora aula
        double pd; // percentual de desconto
        double sb; // salário bruto obtido pela multiplicação de ht e vh
        double td; // todal de desconto obtido pela divisão de pd por 100 multiplicado por sb
        double sl; // saldo liquido calculado pela subtração dos elementos do sb.
        
        //Exibir na tela os valores do salario liquido e do salario bruto.
        
        ht = 70;
        vh = 30.0D;
        pd = 7.5D;
        sb = ht * vh;
        td = (pd / 100) * sb;
        sl = sb - td;
        
        System.out.println("Salario bruto = "+sb);
        System.out.println("Salario liquido = "+sl);
        
    }
    
}
