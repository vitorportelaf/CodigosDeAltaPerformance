package Exercicios.exe03;

import Exercicios.pilhas.PilhaInt;

import java.util.Scanner;

public class DeciBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int decimal, resto;

        PilhaInt pilha = new PilhaInt();
        pilha.init();

        System.out.println("Informe o valor em decimal (positivo): ");
        decimal = sc.nextInt();

        while (decimal > 0){
            resto = decimal % 2;
            pilha.push(resto);
            decimal = decimal / 2;
        }

        System.out.println("Valor em binario: ");
        pilha.esvazie();

        sc.close();

    }
}
