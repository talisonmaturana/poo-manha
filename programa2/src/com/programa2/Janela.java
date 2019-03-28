package com.programa2;

public class Janela {

    public boolean aberta;
    public String cor;
    public int dimensaoX;
    public int dimensaoY;
    public int dimensaoZ;

    public void abre(){
        aberta = true;
    }

    public void fecha(){
        aberta = false;
    }

    public void pinta(String s){
        cor = s;
    }

    public boolean estaAberta(){
        return aberta;
    }
}
