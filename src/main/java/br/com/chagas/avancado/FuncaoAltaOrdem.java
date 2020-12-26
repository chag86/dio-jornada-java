package br.com.chagas.avancado;

public class FuncaoAltaOrdem {

    public static void main(String[] args) {
        Calculo SOMA = (a, b) -> a + b;
        Calculo SUBS = (a, b) -> a - b;
        Calculo DIVS = (a, b) -> a / b;
        Calculo MULT = (a, b) -> a * b;

        System.out.println(executarCalculo(SOMA, 1, 3));
        System.out.println(executarCalculo(SUBS, 4, 3));
        System.out.println(executarCalculo(DIVS, 4, 2));
        System.out.println(executarCalculo(MULT, 7, 3));

    }

    public static int executarCalculo(Calculo calculo, int a, int b) {
        return calculo.calcular(a, b);
    }

}

@FunctionalInterface
interface Calculo {
    public int calcular(int a, int b);
}
