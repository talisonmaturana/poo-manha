package br.com.talisonmaturana.prjApolice;

public class Main {

    public static void main(String[] args) {

        Apolice apolice = new Apolice();

        apolice.setNomeSegurado("Talison");
        apolice.setIdade(19);
        apolice.setValorPremio(200500f);

        apolice.getNomeSegurado();
        apolice.getIdade();
        apolice.getValorPremio();

        apolice.imprimir();
    }
}
