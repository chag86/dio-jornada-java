package br.com.chagas.map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExemploTreeMap {

    private static final Logger logger = LogManager.getLogger(ExemploTreeMap.class.getName());
    private static final String LOG_1 = "Capitais: {}";

    public static void main(String[] args) {

        TreeMap<String, String> treeCapitais = new TreeMap<>();

        // Adiciona os capeões mundiais fifa no mapa

        treeCapitais.put("RS", "Porto Alegre");
        treeCapitais.put("SC", "Florianópolis");
        treeCapitais.put("PR", "Curitiba");
        treeCapitais.put("SP", "São Paulo");
        treeCapitais.put("RJ", "Rio de Janeiro");
        treeCapitais.put("MG", "Belo Horizonte");

        logger.info(LOG_1,treeCapitais);

        logger.info("Primeira key: {}",treeCapitais.firstKey());
        
        logger.info("Última key: {}",treeCapitais.lastKey());
        
        logger.info("Capital abaixo da árvore da capital parametrizada: {}",treeCapitais.lowerKey("SC"));
        
        logger.info("Capital acima da árvore da capital parametrizada: {}",treeCapitais.higherKey("SC"));
        
        logger.info(LOG_1,treeCapitais);
        
        String firstEntry = treeCapitais.firstEntry().getKey() + " - " + treeCapitais.firstEntry().getValue();
        logger.info("Capital do topo da árvore: {}",firstEntry);
        
        String lastEntry = treeCapitais.lastEntry().getKey() + " - " + treeCapitais.lastEntry().getValue();
        logger.info("Capital do final da árvore: {}", lastEntry);
        
        String lowerEntry = treeCapitais.lowerEntry("SC").getKey() + " - " + treeCapitais.lowerEntry("SC").getValue();
        logger.info("Capital abaixo da árvore da capital parametrizada: {}",lowerEntry);
        
        String higherEntry = treeCapitais.higherEntry("SC").getKey() + " - " + treeCapitais.higherEntry("SC").getValue();
        logger.info("Capital acima da árvore da capital parametrizada: {}",higherEntry);

        Map.Entry<String,String> firsEntryByMap = treeCapitais.pollFirstEntry();
        firstEntry = firsEntryByMap.getKey() + " - " + firsEntryByMap.getValue();
        logger.info("Entry first by Map: {}",firstEntry);

        Map.Entry<String,String> lastEntryByMap = treeCapitais.pollLastEntry();
        lastEntry = lastEntryByMap.getKey() + " - " + lastEntryByMap.getValue();
        logger.info("Entry last by Map: {}",lastEntry);


        logger.info(LOG_1,treeCapitais);

        Iterator<String> iterator = treeCapitais.keySet().iterator();

        while (iterator.hasNext()) {
            String capital = iterator.next();
            logger.info("Capital [while]: {}",capital);
        }

        for (String capital : treeCapitais.keySet()) {
            logger.info("Capital [for I]: {}", treeCapitais.get(capital));
        }

        for (Map.Entry<String,String> capital : treeCapitais.entrySet()) {
            String c = capital.getKey() + " - " + capital.getValue();
            logger.info("Capital [for II]: {}", c );
        }
        
        logger.info("Tamanho: {}",treeCapitais.size());
        
        treeCapitais.clear();
        
        logger.info("Tamanho: {}",treeCapitais.size());
        
    }
    
}
