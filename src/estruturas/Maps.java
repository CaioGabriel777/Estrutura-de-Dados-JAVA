package estruturas;
import java.awt.event.PaintEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Maps {

    private static Maps instancia;
    public static Maps getInstancia(){
        if(instancia == null){
            instancia = new Maps();
        }
        return instancia;
    }

    public void Maps(){

        // Map é uma estrutura que guarda CHAVE E VALOR;

        // Criando um Map;
        Map<String, Integer> pessoas = new HashMap<>();

        // Adicionando Pessoas com Nome e Idade;
        System.out.println("Adicionando Nome e Idades: ");
        pessoas.put("Caio", 21);
        pessoas.put("Luan", 17);
        System.out.println(pessoas); // Saída: {Luan=17, Caio=21}

        // Pegando Pessoas Pelo VALOR;
        System.out.println("\nPegando Idades Pelo Valor: ");
        for(Integer idades: pessoas.values()){
            System.out.println("Idade: " + idades); // Saídas: Idade: 17 Idade: 21
        }

        // Pegando Pessoas Pela CHAVE;
        System.out.println("\nPegando Nome Pela Chave: ");
        for(String nomes: pessoas.keySet()){
            System.out.println("Nome: " + nomes); // Saídas: Nome: Luan Nome: Caio
        }

        // Pegando Pessoas com Nome e Idade;
        System.out.println("\nPegando Pessoas com Nome e Idade: ");
        for (Map.Entry<String, Integer> lPessoas : pessoas.entrySet()){
            System.out.println("Nome: " + lPessoas.getKey() + "\tIdade: " + lPessoas.getValue());
        }

        //TODO: MAP + STREAM

        // Filtrando Pessoas com Idade >= 18
        System.out.println("\nPessoas com Idade Maior Igual que 18 anos: ");
        pessoas.entrySet().stream().filter(entry -> entry.getValue() >= 18)
                .forEach(entry -> System.out.println(entry.getKey() + ", idade: " + entry.getValue()));

        // Filtrando Pessoas com Idade < 18
        System.out.println("\nPessoas com Idade Menor que 18 anos:");
        pessoas.entrySet().stream().filter(entry -> entry.getValue() < 18)
                .forEach(entry -> System.out.println(entry.getKey() + ", idade: " + entry.getValue()));

        System.out.println("\nFiltrando Pessoas com Iniciais 'C'");
        pessoas.entrySet().stream().filter(entry -> entry.getKey().startsWith("C"))
                .forEach(entry -> System.out.println(entry.getKey() + ", idade: " + entry.getValue()));

        //TODO: LIST + MAP

        // Filtrando Pessoas Com 18 Anos ou Mais:
        System.out.println("\nFiltrando Pessoas com Mais de 18 Anos: ");
        List<Map.Entry<String, Integer>> lPessoas = pessoas.entrySet().stream()
                .filter(entry -> entry.getValue() >= 18)
                .collect(Collectors.toList());

        for(Map.Entry<String, Integer> e: lPessoas){
            System.out.println("Nome: " + e.getKey()
            + ", idade: " + e.getValue());
        }
    }
}
