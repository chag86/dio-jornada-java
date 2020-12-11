package br.com.chagas.set;

import java.util.Iterator;
import java.util.TreeSet;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MeuExemploTreeSet {

    private static final Logger logger = LogManager.getLogger(MeuExemploTreeSet.class.getName());
    private static final String LOG_1 = "Cidades: {}";

    public static void main(String[] args) {

        TreeSet<String> treeCapitais = new TreeSet<>();
        
        //adiciona notas no set criado

        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");

        System.out.println(treeCapitais);

    }
    
}
