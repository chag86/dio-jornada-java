package br.com.chagas.avancado;

import java.util.function.Supplier;

public class Provedores {
    public static void main(String[] args) {
        Supplier<Pessoa> supplies = () -> new Pessoa("Rodrigo", 34);
        System.out.println(supplies.get());  
    }
}

class Pessoa{
    private String nome;
    private Integer idade;

    public Pessoa( String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;
    }    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("nome: %s, idade: %d ", nome, idade);
    }
}