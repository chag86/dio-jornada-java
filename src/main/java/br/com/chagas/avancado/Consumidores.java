package br.com.chagas.avancado;

import java.util.function.Consumer;

public class Consumidores {
    public static void main(String[] args) {
        
        Consumer<String> imprimaUmaFrase = System.out::println;
        //Consumer<String> imprimaUmaFrase =  frase -> System.out.println(frase);
        imprimaUmaFrase.accept("Hello World");

    }
}
