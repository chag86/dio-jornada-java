package br.com.chagas.desafio.fundamentos.aritimeticos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
Desafio

Faça a leitura de um valor inteiro.
Em seguida,calcule o menor número de notas possíveis(cédulas)onde o valor pode ser decomposto.
As notas que você deve considerar são de 100,50,20,10,5,2 e 1. 
Na sequência mostre o valor lido e a relação de notas necessárias.


Entrada
Você receberá um valor inteiro N (0 < N < 1000000).

Saída
Exiba o valor lido e a quantidade mínima de notas de cada tipo necessárias, 
seguindo o exemplo de saída abaixo. Após cada linha deve ser imprimido o fim de linha.

Exemplo de Entrada	Exemplo de Saída
576

576
5 nota(s) de R$ 100,00
1 nota(s) de R$ 50,00
1 nota(s) de R$ 20,00
0 nota(s) de R$ 10,00
1 nota(s) de R$ 5,00
0 nota(s) de R$ 2,00
1 nota(s) de R$ 1,00

*/
public class ContagemCedulas {

    private static final Logger logger = LogManager.getLogger(ContagemCedulas.class.getName());

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        Locale.setDefault(new Locale("pt", "BR"));
    
        int valor = Integer.parseInt(st.nextToken());

        List<Integer> cedulas = new ArrayList<>();
        cedulas.add(100);
        cedulas.add(50);
        cedulas.add(20);
        cedulas.add(10);
        cedulas.add(5);
        cedulas.add(2);
        cedulas.add(1);

        Iterator<Integer> iterator = cedulas.iterator();
        System.out.println(valor);
        while(iterator.hasNext()){
            Integer cedula = iterator.next();
            Integer sub = valor / cedula;
            System.out.printf("%d nota(s) de R$ %.2f\n",sub , Double.valueOf(cedula));
            valor = valor - sub * cedula;
        }
          
    }


}
