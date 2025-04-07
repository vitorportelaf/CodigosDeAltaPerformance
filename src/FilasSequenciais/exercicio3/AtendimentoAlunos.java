package FilasSequenciais.exercicio3;

import java.util.Scanner;

public class AtendimentoAlunos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        do{
            System.out.println("1- Insere aluno na fila");
            System.out.println("2- Retira aluno da fila");
            System.out.println("3- Encerra atendimento");
            opcao=sc.nextInt();
            switch (opcao){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Encerrando atendimento");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        }while(opcao!=3);
        sc.close();
    }
}
