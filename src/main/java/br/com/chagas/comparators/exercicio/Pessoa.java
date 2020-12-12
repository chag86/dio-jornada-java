package br.com.chagas.comparators.exercicio;

import lombok.Data;

@Data
public class Pessoa implements Comparable<Pessoa>{

    private final String nome;
    private final Integer idade;
    private final Double altura;

    public Pessoa(String nome, Integer idade, Double altura) {
        this.nome   = nome;
        this.idade  = idade;
        this.altura = altura;
    }

    @Override
    public int compareTo(Pessoa o) {
        return this.getAltura().intValue() - o.getAltura().intValue();
    }
    
}
