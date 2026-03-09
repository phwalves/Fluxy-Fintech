package br.com.fluxy.model;

public class Pendencias {

    private double[] valorPendencias = new double[100];

    private int quantidadeAtual = 0;

    public Pendencias(){}

    public Pendencias(double[] valorPendencias){
        this.valorPendencias = valorPendencias;
    }

    public void registrarPendencia(double valorDigitado){
        if (quantidadeAtual < 100){
            valorPendencias[quantidadeAtual] = valorDigitado;
            quantidadeAtual++;
            System.out.println("Registrando o valor digitado: R$" + valorDigitado);
        }
    }

    public void removerPendencia(double valorDigitado){
        boolean encontrou = false;

        for (int i=0;i<quantidadeAtual;i++){
            if (valorPendencias[i] == valorDigitado){
                valorPendencias[i] = 0.0;
                encontrou = true;
                System.out.println("Pendência de R$" + valorDigitado + " foi removida com sucesso!");
                break;
            }
        }

        if (!encontrou) {
                System.out.println("Nenhuma pendência nesse valor foi encontrada.");
            }
    }

    public void visualziarPendencias(){
        if (quantidadeAtual == 0){
            System.out.println("Nenhua pendência registrada.");
        } else {
            for (int i = 0; i<quantidadeAtual; i++){
                System.out.println("Pendência " + (i+1) + " R$ " + valorPendencias[i]);
            }
        }
    }

    public double[] getValorPendencias() {
        return valorPendencias;
    }

    public void setValorPendencias(double[] valorPendencias) {
        this.valorPendencias = valorPendencias;
    }

    public int getQuantidadeAtual() {
        return quantidadeAtual;
    }

    public void setQuantidadeAtual(int quantidadeAtual) {
        this.quantidadeAtual = quantidadeAtual;
    }

    



}
