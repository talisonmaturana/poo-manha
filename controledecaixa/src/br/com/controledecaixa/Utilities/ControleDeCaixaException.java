package br.com.controledecaixa.Utilities;

public class ControleDeCaixaException extends Exception{
    public String getMessage(int codigoErro){
        String erro = "";
        if(codigoErro == 1){
            erro = "Valor invalido. Valor deve ser maior que ZERO";
        }
        if(codigoErro == 2){
            erro = "Saldo insuficiente para operação";
        }
        return erro;
    }
}
