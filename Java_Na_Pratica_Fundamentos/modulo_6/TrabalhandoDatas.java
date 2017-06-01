package modulo_6;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class TrabalhandoDatas {

    public static void main(String[] args) {
        
        Date data = new Date();//classe data do pacote java.util
        System.out.println("Sem formatação: "+data);
        
        //agora que já temos uma data sem formatação vamos formata-la
        DateFormat df = DateFormat.getDateInstance(); // usado para representar uma data e uma hora com a localidade padrão
        String formatada = df.format(data); // metodo format da classe dateformat
        System.out.println("Com formatação abreviada: " +formatada);
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyy--MM--dd");
        //O mês tem qye ser em caixa aula
        String meuFormato = sdf.format(data);
        System.out.println("Formatando do meu jeito: "+meuFormato);
    }
    
}
