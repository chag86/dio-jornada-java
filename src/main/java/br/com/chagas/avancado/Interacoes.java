package br.com.chagas.avancado;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Interacoes {
    
    public static void main(String[] args) {
        String[] nomes = {"Joao","Joao", "Paulo", "Oliveira", "Santos", "Intrutor", "Java"};

        Integer[] numeros = {1,2,3,4,5};

        //imprimirNomesFiltrados(nomes);
        //imprimirTodos(nomes);
        imprimirODobroDeCadaItemLista(numeros);
    }

    private static void imprimirODobroDeCadaItemLista(Integer[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Pelo FOR: " + numeros[i] * 2);
        }

        Stream.of(numeros)
              .map(numero -> numero * 2)
              .forEach(numero -> System.out.println("Pelo Stream: " + numero));
    }


    private static void imprimirTodos(String[] nomes) {
        for (String string : nomes) {
            System.out.println("Pelo FOR: " + string);
        }

        Stream.of(nomes).forEach(nome -> System.out.println("Pelo STREAM: " + nome));

    }

    private static void imprimirNomesFiltrados(String[] nomes) {
        String nomesParaImprimir = "";
        for (int i = 0; i < nomes.length; i++) {
            if(nomes[i].equals("Joao")){
                nomesParaImprimir += nomes[i];
            }
        }



        System.out.println("Utilizando FOR: " + nomesParaImprimir);

        String nomesParaImprimirStream = Stream.of(nomes)
        .filter(nome -> nome.equals("Joao"))
        .collect(Collectors.joining());

        System.out.println("Utilizando STREAM: " + nomesParaImprimirStream);
    }

    
}
