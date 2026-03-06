package br.com.fluxy.model;

public class Entradas {

    private double[] valorEntradas = new double[100];

    private int quantidadeAtual = 0;

    public Entradas(){}

    public Entradas(double[] valorEntradas){
        this.valorEntradas = valorEntradas;
    }

    public void registrarEntrada(double valorDigitado){
        if (quantidadeAtual < 100){
            valorEntradas[quantidadeAtual] = valorDigitado;
            quantidadeAtual++;
            System.out.println("Registrando o valor digitado: R$" + valorDigitado);
        }
    }

    public void visualizarEntradas(){
        if (quantidadeAtual == 0){
            System.out.println("Nenhum valor registrado ainda.");
        } else {
            for (int i = 0; i<quantidadeAtual; i++){
                System.out.println("Entrada " + (i+1) + " R$ " + valorEntradas[i]);
            }
        }
    }

    public double[] getValorEntradas() {
        return valorEntradas;
    }

    public void setValorEntradas(double[] valorEntradas) {
        this.valorEntradas = valorEntradas;
    }

    public int getQuantidadeAtual() {
        return quantidadeAtual;
    }

    public void setQuantidadeAtual(int quantidadeAtual) {
        this.quantidadeAtual = quantidadeAtual;
    }

    

    
    

}
