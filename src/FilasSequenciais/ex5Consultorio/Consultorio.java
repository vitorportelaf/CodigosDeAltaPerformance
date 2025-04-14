package FilasSequenciais.ex5Consultorio;

import FilasSequenciais.filas.FilaInt;
import FilasSequenciais.filas.FilaString;

import java.util.Scanner;

public class Consultorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        FilaString fila = new FilaString();
        fila.init();
        do{
            System.out.println("1- Insere paciente na fila");
            System.out.println("2- Retira paciente da fila");
            System.out.println("3- Encerra atendiento");
            opcao=sc.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Nome do paciente que chegou: ");
                    sc.nextLine();
                    String nome = sc.next();
                    fila.enqueue(nome);
                    break;
                case 2:
                    if(fila.isEmpty()){
                        System.out.println("Não há pacientes na fila");
                    }else{
                        System.out.println("Paciente que atendido agora: "+fila.dequeue());
                    }
                    break;
                case 3:
                    if(fila.isEmpty()){
                        System.out.println("Encerrando consultas");
                    }else{
                        System.out.println("Ainda há pacientes aguardando na fila");
                        System.out.println("Deseja encerrar todos? (1- Sim/2- Não):");
                        int resp = sc.nextInt();
                        if(resp==1){
                            while(!fila.isEmpty()){
                                System.out.println("Encerrando consulta do: "+fila.dequeue());
                            }
                        }else{
                            opcao = -1;
                        }
                    }
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        }while(opcao!=3);
        System.out.println("Shutdown!");
        sc.close();
    }
}
