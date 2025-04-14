package FilasSequenciais.Processador;

import FilasSequenciais.filas.FilaInt;

import java.util.Scanner;

public class Processador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        FilaInt fila = new FilaInt();
        fila.init();
        do{
            System.out.println("1- Insere processo na fila");
            System.out.println("2- Executa um processo");
            System.out.println("3- Shutdown");
            opcao=sc.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("pid: ");
                    int pid = sc.nextInt();
                    fila.enqueue(pid);
                    break;
                case 2:
                    if(fila.isEmpty()){
                        System.out.println("Não há processos na fila");
                    }else{
                        pid = fila.dequeue();
                        System.out.println("Processo executado agora: "+pid);
                        System.out.println("... o processo foi concluido? (1- Sim/2- Não):");
                        int resp = sc.nextInt();
                        if(resp==1){
                            System.out.println("Pid: "+pid+" concluído!");
                        }else{
                            fila.enqueue(pid);
                            System.out.println("O processo voltou para a fila");
                        }
                    }
                    break;
                case 3:
                    if(fila.isEmpty()){
                        System.out.println("Desligando maquina");
                    }else{
                        System.out.println("Ainda há processos aguardando na fila");
                        System.out.println("Deseja encerrar todos? (1- Sim/2- Não):");
                        int resp = sc.nextInt();
                        if(resp==1){
                            while(!fila.isEmpty()){
                                System.out.println("Encerrando o processo: "+fila.dequeue());
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
