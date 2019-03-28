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

        for (int i = 0; i < 100 ; i++) {
            //System.out.println("i = " + i);
        }
        
        int x = 1;
        while (x != 10){
            System.out.println("x = " + x);
            x++;
        }
    }
}
