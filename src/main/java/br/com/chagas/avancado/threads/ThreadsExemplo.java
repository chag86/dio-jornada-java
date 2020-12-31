package br.com.chagas.avancado.threads;

public class ThreadsExemplo {

    public static void main(String[] args) {
        GeradorPDF iniciarGeraradorPdf = new GeradorPDF();
        BarraDeCarregamento iniciarBarraDeCarregamento = new BarraDeCarregamento(iniciarGeraradorPdf);

        iniciarGeraradorPdf.start();
        iniciarBarraDeCarregamento.start();
    }

}

class GeradorPDF extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("Iniciar geração de PDF...");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("PDF gerado.");
    }

}

class BarraDeCarregamento extends Thread {
    private Thread iniciarGeraradorPdf;

    public BarraDeCarregamento(Thread iniciarGeraradorPdf) {
        this.iniciarGeraradorPdf = iniciarGeraradorPdf;
    }

    @Override
    public void run() {
        while(true){
            try{
                
                Thread.sleep(500);
                
                if(!iniciarGeraradorPdf.isAlive()){
                    break;
                }
                System.out.println("Loading....");
            }catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}