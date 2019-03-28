package com.programa3;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Casa casa1 = new Casa();

        casa1.pinta("Azul");

        casa1.janela1.abre();
        casa1.janela2.abre();
        casa1.janela3.abre();

        casa1.quantidadeJanelasAbertas();

        casa1.janela1.fecha();
        casa1.janela1.fecha();
        casa1.janela1.fecha();
    }
}
