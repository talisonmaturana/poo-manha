package br.edu.fatecmm.prjapolice;

public class TesteApolice {

    public static void main(String[] args) {
	// write your code here
        Apolice apolice =  new Apolice();
        apolice.nomeSegurado = "Pedrão";
        apolice.idade = 20;
        apolice.valorPremio = 200500f;
        //chamada do método imprimir
        apolice.imprimir();

    }
}
