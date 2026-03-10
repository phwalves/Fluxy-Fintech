package br.com.fluxy.model;

public class Entradas extends Transacao{
    
    private String tipoEntrada;
    

    Conta contaUsuario = new Conta();

    public Entradas(){}

    public Entradas(String descricao, double valor, String tipoEntrada){
        super(descricao, valor);
        this.tipoEntrada = tipoEntrada;
    }

    public void registrarEntrada(){
        System.out.println("\nEntrada registrada! Categoria: " + tipoEntrada);
        contaUsuario.adicionarSaldo(this.getValor());
    }

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    



}
