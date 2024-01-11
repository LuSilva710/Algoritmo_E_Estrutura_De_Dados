/*
 * Seja uma lista Circular Duplamente Encadeada. 
 * Escreva uma função que imprima todos os elementos da lista somente uma vez.
 */

class NoDuploCircular {
    int dado;
    NoDuploCircular proximo;
    NoDuploCircular anterior;

    public NoDuploCircular(int dado) {
        this.dado = dado;
        this.proximo = null;
        this.anterior = null;
    }
}

class ListaCircularDuplamenteEncadeada {
    NoDuploCircular inicio;

    public ListaCircularDuplamenteEncadeada() {
        this.inicio = null;
    }

    public void adicionarNo(int dado) {
        NoDuploCircular novoNo = new NoDuploCircular(dado);
        if (inicio == null) {
            inicio = novoNo;
            inicio.proximo = inicio;
            inicio.anterior = inicio;
        } else {
            NoDuploCircular ultimo = inicio.anterior;
            ultimo.proximo = novoNo;
            novoNo.anterior = ultimo;
            novoNo.proximo = inicio;
            inicio.anterior = novoNo;
        }
    }

    public void imprimirListaUmaVez() {
        if (inicio == null) {
            return;
        }

        NoDuploCircular atual = inicio;

        do {
            System.out.print(atual.dado + " ");
            atual = atual.proximo;
        } while (atual != inicio);

        System.out.println(); 
    }
}

public class ImprimirListaCircular {
    public static void main(String[] args) {
        ListaCircularDuplamenteEncadeada lista = new ListaCircularDuplamenteEncadeada();
        lista.adicionarNo(1);
        lista.adicionarNo(2);
        lista.adicionarNo(3);
        lista.adicionarNo(4);

        System.out.println("Lista:");
        lista.imprimirListaUmaVez();
    }
}
