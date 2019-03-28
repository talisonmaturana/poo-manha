package br.edu.fatecmm.prjestatico;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Conta.cpmf = 0.03;

        Conta c1, c2;
        c1 = new Conta();
        c2 = new Conta();
        c1.num = 1;
        c1.correntista = "Ze";
        c1.cpmf = 0.9999;

        c2.num = 2;
        c2.correntista = "Maria";

        c1.imprimir();
        c2.imprimir();

        System.out.println("Pi: " + Math.PI);

    }
}
