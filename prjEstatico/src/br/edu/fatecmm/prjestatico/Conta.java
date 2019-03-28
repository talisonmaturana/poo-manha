package br.edu.fatecmm.prjestatico;

public class Conta {
    public int num;
    public String correntista;
    public static double cpmf;

    public void imprimir(){
        System.out.println("num = " + num);
        System.out.println("correntista = " + correntista);
        System.out.println("cpmf = " + cpmf);
    }
}
