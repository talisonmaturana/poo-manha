package br.com.mercadinhodozezinho;

import java.util.Scanner;

public class Cesta {
    Fornecedor fornecedor;
    private Produto[] itens;
    private int index;

    public int getIndice(){ return index; }

    public Cesta(){
        itens = new Produto[10];
        index = 0;
    }

    public void adicionarItem(Produto produto){
        if(index < 10){
            itens[index++] = produto;
        }
    }

    public void exibirLista(){
        if(index == 0) {
            System.out.println("Nenhum item na lista");
        }else{
            for(int i =0; i < index; i++){
                System.out.println(itens[i].imprimirEtiqueta());

                System.out.println("------------------");
            }
        }
    }

    public void calcularTotal(){
        if(index ==0){
            System.out.println("Nenhum produto na lista");
        } else {
            double total = 0;
            for (int i = 0; i < index; i++){
                total += itens[i].getPreco();
            }
            System.out.println("Total = " + total);
        }
    }

}
