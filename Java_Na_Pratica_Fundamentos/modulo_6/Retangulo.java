package modulo_6;

public class Retangulo {

    private double altura, largura;
    
    public Retangulo (double altura, double largura){
        this.altura = altura;
        this.largura = largura;
    }
    
    public Retangulo(){
        this.altura = 4;
        this.largura = 4;
    }
    
    public double  calculaArea (){
        return this.altura * this.largura;
    }
    
}
