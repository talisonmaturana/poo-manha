package br.com.talisonmaturana.projVolei;

import java.util.Scanner;

public class Time {

    public int id;
    public String nome;
    public Jogador[] vetJogador = new Jogador[6];
    public int indiceJog = 0;

    //Listar todos os jogadores
    public void listarJogadores(){
        System.out.println("LISTA DE JOGADORES DO TIME");
        System.out.println("--------------------------");
        for (Jogador j : vetJogador) {
            if (j != null) j.imprimir();
        }
    }

    //Cadastrar times
    public void cadastrarTime(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o id do Time: ");
        id = Integer.parseInt(scan.nextLine());
        System.out.println("Digite o nome do Time: ");
        nome = scan.nextLine();
        System.out.println("Cadastro realizado com sucesso");
    }

    //Listar times
    public void imprimir() {
        System.out.print("Id do time: " + id);
        System.out.print(" - Nome do time: " + nome);

    }
}
