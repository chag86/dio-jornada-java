package br.com.chagas.comparators.exercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ComparatorsPessoaList {


    private static final Logger logger = LogManager.getLogger(ComparatorsPessoaList.class.getName());
    

    public static void main(String[] args) {
        
        List<Pessoa> pessoas = new ArrayList<>();

        //adicione elementos a esta lista
        pessoas.add(new Pessoa("Bruno", 19, 1.78));
        pessoas.add(new Pessoa("Marta", 21, 1.68));
        pessoas.add(new Pessoa("José", 25, 1.88));

        logger.info("Listagem atual: {}", pessoas);
        
        //Ordene implementando a interface Comparator no objeto complexo
        pessoas.sort(Comparator.comparingDouble(Pessoa::getAltura));
        
        logger.info("Listagem natural com Comparator: {}", pessoas);
        
        //Ordene implementando a interface Comparator no objeto complexo
        pessoas.sort(Comparator.comparingDouble(Pessoa::getAltura).reversed());
        
        logger.info("Listagem inversa com Comparator: {}", pessoas);
        
        //Ordene implementando a interface Comparator no objeto complexo
        Collections.sort(pessoas);
        
        logger.info("Listagem natural usando Comparator: {}", pessoas);
        
        //Ordene implementando a interface Comparator no objeto complexo
        Collections.sort(pessoas, new PessoaOrdemReversaComparator());

        logger.info("Listagem reversa usando Comparator: {}", pessoas);
        
        pessoas.sort((primeiro,segundo)-> segundo.getAltura().intValue() - primeiro.getAltura().intValue());
        
        logger.info("Listagem normal usando expressão lambda: {}", pessoas);
        
        pessoas.sort((primeiro,segundo)-> primeiro.getAltura().intValue() - segundo.getAltura().intValue());

    }


}
