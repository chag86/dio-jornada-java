package br.com.chagas.map;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.com.chagas.set.ExemploTreeSet;

public class ExemploHashMap {

    private static final Logger logger = LogManager.getLogger(ExemploTreeSet.class.getName());
    private static final String LOG_1 = "Campeões: {}";

    public static void main(String[] args) {

        Map<String, Integer> campeoesMundialFifa = new HashMap<>();

        // Adiciona os capeões mundiais fifa no mapa

        campeoesMundialFifa.put("Brasil", 5);
        campeoesMundialFifa.put("Alemanha", 4);
        campeoesMundialFifa.put("Itália", 4);
        campeoesMundialFifa.put("Uruguai", 2);
        campeoesMundialFifa.put("Argentina", 2);
        campeoesMundialFifa.put("França", 2);
        campeoesMundialFifa.put("Inglaterra", 1);
        campeoesMundialFifa.put("Espanha", 1);

        logger.info(LOG_1,campeoesMundialFifa);

        campeoesMundialFifa.put("Brasil", 6);

        logger.info(LOG_1,campeoesMundialFifa);
        
        logger.info("Coleta index da Argentina: {}",campeoesMundialFifa.get("Argentina"));
        
        logger.info("Existe a França?: {}",campeoesMundialFifa.containsKey("França"));
        
        logger.info("Remove a França: {}",campeoesMundialFifa.remove("França"));
        
        logger.info("Existe a França?: {}",campeoesMundialFifa.containsKey("França"));
        
        logger.info(LOG_1,campeoesMundialFifa);
        
        for (Map.Entry<String,Integer> campeao : campeoesMundialFifa.entrySet()) {
            logger.info("Campeao[for I key]: {}", campeao.getKey());
            logger.info("Campeao[for I value]: {}", campeao.getValue());
        }
        
        for(String campeao:campeoesMundialFifa.keySet()){
            logger.info("Campeao[for II key]: {}", campeoesMundialFifa.get(campeao));
        }
        
        logger.info("Existe Estados Unidos? : {}", campeoesMundialFifa.containsKey("Estados Unidos"));
        
        logger.info("Existe algum Heptacampeão? : {}", campeoesMundialFifa.containsValue(6));
        
        logger.info("Tamanho: {}",campeoesMundialFifa.size());
        
        campeoesMundialFifa.clear();;
        
        logger.info("Tamanho: {}",campeoesMundialFifa.size());
        
    }

}
