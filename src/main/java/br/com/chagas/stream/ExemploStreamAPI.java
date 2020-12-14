package br.com.chagas.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExemploStreamAPI {

    private static final Logger logger = LogManager.getLogger(ExemploStreamAPI.class.getName());

    public static void main(String[] args) {
        List<String> estudantes = new ArrayList<>();

        estudantes.add("Pedro");
        estudantes.add("Thayse");
        estudantes.add("Marcelo");
        estudantes.add("Carla");
        estudantes.add("Juliana");
        estudantes.add("Thiago");
        estudantes.add("Rafael");


        logger.info("Lista de elementos {}",estudantes);

        logger.info("Tamanho da lista de elementos {}",estudantes.stream().count());
        
        logger.info("Elemento com maior número de letras: {}",estudantes.stream().max(Comparator.comparingInt(String::length)));
        
        logger.info("Elemento com menor número de letras: {}",estudantes.stream().min(Comparator.comparingInt(String::length)));
        
        logger.info("Elemento que contem R: {}",estudantes.stream().filter((estudante) -> 
            estudante.toLowerCase().contains("r")).collect(Collectors.toList()));
        
        logger.info("Retorna nova coleção com o tamanho de cada Elemento: {}",estudantes.stream().map((estudante) -> 
            estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));


        logger.info("Retorna os 3 primeiros Elementos: {}",estudantes.stream().limit(3).collect(Collectors.toList()));
        
        
        logger.info("Exibe cada elemento e retorna a lista: {}",estudantes.stream().peek( e -> logger.info("Elemento [peek]: {}",e)).collect(Collectors.toList()));
        
        estudantes.stream().forEach( e -> logger.info("Elemento [forEach]: {}",e));
        
        logger.info("Existe elemento com W no nome?: {}",estudantes.stream().allMatch( e -> e.contains("W")));
        
        logger.info("Existe elemento com a minúsculo?: {}",estudantes.stream().anyMatch( e -> e.contains("a")));
        
        logger.info("Não existe elemento com a minúsculo: {}",estudantes.stream().noneMatch( e -> e.contains("a")));
        
        estudantes.stream().findFirst().ifPresent(e -> logger.info("Elemento [findFirst]: {}",e));

        logger.info("Operação encadeada: {}",estudantes.stream()
        .peek(e -> logger.info("Elemento [peek I]: {}",e))
        .map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length())))
        .peek(e -> logger.info("Elemento [peek II]: {}",e))
        .filter(estudante -> estudante.toLowerCase().contains("r"))
        //.collect(Collectors.toList());
        //.collect(Collectors.toSet()));
        .collect(Collectors.groupingBy(estudante -> estudante.substring(estudante.indexOf("-") + 1))));


    }
    
}
