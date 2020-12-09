package exercicio01;

import java.util.HashSet;

public class Exercicio01 {

    public static void main(String[] args) {
        
        HashSet<String> conjunto = new HashSet();
        conjunto.add("099.370.329-11"); //ELEMENTO 01
        conjunto.add("123.456.789-00"); //ELEMENTO 02
        conjunto.add("312.456.971-26"); //ELEMENTO 03
        conjunto.add("123.133.126-81"); //ELEMENTO 04
        conjunto.add("123.131.132-41"); //ELEMENTO 05
        conjunto.add("153.105.016-12"); //ELEMENTO 06
        conjunto.add("312.311.233-11"); //ELEMENTO 07
        conjunto.add("231.233.112-33"); //ELEMENTO 08
        conjunto.add("123.312.313-31"); //ELEMENTO 09
        conjunto.add("099.370.329-11"); //ELEMENTO 10 - É IGUAL O ELEMENTO 01
        
        
        //MOSTRA O CONJUNTO - AO VERIFICAR A SAÍDA O ULTIMO ELEMENTO NÃO FOI ADICIONADO
        for(String str : conjunto){
            System.out.println("CPF: " + str);
        }
        
    }
    
}
