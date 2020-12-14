package br.com.chagas.comparators.exercicio;

import java.util.Comparator;

import lombok.Data;

public class PessoaOrdemReversaComparator implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        return o2.getAltura().intValue() - o1.getAltura().intValue();
    }
}
