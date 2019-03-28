package br.edu.fatecmm.projetocomputador;

public class Computador {
    public String marca;
    public String cor;
    public String modelo;
    public long numeroSerie;
    public double preco;

    public void imprimir(){
        System.out.println("Marca = " + marca);
        System.out.println("Cor = " + cor);
        System.out.println("Modelo = " + modelo);
        System.out.println("Número de Série = " + numeroSerie);
        System.out.println("Preço = " + preco);
        System.out.println("");
    }

    public void calcularValor() {
        if(marca.equalsIgnoreCase("hp")){
            preco *= 1.3;
            return;
        }
        if(marca.equalsIgnoreCase("ibm")){
            preco *= 1.5;
        }
    }

    public int alterarValor(double valor){
        if(valor>0){
            preco = valor;
            return 1;
        }
        return 0;
    }
}
