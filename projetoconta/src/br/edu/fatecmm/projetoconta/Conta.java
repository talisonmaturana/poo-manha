package br.edu.fatecmm.projetoconta;

public class Conta {
    public String conta;
    public String agencia;
    public double saldo;
    public String nomeCliente;

    public int sacar(double valor){
        if(valor <= saldo){
           saldo-= valor;
           return 1;
        }
        return 0;
    }
    public void depositar(double valor){
        saldo += valor;
    }
    public void imprimir(){
        System.out.println("Nome do Cliente = " + nomeCliente);
        System.out.println("Conta = " + conta);
        System.out.println("Ag�ncia = " + agencia);
        System.out.println("Saldo = " + saldo);
        System.out.println("");
    }
}
