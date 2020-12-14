package br.com.chagas.set;

import java.util.Iterator;
import java.util.TreeSet;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExemploTreeSet {

    private static final Logger logger = LogManager.getLogger(ExemploTreeSet.class.getName());
    private static final String LOG_1 = "Cidades: {}";

    public static void main(String[] args) {

        TreeSet<String> treeCapitais = new TreeSet<>();
        
        //adiciona notas no set criado

        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");


        logger.info(LOG_1, treeCapitais);
        String primeira = treeCapitais.first();
        logger.info("Primeira cidade: {}", primeira);
        String ultima = treeCapitais.last();
        logger.info("Última cidade: {}", ultima);
        String abaixoDe = treeCapitais.lower("Florianópolis");
        logger.info("Cidade abaixo da cidade selecionada (Florianópolis): {}", abaixoDe);

        logger.info(LOG_1, treeCapitais);
        String topoERemove = treeCapitais.pollFirst();
        logger.info("Cidade do topo da árvore: {}", topoERemove);
        
        String baseERemove = treeCapitais.pollLast();
        logger.info("Cidade do final da árvore: {}", baseERemove);
        
        logger.info(LOG_1, treeCapitais);

        logger.info("Tamanho: {}", treeCapitais.size());
        
        Iterator<String> iterator = treeCapitais.iterator();
        
        while (iterator.hasNext()) {
            String nota = iterator.next();
            logger.info("Cidade[while]: {}", nota);
        }
        
        for (String nota : treeCapitais) {
            logger.info("Cidade[for]: {}", nota);
        }
        
        logger.info("É vazio? : {}", treeCapitais.isEmpty());

    }
    
}
