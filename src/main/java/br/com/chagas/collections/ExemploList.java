package br.com.chagas.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExemploList {

    private static final Logger logger = LogManager.getLogger(ExemploList.class.getName());
    private static final String ACTION_1 = "Valor da lista {}";
    
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");
        nomes.indexOf("Tatiana");

        logger.info(ACTION_1, nomes); // Noncompliant

        nomes.set(2, "Larissa");

        logger.info(ACTION_1, nomes); // Noncompliant

        Collections.sort(nomes);

        nomes.set(2, "Wesley");

        nomes.remove(4);

        nomes.remove("Wesley");

        logger.info(ACTION_1, nomes);

        String nome = nomes.get(1);

        logger.info("Nome {}", nome);

        int tamanho = nomes.size();

        logger.info("Tamanho {}", tamanho);

        nomes.remove("Larissa");

        tamanho = nomes.size();

        logger.info("Tamanho {}", tamanho);

        boolean temNome = nomes.contains("Anderson");

        logger.info("Tem nome: {}", temNome);
        
        temNome = nomes.contains("Fernando");
        
        logger.info("Tem nome: {}", temNome);

        int posicao = nomes.indexOf("Pedro");

        logger.info(ACTION_1, nomes);

        logger.info("Posição na lista {}", posicao);

        for(String nomeDoItem : nomes){
                logger.info("[for]---> {}", nomeDoItem);
        }

        Iterator<String> iterator = nomes.iterator();

        while (iterator.hasNext()) {
                String nomeIterator = iterator.next();
                logger.info("[iterator]---> {}", nomeIterator);
        }


        nomes.clear();

        

    }
}
