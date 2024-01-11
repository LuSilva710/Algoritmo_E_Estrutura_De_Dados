/*
 * Escreva um método que conte quantos nós existem em uma lista simplesmente encadeada.
 */

    class No {
    int dado;
    No proximo;

    public No(int dado) {
        this.dado = dado;
        this.proximo = null;
    }
}

class ListaSimplesmenteEncadeada {
    No inicio;

    public ListaSimplesmenteEncadeada() {
        this.inicio = null;
    }

    public void adicionarNo(int dado) {
        No novoNo = new No(dado);
        if (inicio == null) {
            inicio = novoNo;
        } else {
            No atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNo;
        }
    }

    public int contarNos() {
        int contador = 0;
        No atual = inicio;
        while (atual != null) {
            contador++;
            atual = atual.proximo;
        }
        return contador;
    }
}

public class ContadorNosListaEncadeada {
    public static void main(String[] args) {
        ListaSimplesmenteEncadeada lista = new ListaSimplesmenteEncadeada();
        lista.adicionarNo(1);
        lista.adicionarNo(2);
        lista.adicionarNo(3);
        lista.adicionarNo(4);

        int totalNos = lista.contarNos();
        System.out.println("Total de nós na lista: " + totalNos);
    }
}

