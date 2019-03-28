package br.edu.fatecmm.prjconversao;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int x = 10;
        String competicao = " jogadas";
        String termino = " efetivadas ontem";
        String strx;
        strx = String.valueOf(x);
        // strx = Integer.toString(x);
        StringBuilder completao = new StringBuilder();
        completao.append(strx).append(competicao).append(termino);
        System.out.println(completao.toString());


    }
}
