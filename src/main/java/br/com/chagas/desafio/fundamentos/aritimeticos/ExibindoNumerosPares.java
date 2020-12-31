package br.com.chagas.desafio.fundamentos.aritimeticos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ExibindoNumerosPares {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int valor1 = Integer.parseInt(st.nextToken());
        
        for(int i=0; i <= valor1; i++){
          if(i % 2 == 0 && i > 0){ //é par
            System.out.println(i);
          }
        }
        
      }
}
