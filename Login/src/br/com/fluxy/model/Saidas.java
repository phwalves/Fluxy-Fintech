package br.com.fluxy.model;

public class Saidas extends Transacao {

    private String tipoDespesa;

    Conta contaUsuario = new Conta();

    public Saidas(){}

    public Saidas(String descricao, double valor, String tipoDespesa){
        super(descricao, valor);
        this.tipoDespesa = tipoDespesa;
    }

    public void registrarSaida() {
        System.out.println("\nSaída registrada! Categoria: " + tipoDespesa);
        contaUsuario.subtrairSaldo(this.getValor());
    }

    public String getTipoDespesa() {
        return tipoDespesa;
    }

    public void setTipoDespesa(String tipoDespesa) {
        this.tipoDespesa = tipoDespesa;
    }

    
}
