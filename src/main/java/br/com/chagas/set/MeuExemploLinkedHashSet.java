package br.com.chagas.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MeuExemploLinkedHashSet {

    private static final Logger logger = LogManager.getLogger(MeuExemploLinkedHashSet.class.getName());

    public static void main(String[] args) {

        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();
        
        //adiciona notas no set criado

        sequenciaNumerica.add(16);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(1);


        logger.info("Notas alunos: {}", sequenciaNumerica);
       

    }
    
}
