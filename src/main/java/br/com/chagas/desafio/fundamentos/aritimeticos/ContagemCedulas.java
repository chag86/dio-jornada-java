package br.com.chagas.desafio.fundamentos.aritimeticos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

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

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
    
        int valor = Integer.parseInt(st.nextToken());
        int[] cedulas = {100,50,20,10,5,2,1};

        System.out.println(Arrays.stream(cedulas).filter(n->new BigDecimal(n))).reduce(Integer.valor, Integer::divide);


        


    }    
}
