package br.edu.fatecmm.projetocomputador;

public class ComputadorTeste {

    public static void main(String[] args) {
	// write your code here
        Computador c1 = new Computador();
        c1.marca = "hp";
        c1.cor = "branca";
        c1.modelo = "sei lá";
        c1.numeroSerie = 1234;
        c1.preco = 1000.0;
        c1.imprimir();
        c1.calcularValor();
        c1.imprimir();

        Computador c2 = new Computador();
        c2.marca = "ibM";
        c2.cor = "prata";
        c2.modelo = "novo";
        c2.numeroSerie = 234;
        c2.preco = 2000.0;
        c2.imprimir();
        c2.calcularValor();
        c2.imprimir();

        if(c2.alterarValor(-1.0)==1){
            System.out.println("Valor Alterado");
        }else{
            System.out.println("Valor não Alterado");
        }
        c2.imprimir();
    }
}
