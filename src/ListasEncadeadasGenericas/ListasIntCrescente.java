package ListasEncadeadasGenericas;

public class ListasIntCrescente {

    private class NO{
        int dado;
        NO prox;
    }

    private NO lista = null;

    public void insere(int elem){
        //1o asso alocar nova NO
        NO novo = new NO();
        novo.dado=elem;
        if(lista==null){
            lista=novo;
            novo.prox=novo;
        }else if(novo.dado < lista.dado){
            novo.prox = lista;
            lista = novo;
        }else {
            NO aux = lista;
            boolean achou = false;
            while(aux.prox!=null && !achou){
                if(aux.prox.dado < novo.dado){
                    aux = aux.prox;
                }else{
                    achou = true;
                }
                novo.prox = aux.prox;
                aux.prox = novo;
            }
        }
    }

    public void mostra(){
        System.out.println("*****Elementos da lista*****");
        NO aux = lista;
        while(aux!=null){
            System.out.println("aux.dados"+"\t");
            aux = aux.prox;
        }
        System.out.println("\n***************");
    }

    public boolean remove(int valor){
        if(lista==null){
            System.out.println("Lista vazia!");
            return false;
        } else if (valor==lista.dado) {
            lista = lista.prox;
            return true;
        }else{
            NO aux = lista;
            boolean achou = false;
            while(aux.prox != null && !achou){
                if (aux.prox.dado != valor){
                    aux = aux.prox;
                }else {
                    achou = true;
                }
                aux.prox = aux.prox.prox;
                return true;
            }
        }
        return false;
    }
}
