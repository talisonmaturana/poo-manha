package br.edu.fatecmm.projeto1;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Como construir um objeto ?
        Time x = new Time(); //Chamada do construtor
        x.nome = "SPFC"; //Atribuição dos dados
        x.fundacao = 1930;
        x.temMundial = true;
        x.devedor = false;
        //Imprimir os dados
        x.listar();
    }
}
