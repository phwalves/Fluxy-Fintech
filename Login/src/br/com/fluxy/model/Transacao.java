package br.com.fluxy.model;

public class Transacao {

    private String descricao;
    private double valor;

    public Transacao(){}

    public Transacao(String descricao, double valor){
        this.descricao = descricao;
        this.valor = valor;
    }

    public void exibirDetalhes(){
        System.out.println("Transação: " + descricao + " | Valor: R$" + valor);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    

}
