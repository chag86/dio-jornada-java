package br.com.chagas.funcional;

import java.io.Serializable;
import java.util.function.UnaryOperator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Imutabilidade implements Serializable{

    /**
	 *
	 */
	private static final long serialVersionUID = 7930782167180615291L;

	private static final String NAME = Imutabilidade.class.getName();

    private static final Logger logger = LogManager.getLogger(NAME);


    public static void main(String[] args) {
        
        int valor = 20;
        UnaryOperator<Integer> retornarDobro = v -> v * 2;
        logger.info("{}", retornarDobro.apply(valor));
        logger.info("{}", valor);

    }  
}
