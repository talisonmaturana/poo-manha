package br.edu.fatecmm.projetoconta;

import java.util.Scanner;

public class ContaTeste {
    public Conta cc = new Conta();

    public static void main(String[] args) {
	// write your code here
        ContaTeste ct = new ContaTeste();
        Scanner sc = new Scanner(System.in);
        int opc=0;
        do{
            System.out.println("1.. Cadastrar");
            System.out.println("2.. Depositar");
            System.out.println("3.. Sacar");
            System.out.println("4.. Consultar");
            System.out.println("9.. Sair");
            System.out.println("Digite sua opção: ");
            opc = Integer.parseInt(sc.nextLine());
            switch (opc){
                case 1:
                    ct.execCadastrar();
                    break;
                case 2:
                    ct.execDepositar();
                    break;
                case 3:
                    ct.execSacar();
                    break;
                case 4:
                    ct.execConsultar();
                    break;
                case 9:
                    System.out.println("Fim");
                    break;
                default:
                        System.out.println("opção inválida");
            }
        }while(opc!=9);
    }

    public void execCadastrar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do Cliente");
        cc.nomeCliente = sc.nextLine();
        System.out.println("Digite o nome da Agencia");
        cc.agencia = sc.nextLine();
        System.out.println("Digite o numero da Conta");
        cc.conta = sc.nextLine();
        System.out.println("Cliente cadastrado com sucesso");
    }

    public void execConsultar(){
        cc.imprimir();
    }

    public void execDepositar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do depósito: ");
        cc.depositar(Double.parseDouble(sc.nextLine()));
        System.out.println("Depósito efetuado com sucesso");
    }

    public void execSacar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do saque: ");
        double valorSaque = Double.parseDouble(sc.nextLine());
        int r = cc.sacar(valorSaque);
        if(r==1){
            System.out.println("Saque efetuado com sucesso");
        }else{
            System.out.println("Não possui saldo para operação");
        }

    }
}
