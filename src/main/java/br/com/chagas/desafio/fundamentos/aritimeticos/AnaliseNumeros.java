package br.com.chagas.desafio.fundamentos.aritimeticos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class AnaliseNumeros {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
    
        int valor1 = Integer.parseInt(st.nextToken());
    
        st = new StringTokenizer(br.readLine());
        int valor2 = Integer.parseInt(st.nextToken());
    
        st = new StringTokenizer(br.readLine());
        int valor3 = Integer.parseInt(st.nextToken());
    
        st = new StringTokenizer(br.readLine());
        int valor4 = Integer.parseInt(st.nextToken());
    
        st = new StringTokenizer(br.readLine());
        int valor5 = Integer.parseInt(st.nextToken());
    
        List<Integer> valores = new ArrayList<Integer>();
        
        valores.add(valor1);
        valores.add(valor2);
        valores.add(valor3);
        valores.add(valor4);
        valores.add(valor5);

        System.out.println(valores.stream().filter(valor -> valor % 2 == 0 ).count() + " valor(es) par(es)");
        System.out.println(valores.stream().filter(valor -> valor % 2 != 0 ).count() + " valor(es) impar(es)");
        System.out.println(valores.stream().filter(valor -> valor > 0).count() + " valor(es) positivo(s)");
        System.out.println(valores.stream().filter(valor -> valor < 0 ).count() + " valor(es) negativo(s)");

      }
}
