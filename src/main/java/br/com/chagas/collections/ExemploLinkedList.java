package br.com.chagas.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExemploLinkedList {

    private static final Logger logger = LogManager.getLogger(ExemploLinkedList.class.getName());
    private static final String LOG1 = "Conteudo da queue: {}";
    public static void main(String[] args){

        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Pamela");
        filaBanco.add("Patrícia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Anderson");

        logger.info(LOG1, filaBanco);

        String clienteASerAtendido = filaBanco.poll();

        logger.info("Cliente da vez e que é removido da fila: {}", clienteASerAtendido);

        logger.info(LOG1, filaBanco);
        
        
        String primeiroCliente = filaBanco.peek();
        
        logger.info("Cliente da vez e que NÃO é removido da fila: {}", primeiroCliente);
        
        logger.info(LOG1, filaBanco);
        
        //filaBanco.clear();

        String primeiroClienteOuErro = filaBanco.element();

        logger.info("Cliente da vez ou ERRO: {}", primeiroClienteOuErro);
        
        logger.info(LOG1, filaBanco);

        for (String cliente: filaBanco) {
            logger.info("Cliente [for] --->{}",cliente);
        }

        Iterator<String> iterator = filaBanco.iterator();
        
       
        while (iterator.hasNext()) {
            logger.info("Cliente [while] --->{}",iterator.next());
        }

        logger.info("Tamanho --->{}", filaBanco.size());

        logger.info("É vazia --->{}", filaBanco.isEmpty());


        filaBanco.add("Wesley");

        logger.info(LOG1, filaBanco);

    }    
}