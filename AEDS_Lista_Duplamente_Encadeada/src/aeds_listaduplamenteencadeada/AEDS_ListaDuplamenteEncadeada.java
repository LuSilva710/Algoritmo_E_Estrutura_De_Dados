package aeds_listaduplamenteencadeada;

class LinkedList<E> {

    private Item<E> head;
    private Item<E> tail;
    private int size;

    public LinkedList() {
        head = null;
        tail = null;
        size = 0; // INICIALIZA A LISTA ENCADEADA COMO VAZIA
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // VERIFICA SE A LISTA CONTÉM ELEMENTO ESPECIFICO
    public boolean contains(E item) {
        Item<E> current = head;
        while (current != null) {
            if (current.elemento.equals(item)) {
                return true;
            }
            current = current.proximo;
        }
        return false;
    }

    //ADICIONA NOVO ELEMENTO NO INICIO DA LISTA
    public void addHead(E item) {
        Item<E> newNode = new Item<E>(item, null, head);
        if (head == null) {
            tail = newNode;
        } else {
            head.anterior = newNode;
        }
        head = newNode;
        size++;
    }

    //ADICIONA NOVO ELEMENTO NO FINAL DA LISTA
    public void addTail(E item) {
        Item<E> newNode = new Item<E>(item, tail, null);
        if (tail == null) {
            head = newNode;
        } else {
            tail.proximo = newNode;
        }
        tail = newNode;
        size++;
    }

    // IMPRIME OS ELEMENTOS DA LISTA 
    public void printLinkedList() {
        Item<E> current = head;
        System.out.print("Lista encadeada: ");
        while (current != null) {
            System.out.print(current.elemento + " - ");
            current = current.proximo;
        }
        System.out.println();
    }

    public static class Item<T> {
        T elemento;
        Item<T> proximo;
        Item<T> anterior;

        Item(T item, Item<T> anterior, Item<T> proximo) {
            this.elemento = item;  //INICIALIZA  ITEM
            this.anterior = anterior;   // DEFINE ITEM ANTERIOR NA LISTA
            this.proximo = proximo;   // DEFINE PROXIMO ITEM DA LISTA
        }
    }

    // VERIFICA SE DUAS LISTAS SÃO IGUAIS
    public static <T> boolean areEqual(LinkedList<T> listaA, LinkedList<T> listaB) {
        if (listaA.getSize() != listaB.getSize()) {
            return false;
        }
        Item<T> ponteiroA = listaA.head;
        Item<T> ponteiroB = listaB.head;

        while (ponteiroA != null && ponteiroB != null) {
            if (!ponteiroA.elemento.equals(ponteiroB.elemento)) {
                return false;
            }
            ponteiroA = ponteiroA.proximo;
            ponteiroB = ponteiroB.proximo;
        }
        return true;
    }

      // REMOVE ELEMENTO ESPECIFICO DA LISTA
    public void remove(E item) {
        Item<E> current = head;
        while (current != null) {
            if (current.elemento.equals(item)) {
                if (current == head) {
                    head = current.proximo;
                }
                if (current == tail) {
                    tail = current.anterior;
                }
                if (current.anterior != null) {
                    current.anterior.proximo = current.proximo;
                }
                if (current.proximo != null) {
                    current.proximo.anterior = current.anterior;
                }
                size--;
                return;
            }
            current = current.proximo;
        }
    }

    // BUSCA ELEMENTO ESPECIFICO DA LISTA
    public Item<E> buscar(E x) {
        Item<E> forward = head;
        Item<E> backward = tail;

        while (forward != null && backward != null) {
            if (forward.elemento.equals(x)) {
                return forward;
            }
            if (backward.elemento.equals(x)) {
                return backward;
            }

            forward = forward.proximo;
            backward = backward.anterior;
        }
        return null; // O elemento não foi encontrado na lista
    }
}
