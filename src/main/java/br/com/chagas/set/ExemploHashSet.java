package br.com.chagas.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExemploHashSet {

    private static final Logger logger = LogManager.getLogger(ExemploHashSet.class.getName());

    public static void main(String[] args) {

        Set<Double> notasAlunos = new HashSet<>();
                
        //adiciona notas no set criado

        notasAlunos.add(5.8);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(10.0);
        notasAlunos.add(5.4);
        notasAlunos.add(7.3);
        notasAlunos.add(3.8);
        notasAlunos.add(4.0);

        notasAlunos.add(null);

        logger.info("Notas alunos: {}", notasAlunos);
        
        //remove a nota do set
        notasAlunos.remove(3.8);
        logger.info("Notas alunos: {}", notasAlunos);
        
        logger.info("Tamanho: {}", notasAlunos.size());
        
        Iterator<Double> iterator = notasAlunos.iterator();
        
        while (iterator.hasNext()) {
            Double nota = iterator.next();
            logger.info("Nota[while]: {}", nota);
        }
        
        for (Double nota : notasAlunos) {
            logger.info("Nota[for]: {}", nota);
        }
        
        notasAlunos.clear();
        
        
        logger.info("É vazio? : {}", notasAlunos.isEmpty());

    }
    
}
