package modulo_5;

public class Lampada {

    private String ligada;
    
    public void setligar(String lig){//metodo ligar
        this.ligada=lig;
    }
    public void setdesligar(String deslig){//metodo desligar
        this.ligada=deslig;
    }
    
    public String getimprimir (){
        return this.ligada;
        }
    }
