package com.programa3;

import com.programa2.Janela;

public class Casa {

    public String cor;
    public int qtdJanelas = 0;
    public Janela janela1;
    public Janela janela2;
    public Janela janela3;

    public void pinta(String s){
        cor = s;
    }

    public int quantidadeJanelasAbertas(){
        return qtdJanelas++;
    }
}
