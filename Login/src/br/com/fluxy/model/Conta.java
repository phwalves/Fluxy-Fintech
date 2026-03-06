package br.com.fluxy.model;

public class Conta {

    private Login dadosLogin;
    private double saldoAtual;

    public Conta() {}

    public Conta(Login dadosLogin, double saldoAtual){
        this.dadosLogin = dadosLogin;
        this.saldoAtual = saldoAtual;
    }

    public void adicionarSaldo(double valor){
        this.saldoAtual += valor;
        System.out.println("Saldo atual: R$" + saldoAtual);
    }

    public void subtrairSaldo(double valor){
        this.saldoAtual -= valor;
        System.out.println("Saldo atual: R$" + saldoAtual);
    }

    public void exibirDadosConta () {

        System.out.println("\nDados da Conta");
        System.out.println("Usuário: " + dadosLogin.getUsuario());
        // System.out.println("Senha: " + dadosLogin.getPassword());
        System.out.println("Saldo disponível: R$" + saldoAtual);

    }

    public Login getDadosLogin() {
        return dadosLogin;
    }

    public void setDadosLogin(Login dadosLogin) {
        this.dadosLogin = dadosLogin;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    

}
