package br.com.controledecaixa.Business;

public class Caixa {

    public double saldo;

    public double getSaldo(){
        return saldo;
    }

    public String depositar(double valor){
        if(valor > 0) {
            saldo += valor;
            return "Deposito de " + valor + " efetuado com sucesso!";
        } else {
            return "Valor invalido para deposito";
        }
    }

    public String sacar(double valor) {
        if(valor <= saldo){
            saldo -= valor;
            return "Saque de " + valor + " efetuado com sucesso";
        }else {
            return "Saldo insuficiente";
        }
    }
}
