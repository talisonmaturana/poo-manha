package br.edu.fatecmm.projetovetor2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int x[] = new int[10];
        Arrays.fill(x, 30);
        for (int i = 0; i < x.length ; i++) {
            System.out.println("x[" + i + "]=" + x[i]);
        }

    }
}
