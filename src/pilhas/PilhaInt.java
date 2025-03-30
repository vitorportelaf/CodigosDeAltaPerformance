package pilhas;

public class PilhaInt {

    public final int N = 9 ;
    //static final int N = 9;
    int[] dados = new int[N];
    int topo;

    public void init() {
        topo = 0;
    }

    public void push(int elem) {
        if (isFull()) {
            System.out.println("Stack overflow");
        } else {
            dados[topo] = elem;
            topo++;
        }
    }

    public int pop() {
        topo--;
        return (dados[topo]);
    }

    public int top() {
        return dados[topo - 1];
    }

    public boolean isEmpty() {
        return (topo == 0);
    }

    public boolean isFull() {
        return (topo == N);
    }

    public void esvazie() {
        while(!isEmpty()){
            System.out.print(pop()+ "\t");
        }
        System.out.println();
    }

}
