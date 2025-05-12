package ListasEncadeadasGenericas;

import java.util.Scanner;

public class MainTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListasIntCrescente lista = new ListasIntCrescente();
        System.out.println("Informe valor positivo para inserir (negativo sair):");
        int valor = sc.nextInt();
        while(valor>=0){
            lista.insere(valor);
            lista.mostra();
            System.out.println("Informe valor positivo para inserir (negativo sair):");
            valor=sc.nextInt();
        }
        sc.close();
    }
}
