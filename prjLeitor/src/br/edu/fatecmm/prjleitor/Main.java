package br.edu.fatecmm.prjleitor;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Objeto do tipo Scanner
        Scanner sc = new Scanner(System.in);
        int a, b;
        String letra;
        System.out.println("Digite o valor de a: ");
        a = Integer.parseInt(sc.nextLine());
        System.out.println("Digite uma letra: ");
        letra = sc.nextLine();
        System.out.println("Digite o valor de b: ");
        b = Integer.parseInt(sc.nextLine());
        System.out.println("Letra: " + letra);
        int soma = a + b;
        System.out.println("soma = " + soma);
        
    }
}
