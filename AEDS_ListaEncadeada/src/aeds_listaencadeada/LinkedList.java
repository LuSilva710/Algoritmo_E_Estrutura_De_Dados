package aeds_listaencadeada;

class LinkedList<E> {

    private Item<E> lista;
    private int size;

    public LinkedList() {
        lista = null; // INICIALIZA A LISTA ENCADEADA COMO VAZIA
    }

    public Item<E> getLista() {
        return lista;
    }

    public int getSize() {
        return size;
    }

    public void addHead(E item) {
        if (lista == null) {
            lista = new Item<E>(item, null); // CRIA O PRIMEIRO ITEM DA LISTA E DEFINE COMO HEADLIST
        } else {
            Item<E> novoItem = new Item<E>(item, lista); // CRIA UM NOVO ITEM E INSERE NO INICIO DA LISTA
            lista = novoItem;
        }
        size++;
    }

    public void addTail(E item) {
        if (lista == null) {
            lista = new Item<E>(item, null); // CRIA O PRIMEIRO ITEM DA LISTA
        } else {
            Item<E> ponteiro = lista;
            for (; ponteiro.proximo != null; ponteiro = ponteiro.proximo) {
            }
            ponteiro.proximo = new Item<E>(item, null); // CRIA UM NOVO ITEM E INSERE NO FINAL DA LISTA
        }
        size++;
    }

    public boolean elementExist(E item) {
        if (lista == null) {
            return false;
        }
        Item<E> ponteiro = lista;
        do {
            if (ponteiro.elemento.equals(item)) // VERIFICA SE O ELEMENTO É IGUAL AO ELEMENTO PROCURADO
            {
                return true;
            }
            ponteiro = ponteiro.proximo;
        } while (ponteiro != null);
        return false; // SE ELEMENTO NÃO FOR ENCONTRADO, RETORNA FALSO
    }

    public void printLinkedList() {
        Item<E> ponteiro = lista;
        System.out.print("Lista encadeada: ");
        for (; ponteiro != null; ponteiro = ponteiro.proximo) {
            System.out.print(ponteiro.elemento+ " - ");
        }
        System.out.println("");
    }

    public static class Item<T> {

        T elemento;
        Item<T> proximo;

        Item(T item, Item<T> prox) {
            elemento = item; //INICIALIZA  ITEM
            proximo = prox; // DEFINE PROXIMO ITEM DA LISTA
        }
    }

    // MÉTODO PARA VERIFICAR SE DUAS LISTAS SÃO IGUAIS
    public static boolean areEqual(LinkedList<Integer> listaA, LinkedList<Integer> listaB) {
        if (listaA.getSize() != listaB.getSize()) {
            return false;
        }
        Item<Integer> ponteiroA = listaA.getLista();
        Item<Integer> ponteiroB = listaB.getLista();

        while (ponteiroA != null && ponteiroB != null) {
            if (!ponteiroA.elemento.equals(ponteiroB.elemento)) {
                return false;
            }
            ponteiroA = ponteiroA.proximo;
            ponteiroB = ponteiroB.proximo;
        }
        return true;
    }

    public void removeNode(E item) {
        if (lista == null) {
            return; // LISTA VAZIA
        }
        if (lista.elemento.equals(item)) {
            lista = lista.proximo; // REMOVE PRIMEIRO NÓ SE ELE CORRESPONDER AO ELEMENTO
            size--;
            return;
        }
        Item<E> ponteiro = lista;
        while (ponteiro.proximo != null) {
            if (ponteiro.proximo.elemento.equals(item)) {
                ponteiro.proximo = ponteiro.proximo.proximo; // REMOVE O NÓ CORRESPONDENTE AO ELEMENTO
                size--;
                return;
            }
            ponteiro = ponteiro.proximo;
        }
    }
    
    //BUSCA EM LISTA CIRCULAR
    public Item buscar(E x){
        Item<E> ponteiro = lista;
        while(ponteiro.proximo != x){
      //  while(ponteiro.proximo < x){ LISTAS ORDENADAS
            ponteiro = ponteiro.proximo;
            if(ponteiro == lista){
                break;
            }
        }
            if( ponteiro.elemento == x){
                return ponteiro;
            } else {
                return null;
            }
        }
    
    /*
    public Item buscar(E x){
        Item<E> ponteiro = lista;
        if(ponteiro.proximo != x){
            buscar(E x);
    } else {
    exibir(E x);
    }
    
    */
    }

