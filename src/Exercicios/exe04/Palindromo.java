package Exercicios.exe04;

import Exercicios.pilhas.PilhaInt;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PilhaInt pilha = new PilhaInt();

        pilha.init();

        int digito;
        int[] leitura = new int[pilha.N];

        System.out.println("Informe o digito( 1 a 9 ): ");
        digito = sc.nextInt();
        int n = 0;

        while (digito > 0) {
            leitura[n] = digito;
            n++;
            pilha.push(digito);
            System.out.println("Informe o digito( 1 a 9 ): ");
            digito = sc.nextInt();
        }

        boolean palindromo = true;

        for (int i = 0; i < n && palindromo; i++) {
            if (leitura[i] != pilha.pop())
                palindromo = false;
        }
        if (palindromo)
            System.out.println("É palindromo");
        else
            System.out.println("Não é palindromo");

        sc.close();
    }
}
