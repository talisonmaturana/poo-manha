package br.com.talisonmaturana.prjApolice;

public class Apolice {

    private String nomeSegurado;
    private int idade;
    private float valorPremio;

    protected String getNomeSegurado() {
        return nomeSegurado;
    }

    protected void setNomeSegurado(String nomeSegurado) {
        this.nomeSegurado = nomeSegurado;
    }

    protected int getIdade() {
        return idade;
    }

    protected void setIdade(int idade) {
        this.idade = idade;
    }

    protected float getValorPremio() {
        return valorPremio;
    }

    protected void setValorPremio(float valorPremio) {
        this.valorPremio = valorPremio;
    }

    protected void imprimir(){
        System.out.println("Nome do segurado = " + nomeSegurado);
        System.out.println("Idade do segurado = " + idade);
        System.out.println("Valor do premio = " + valorPremio);
    }

}
