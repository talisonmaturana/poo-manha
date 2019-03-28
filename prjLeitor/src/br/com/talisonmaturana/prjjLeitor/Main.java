package br.com.talisonmaturana.prjjLeitor;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a, b;
        String letra;
        System.out.println("Digite o valor de a: ");
        a = Integer.parseInt(scan.nextLine());
        System.out.println("Digite uma letra: ");
        letra = scan.nextLine();
        System.out.println("Digite o valor de b: ");
        b = Integer.parseInt(scan.nextLine());
        System.out.println("Letra: " + letra);
        int soma = a + b;
        System.out.println("soma = " + soma);

    }
}
