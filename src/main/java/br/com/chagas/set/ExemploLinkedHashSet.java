package br.com.chagas.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExemploLinkedHashSet {

    private static final Logger logger = LogManager.getLogger(ExemploLinkedHashSet.class.getName());

    public static void main(String[] args) {

        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();
        
        //adiciona notas no set criado

        sequenciaNumerica.add(16);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(1);


        logger.info("Notas alunos: {}", sequenciaNumerica);
        
        //remove a nota do set
        sequenciaNumerica.remove(4);

        logger.info("Notas alunos: {}", sequenciaNumerica);
        
        logger.info("Tamanho: {}", sequenciaNumerica.size());
        
        Iterator<Integer> iterator = sequenciaNumerica.iterator();
        
        while (iterator.hasNext()) {
            Integer nota = iterator.next();
            logger.info("Nota[while]: {}", nota);
        }
        
        for (Integer nota : sequenciaNumerica) {
            logger.info("Nota[for]: {}", nota);
        }
        
        sequenciaNumerica.clear();
        
        
        logger.info("É vazio? : {}", sequenciaNumerica.isEmpty());

    }
    
}
