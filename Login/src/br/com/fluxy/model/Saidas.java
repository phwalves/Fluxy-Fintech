package br.com.fluxy.model;

public class Saidas {

    private String descricao;
    private double valorSaida;

    public Saidas(){}

    public Saidas(String descricao, double valorSaida){
        this.descricao = descricao;
        this.valorSaida = valorSaida;
    }

    public void registrarSaida() {
        System.out.println("Registrando a saída de dinheiro: " + descricao + " no valor de R$" + valorSaida);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorSaida() {
        return valorSaida;
    }

    public void setValorSaida(double valorSaida) {
        this.valorSaida = valorSaida;
    }

    



}
