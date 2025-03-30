package pilhas;

public class MainTeste {
    public static void main(String[] args) {
        PilhaInt pilha =  new PilhaInt();

        pilha.init();
        pilha.push(10);
        pilha.push(12);
        pilha.push(14);
        pilha.push(16);
        pilha.push(17);
        pilha.push(19);
        pilha.push(11);

        if(pilha.isEmpty())
            System.out.println("Stack is empty!");
        else{
            System.out.println("Valor no top da pilha : "+ pilha.top());
        }

        System.out.println("Apresentação dos valores empilhados: ");
        pilha.esvazie();




    }
}
