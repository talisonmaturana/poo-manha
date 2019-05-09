package br.com.excepition1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        try {
            Scanner scan = new Scanner(System.in);
            int a = 5;
            int b = Integer.parseInt(scan.nextLine());
            int r = a / b;

            System.out.println("Valor de r: " + r);

        } catch (Exception e){
            System.out.println("Aconteceu um erro: ");
            System.out.println(e.getMessage() + "\n");
        }finally {
            System.out.println("Passei por aqui");
        }
    }
}
