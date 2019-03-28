package br.com.talisonmaturana.projFuncionario;

import java.util.Scanner;

public class PrincipalFuncionarios {

    public int indice = 0;
    public static final int T = 10;
    public Funcionario[] func = new Funcionario[T];

    public static void main(String[] args) {
        PrincipalFuncionarios pf = new PrincipalFuncionarios();
        Scanner scan = new Scanner(System.in);
        int opc = 0;

        do{
            System.out.println("Menu Principal");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Consultar");
            System.out.println("3 - Bonificar");
            System.out.println("9 - Sair");
            System.out.println("Digite a opção: ");
            opc = Integer.parseInt(scan.nextLine());
        } while (opc != 9);
    }

    public void execCadastro(){

    }

    public void execBonificacao(){

    }

    public void execConsulta(){

    }
}
