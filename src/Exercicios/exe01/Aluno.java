package Exercicios.exe01;

import java.util.Scanner;

public class Aluno {

    String nome;
    int rm;
    double nota1, nota2, media;

    public void leitura() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome: ");
        nome = sc.next();
        System.out.println("Rm: ");
        rm = sc.nextInt();
        System.out.println("Nota 1: ");
        nota1 = sc.nextDouble();
        System.out.println("Nota 2: ");
        nota2 = sc.nextDouble();

    }

    public void calculaMedia(){
        media = (nota1 + nota2) / 2 ;
    }

    public void apresenta(){
        System.out.println("-------------");
        System.out.println("Aluno: "+nome+"\t RM: "+rm);
        System.out.println("Nota1: "+nota1+"\t Nota2: "+nota2);
        System.out.printf("%s%.1f\n","Media: ", media);
    }

}
