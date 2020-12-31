package br.com.chagas.optionals;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.com.chagas.set.ExemploTreeSet;

public class ExemploOptionalPrimitivos {
    
    private static final Logger logger = LogManager.getLogger(ExemploTreeSet.class.getName());


    public static void main(String[] args) {

        Optional<String> optionalString = Optional.of("Valor presente");
        
        optionalString.ifPresentOrElse(logger::info,()-> logger.info("{}","Não está presente."));
        
        Optional<String> optionalNull = Optional.ofNullable(null);
        
        optionalNull.ifPresentOrElse(logger::info,()->logger.info("{}","null = não está presente."));
        
        Optional<String> optionalEmpty = Optional.empty();
        
        optionalEmpty.ifPresentOrElse(logger::info,()->logger.info("{}","empty = não está presente."));
        
        //Optional<String> optionalNullErro = Optional.of(null);
        
        //optionalNullErro.ifPresentOrElse(logger::info,()->logger.info("{}","erro = não está presente."));
        
        OptionalInt.of(12).ifPresent(logger::info);
        
        OptionalDouble.of(55.0).ifPresent(logger::info);
        
        OptionalLong.of(23L).ifPresent(logger::info);
        
        
        Optional<String> empty = Optional.of("23");
        

    }
}
