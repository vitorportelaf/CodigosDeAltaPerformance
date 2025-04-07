package FilasSequenciais.teste;

import FilasSequenciais.filas.FilaInt;

public class MainTeste {
    public static void main(String[] args) {
        FilaInt fila = new FilaInt();
        fila.init();
        fila.enqueue(23);
        fila.enqueue(66);
        fila.enqueue(17);
        if(fila.isEmpty()){
            System.out.println("Queue is empty!");
        }else{
            System.out.println("Valor retirado da fila: "+fila.dequeue());
        }if(fila.isEmpty()){
            System.out.println("Queue is empty!");
        }else{
            System.out.println("Valor retirado da fila: "+fila.dequeue());
        }if(fila.isEmpty()){
            System.out.println("Queue is empty!");
        }else{
            System.out.println("Valor retirado da fila: "+fila.dequeue());
        }
        fila.enqueue(99);
        if(fila.isEmpty()){
            System.out.println("Queue is empty!");
        }else{
            System.out.println("Valor retirado da fila: "+fila.dequeue());
        }
    }
}
