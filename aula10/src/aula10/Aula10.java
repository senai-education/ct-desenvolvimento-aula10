package aula10;

import Model.Pessoa;
import java.util.HashSet;
import java.util.Set;

public class Aula10 {

    public static void main(String[] args) {
        //CRIANDO ARRAYLIST COM OBJETOS GENERICOS(SEM TIPO) E ARMAZENANDO EM VARIAVEL TIPO LIST
        Set conjuntoGenerico = new HashSet();
        
        //CRIANDO ARRAYLIST COM OBJETOS GENERICOS(SEM TIPO) E ARMAZENANDO EM VARIAVEL TIPO ARRAYLIST
        HashSet conjuntoGenericaDois = new HashSet();
        
        //ADICIONANDO OBJETOS DENTRO DO CONJUNTO. DESSA FORMA É POSSÍVEL ADICIONAR QUALQUER DADO QUE QUALQUER TIPO
        conjuntoGenerico.add("TESTE COM STRING");
        conjuntoGenerico.add(1000);
        conjuntoGenerico.add(true);
        conjuntoGenerico.add(2.0);
        conjuntoGenerico.add(new Pessoa("Gustavo", 23));
        conjuntoGenerico.add(new Pessoa("Gustavo", 23)); //ESSE ELEMENTO NÃO SERÁ ADICIONADO PORQUE É REPETIDO
        
        //ADICIONANDO OBJETOS DENTRO DE LISTA. DESSA FORMA É POSSÍVEL ADICIONAR QUALQUER DADO QUE QUALQUER TIPO
        conjuntoGenericaDois.add("TESTE COM STRING");
        conjuntoGenericaDois.add(1000);
        conjuntoGenericaDois.add(true);
        conjuntoGenericaDois.add(2.0);
        conjuntoGenericaDois.add(new Pessoa("Gustavo", 23));
        conjuntoGenericaDois.add(new Pessoa("Gustavo", 23)); //ESSE ELEMENTO NÃO SERÁ ADICIONADO PORQUE É REPETIDO
        
        
        //REMOVENDO DADOS DE DENTRO DA LISTA
        conjuntoGenerico.remove(true); //REMOVE O ELEMENTO INFORMADO DA LISTA
        conjuntoGenericaDois.remove(true); //REMOVE O ELEMENTO INFORMADO DA LISTA
        
        //CRIANDO LISTAS COM ELEMENTOS TIPADOS (NESSE CASO TIPOS STRING)
        Set<String> conjuntoString = new HashSet();
        HashSet<Pessoa> conjuntoPessoa = new HashSet();
        
        //ADICIONANDO VALORES
        conjuntoString.add("UM");
        conjuntoString.add("DOIS");
        conjuntoString.add("TRÊS");
        conjuntoString.add("QUATRO");
        
        //ADICIONANDO VALORES
        conjuntoPessoa.add(new Pessoa("Gustavo", 23));
        conjuntoPessoa.add(new Pessoa("Vanessa", 30));
        conjuntoPessoa.add(new Pessoa("João", 26));
        conjuntoPessoa.add(new Pessoa("Maria", 18));
               
                
        //PERCORRE UM LISTA DE STRING COM O FOREACH
        for(String str : conjuntoString){
            System.out.println(str);
        }
        
        //PERCORRE LISTA DE PESSOA COM FOREACH
        for(Pessoa pessoa : conjuntoPessoa){
            System.out.println(pessoa.getNome() + " - " + pessoa.getIdade());
        }
    }
    
}
