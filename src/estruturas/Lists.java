package estruturas;

import java.util.ArrayList;
import java.util.List;

public class Lists {

    //Criando instância da class;
    private static Lists instancia;
    public static Lists getInstancia(){
        if(instancia == null){
            instancia = new Lists();
        }
        return instancia;
    }

    public void listas(){

        // Criando uma Lista do tipo String;
        List<String> pessoas = new ArrayList<>();

        // Adiciando pessoas nessa Lista;
        System.out.println("Adiciando Pessoas:");
        pessoas.add("Caio");
        pessoas.add("Luan");
        pessoas.add("Christian");
        System.out.println(pessoas); // Saída: [Caio, Luan, Christian]

        //Removendo pessoas da Lista;
        System.out.println("\nRemovendo Pessoas: ");
        pessoas.remove(1); // Toda Lista começa com índice padrão = 0
        System.out.println(pessoas); // Saída: [Caio, Christian]

        // Buscando pessoas pelo indice na Lista;
        System.out.println("\nBuscando Pessoa Pelo Índice: ");
        System.out.println(pessoas.get(1)); // Saída: Christian

        // Busca a primeira pessoa da Lista;
        System.out.println("\nBuscando a Primeira Pessoa da Lista: ");
        System.out.println(pessoas.getFirst()); // Saída: Caio

        // Diz o tamanho da Lista;
        System.out.println("\nInforma o Tamanho da Lista: ");
        System.out.println(pessoas.size()); // Saída: 2

        // Verificando se a Lista está vazia;
        System.out.println("\nVerificando se a Lista Está Vazia:");
        if(pessoas.isEmpty()){
            System.out.println("A Lista está vazia.");
        }else {
            System.out.println("A Lista não está vazia"); // --> Saída
        }

        // Remove todos os elementos que estão dentro da Lista;
        System.out.println("\nRemovendo Todos os Elementos Que Estão na Lista: ");
        pessoas.clear();
        System.out.println(pessoas); // Saída: []

        // Verificando se a Lista está vazia;
        System.out.println("\nVerificando se a Lista Está Vazia:");
        if(pessoas.isEmpty()){
            System.out.println("A Lista está vazia."); // --> Saída
        }else {
            System.out.println("A Lista não está vazia");
        }
    }
}
