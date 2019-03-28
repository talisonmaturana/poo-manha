package br.com.talisonmaturana.projVolei;

import java.util.Scanner;

public class GerenciarTimes {

    public int indice = 0;
    public Time[] vetTime = new Time[5];

    public static void main(String[] args) {
        GerenciarTimes gt = new GerenciarTimes();
        Scanner scan = new Scanner(System.in);
        int opc = 0;

        do{
            System.out.println("Menu Principal");
            System.out.println("1..Cadastrar Time");
            System.out.println("2..Cadastrar Jogador");
            System.out.println("3..Listar todos os Times");
            System.out.println("4..Listar Jogadores do Time");
            System.out.println("9..Sair");
            System.out.println("Digite a opção: ");
            opc = Integer.parseInt(scan.nextLine());
            switch (opc) {
                case 1:
                    gt.execCadastraTime();
                    break;
                case 2:
                    System.out.println("Digite o indice que quer cadastrar: ");
                    int indice = Integer.parseInt(scan.nextLine());
                    gt.execCadastrarJogadores(indice);
                    break;
                case 3:
                    System.out.println("LISTANDO TODOS OS TIMES CADASTRADOS");
                    System.out.println("-----------------------------------");
                    gt.execListarTimes();
                    System.out.println("\n-----------------------------------");
                    break;
                case 4:
                    System.out.print("Digite o indice do time que deseja listar os jogadores: ");
                    indice = Integer.parseInt(scan.nextLine());
                    gt.execListarJogadoresDeUmTime(indice);
                    break;
                case 9:
                    System.out.println("FIM");
                    break;
                default:
                    System.out.println("opção inválida");
            }
        }while (opc != 9);
    }

    public void execCadastraTime(){
        if (indice >= 5){
            System.out.println("Quantidade máxima de times já cadastrado.");
            return;
        } else {
            vetTime[indice] = new Time();
            vetTime[indice].cadastrarTime();
            indice++;
        }
    }

    public void execListarTimes() {
        if (indice != 0) {
            for (int i = 0; i < indice; i++) {
                if (vetTime[i] != null) {
                    vetTime[i].imprimir();
                }
            }
        } else {
            System.out.println("Nenhum time cadastrado!");
        }
    }

    public void execCadastrarJogadores(int indice){
        if(vetTime[indice] != null) {
            vetTime[indice].vetJogador[vetTime[indice].indiceJog] = new Jogador();
            vetTime[indice].vetJogador[vetTime[indice].indiceJog].cadastrarJogador();
            vetTime[indice].indiceJog++;
            System.out.println("Jogador cadastrado com sucesso!");
            System.out.println("-------------------------------");
        }
    }

    public void execListarJogadoresDeUmTime(int indice){

        if(vetTime[indice] != null){
            vetTime[indice].listarJogadores();
        } else {
            System.out.println("Time inexistente");
        }
    }
}