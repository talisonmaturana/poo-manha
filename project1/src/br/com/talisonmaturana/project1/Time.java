package br.com.talisonmaturana.project1;

public class Time {

    //set attributes
    String nome;
    int fundacao;
    boolean devedor;
    boolean temMundial;

    //set methods
    void list(){
        System.out.println("Nome do time: " + nome);
        System.out.println("Fundação: " + fundacao);

        if(devedor){
            System.out.println("Time caloteiro");
        } else {
            System.out.println("Time em dia com suas contas");
        }

        if(temMundial){
            System.out.println("Parabéns, está no clube seleto");
        } else {
            System.out.println("E ai Palmeiras");
        }
    }
}
