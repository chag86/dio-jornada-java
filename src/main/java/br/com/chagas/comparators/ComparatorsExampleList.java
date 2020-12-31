package br.com.chagas.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ComparatorsExampleList {


    private static final Logger logger = LogManager.getLogger(ComparatorsExampleList.class.getName());

    public static void main(String[] args) {
        List<Estudante> estudantes =  new ArrayList<>();

        estudantes.add(new Estudante("Pedro", 19));
        estudantes.add(new Estudante("Carlos", 23));
        estudantes.add(new Estudante("Mariana", 21));
        estudantes.add(new Estudante("João", 18));
        estudantes.add(new Estudante("Thiago", 20));
        estudantes.add(new Estudante("George", 22));
        estudantes.add(new Estudante("Larissa", 21));

        logger.info("Ordem de inserção: {}",estudantes);
        
        logger.info("Ordem natural dos números (idade): {}",estudantes);

        estudantes.sort((first, second) -> second.getIdade() - first.getIdade());
        
        logger.info("Ordem reversa dos números (idade): {}", estudantes);
        
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
        
        logger.info("Ordem natural dos números (idade - method reference): {}", estudantes);
        
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        
        logger.info("Ordem reverso dos números (idade - method reference): {}", estudantes);
        
        Collections.sort(estudantes);
        
        logger.info("Ordem natural dos números (idade - interface Comparable): {}", estudantes);
        
        Collections.sort(estudantes, new EstudanteOrdemReversaComparator());
        
        logger.info("Ordem reversa dos números (idade - interface Comparable): {}", estudantes);

    }
    
}