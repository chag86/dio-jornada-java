package br.com.chagas.comparators;

import lombok.Data;

@Data
public class Estudante implements Comparable<Estudante>{

    private final String nome;
    private final Integer idade;

    public Estudante(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public int compareTo(Estudante o) {
        return this.getIdade() - o.getIdade();
    }
    
}
