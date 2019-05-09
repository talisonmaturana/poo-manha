package br.com.controledecaixa.Business;

import br.com.controledecaixa.Utilities.ControleDeCaixaException;

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

    public String sacar(double valor) throws ControleDeCaixaException {
        try {
            if (valor > saldo) throw new ControleDeCaixaException();
        } catch (Exception e) {
            throw e;
        }
        saldo -= valor;
        return "Saque efetuado com sucesso";
    }
}
