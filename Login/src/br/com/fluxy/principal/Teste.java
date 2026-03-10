package br.com.fluxy.principal;

import br.com.fluxy.model.Conta;
import br.com.fluxy.model.Entradas;
import br.com.fluxy.model.Login;
import br.com.fluxy.model.Saidas;

public class Teste {

    public static void main(String[] args) {
        
        System.out.println("--- Atividade | Cap 8 ---");

        Login loginTeste = new Login("pedro","senha123");
        Conta contaTeste = new Conta(loginTeste, 0.0);
        contaTeste.exibirDadosConta();
        
        Entradas entradas = new Entradas("Pagamento", 500.00, "Freelance");
        entradas.registrarEntrada();
        contaTeste.adicionarSaldo(entradas.getValor());
        entradas.exibirDetalhes();
        contaTeste.exibirDadosConta();

        Saidas compraMercado = new Saidas("Compras", 150.00, "Alimentação");
        compraMercado.registrarSaida();
        contaTeste.subtrairSaldo(compraMercado.getValor());
        compraMercado.exibirDetalhes();
        contaTeste.exibirDadosConta();

        System.out.println("\n--- Fim Atividade | Cap 8 ---");

    }

}
