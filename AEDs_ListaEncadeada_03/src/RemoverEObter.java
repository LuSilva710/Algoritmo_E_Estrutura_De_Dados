/*
 *Seja L uma lista simplesmente encadeada. Escreva um método que receba um valor i, remova este nó e retorne o i-ésimo nó de L.
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

    public No removerEObterIesimo(int i) {
        if (i < 0 || inicio == null) {
            return null;
        }

        if (i == 0) {
            No removido = inicio;
            inicio = inicio.proximo;
            removido.proximo = null;
            return removido;
        }

        No anterior = null;
        No atual = inicio;
        int contador = 0;

        while (atual != null && contador < i) {
            anterior = atual;
            atual = atual.proximo;
            contador++;
        }

        if (atual != null) {
            anterior.proximo = atual.proximo;
            atual.proximo = null;
            return atual;
        } else {
            return null; 
        }
    }
}

public class RemoverEObter {
    public static void main(String[] args) {
        ListaSimplesmenteEncadeada lista = new ListaSimplesmenteEncadeada();
        lista.adicionarNo(20);
        lista.adicionarNo(21);
        lista.adicionarNo(22);
        lista.adicionarNo(23);

        int indiceDesejado = 0;
        No noRemovido = lista.removerEObterIesimo(indiceDesejado);

        if (noRemovido != null) {
            System.out.println("Valor do " + indiceDesejado + "-ésimo nó removido: " + noRemovido.dado);
        } else {
            System.out.println("Índice inválido");
        }
    }
}
