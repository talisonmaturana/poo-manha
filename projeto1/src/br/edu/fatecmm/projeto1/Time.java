package br.edu.fatecmm.projeto1;

public class Time {
    //Definir Atributos
    String nome;
    int fundacao;
    boolean devedor;
    boolean temMundial;

    //Definir m�todos
    void listar(){
        System.out.println("Nome do Time: " + nome);
        System.out.println("Funda��o: " + fundacao);
        if(devedor){
            System.out.println("Time Caloteiro");
        }else{
            System.out.println("Time em dia com suas contas");
        }
        if(temMundial){
            System.out.println("Parab�ns, est� no clube seleto");
        }else{
            System.out.println("E a� Palmeiras ?");
        }
    }
}
