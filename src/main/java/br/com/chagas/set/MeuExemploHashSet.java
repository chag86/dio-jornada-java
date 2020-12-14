package br.com.chagas.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MeuExemploHashSet {

    private static final Logger logger = LogManager.getLogger(MeuExemploHashSet.class.getName());

    public static void main(String[] args) {

        Set<Integer> notasAlunos = new HashSet<>();
                
        //adiciona notas no set criado

        notasAlunos.add(4);
        notasAlunos.add(2);
        notasAlunos.add(23);
        notasAlunos.add(14);
        notasAlunos.add(55);

        notasAlunos.add(23);

        logger.info("Notas alunos: {}", notasAlunos);
       

    }
    
}
