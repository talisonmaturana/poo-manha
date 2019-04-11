package br.com.mercadinhodozezinho;

import java.util.Scanner;

public class Produto {

    private int codProduto;
    private String descricao;
    private double preco;
    private Fornecedor fornecedor;


    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String imprimirEtiqueta(){
        return
            "----------------------\n" +
            "Codigo do produto: " + this.getCodProduto() + "\n" +
            "Descrição: " + this.getDescricao() + "\n" +
            "Preço: " + this.getPreco() + "\n" +
            "Fornecedor: " + this.getFornecedor().imprimirFornecedor();
    }

}