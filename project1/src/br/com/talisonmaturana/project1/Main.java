package br.com.talisonmaturana.project1;

public class Main {

    public static void main(String[] args) {

        //How to build a object?
        Time time = new Time();

        time.nome = "Corinthians";
        time.fundacao = 1910;
        time.temMundial = true;
        time.devedor = false;

        time.list();
    }
}
