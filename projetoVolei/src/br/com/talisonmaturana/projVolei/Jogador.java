package br.com.talisonmaturana.projVolei;

import java.util.Scanner;

public class Jogador {


    public int numero;
    public String nome;
    public int idade;
    public String posicao;

    //Listar jogadores
    public void imprimir(){
        System.out.println("Nome do jogador: " + nome);
        System.out.println("Numero do jogador: " + numero);
        System.out.println("Idade do jogador: " + idade);
        System.out.println("Posição do jogador: " + posicao);

    }

    //Cadastrar jogadores
    public void cadastrarJogador(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número do jogador: ");
        numero = Integer.parseInt(scan.nextLine());
        System.out.println("Digite o nome do jogador: ");
        nome = scan.nextLine();
        System.out.println("Digite a idade do jogador: ");
        idade = Integer.parseInt(scan.nextLine());
        System.out.println("Digite a posição do jogador: ");
        posicao = scan.nextLine();
        System.out.println("Cadastro efetuado com sucesso");
    }
}
