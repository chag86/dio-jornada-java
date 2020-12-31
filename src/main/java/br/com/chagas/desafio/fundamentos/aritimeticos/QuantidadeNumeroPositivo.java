package br.com.chagas.desafio.fundamentos.aritimeticos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class QuantidadeNumeroPositivo {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;
        
        double valor1 = Double.parseDouble(st.nextToken());
        if(valor1 > 0)
          count++;
          
        st = new StringTokenizer(br.readLine());
        double valor2 = Double.parseDouble(st.nextToken());
        if(valor2 > 0)
          count++;
        
    
        st = new StringTokenizer(br.readLine());
        double valor3 = Double.parseDouble(st.nextToken());
        if(valor3 > 0)
          count++;
        
        st = new StringTokenizer(br.readLine());
        double valor4 = Double.parseDouble(st.nextToken());
        if(valor4 > 0)
          count++;
        
        st = new StringTokenizer(br.readLine());
        double valor5 = Double.parseDouble(st.nextToken());
        if(valor5 > 0)
          count++;
        
        st = new StringTokenizer(br.readLine());
        double valor6 = Double.parseDouble(st.nextToken());
        if(valor6 > 0)
          count++;
          
        System.out.println(count + " valores positivos");
        
      }
}
