package br.com.fluxy.principal;
import java.util.Scanner;

import br.com.fluxy.model.Conta;
import br.com.fluxy.model.Entradas;
import br.com.fluxy.model.Login;
import br.com.fluxy.model.Pendencias;
import br.com.fluxy.model.Saidas;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Login login = new Login();
        Conta conta = new Conta(login, 0.0);
        Entradas entradas = new Entradas();
        Pendencias pendencias = new Pendencias();
        Saidas saidas = new Saidas();
        int op, opent, oppen, opsai;

        System.out.println("\nDigite seu login:");
        System.out.print("Usuário: ");
        String usuario = sc.next() + sc.nextLine();
        System.out.print("Senha: ");
        String password = sc.nextLine();
        login.setUsuario(usuario);
        login.setPassword(password);
        login.doLogin();

        do{
            System.out.println("\nMENU INICIAL");
            System.out.println("O que deseja visualiar?\n1- Conta\n2- Entradas\n3- Pendências\n4- Saídas\n0- Sair");
            op = sc.nextInt();

            switch(op){
                case 1:
                    conta.exibirDadosConta();
                    break;
                case 2:
                    do{
                        System.out.println("\nMENU ENTRADAS");
                        System.out.println("Escolha uma opção:\n1- Registrar entrada\n2- Visualizar entradas\n0- Voltar");
                        opent = sc.nextInt();
                        switch(opent){
                            case 1:
                                System.out.print("Digite o valor que deseja registrar:");
                                double valorEntradas = sc.nextDouble();
                                entradas.registrarEntrada(valorEntradas);
                                entradas.registrarEntrada(valorEntradas);
                                conta.adicionarSaldo(valorEntradas);
                                break;
                            case 2:
                                System.out.print("Entradas: ");
                                entradas.visualizarEntradas();
                                break;
                            case 0:
                                System.out.println("Voltando ao Menu Inicial...");
                                break;
                    }
                    }while (opent!=0);
                    break;

                case 3:
                    do{
                        System.out.println("\nMENU PENDÊNCIAS");
                        System.out.println("Escolha uma opção:\n1- Registrar pendência\n2- Remover pendências\n3- Visualiar pendências\n0- Voltar");
                        oppen = sc.nextInt();
                        switch(oppen){
                            case 1:
                                System.out.print("Digite a pendência que deseja registrar: ");
                                double valorPendencias = sc.nextDouble();
                                pendencias.registrarPendencia(valorPendencias);
                                break;
                            case 2:
                                System.out.print("Digite o valor que deseja remover: ");
                                double removerPendencias = sc.nextDouble();
                                pendencias.removerPendencia(removerPendencias);
                                break;
                            case 3:
                                System.out.println("Pendências: ");
                                pendencias.visualziarPendencias();
                                break;
                            case 0:
                                System.out.println("Voltando ao Menu Inicial...");
                                break;

                        }
                    }while (oppen!=0);
                    break;

                case 4:
                    do{
                        System.out.println("\nSAÍDAS");
                        System.out.println("Escolha uma opção:\n1- Registrar saídas\n0- Voltar");
                        opsai = sc.nextInt();
                        switch(opsai){
                            case 1:
                                System.out.println("Digite o a descrição e o valor da saída: ");
                                System.out.print("Descrição: ");
                                String descricao = sc.nextLine();
                                System.out.print("Valor: ");
                                double valorSaida = sc.nextDouble();
                                saidas.setDescricao(descricao);
                                saidas.setValorSaida(valorSaida);
                                saidas.registrarSaida();
                                conta.subtrairSaldo(valorSaida);
                                break;
                            case 0:
                                System.out.println("Voltando ao Menu Inicial...");
                                break;

                        }

                    }while (opsai!=0);
                    break;
                    

            }
        }
        while (op!=0);

        sc.close();
    }


}
