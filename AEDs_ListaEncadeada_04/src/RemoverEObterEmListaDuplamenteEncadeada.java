/*
 * Similarmente com a questão 3. Mas agora com a lista DUPLAMENTE encadeada. 
*  Seja L uma lista duplamente encadeada. Escreva um método que receba um valor i, remova este nó e retorne o i-ésimo nó de L.
 * 
 */

class NoDuplo {
    int dado;
    NoDuplo proximo;
    NoDuplo anterior;

    public NoDuplo(int dado) {
        this.dado = dado;
        this.proximo = null;
        this.anterior = null;
    }
}

class ListaDuplamenteEncadeada {
    NoDuplo inicio;

    public ListaDuplamenteEncadeada() {
        this.inicio = null;
    }

    public void adicionarNo(int dado) {
        NoDuplo novoNo = new NoDuplo(dado);
        if (inicio == null) {
            inicio = novoNo;
        } else {
            NoDuplo atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNo;
            novoNo.anterior = atual;
        }
    }

    public NoDuplo removerEObterIesimo(int i) {
        if (i < 0 || inicio == null) {
            return null; 
        }

        if (i == 0) {
            NoDuplo removido = inicio;
            inicio = inicio.proximo;
            if (inicio != null) {
                inicio.anterior = null;
            }
            removido.proximo = null;
            return removido;
        }

        NoDuplo atual = inicio;
        int contador = 0;

        while (atual != null && contador < i) {
            atual = atual.proximo;
            contador++;
        }

        if (atual != null) {
            if (atual.proximo != null) {
                atual.proximo.anterior = atual.anterior;
            }
            atual.anterior.proximo = atual.proximo;
            atual.proximo = null;
            atual.anterior = null;
            return atual;
        } else {
            return null;
        }
    }
}

public class RemoverEObterEmListaDuplamenteEncadeada {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        lista.adicionarNo(20);
        lista.adicionarNo(21);
        lista.adicionarNo(22);
        lista.adicionarNo(23);

        int indiceDesejado = 1;
        NoDuplo noRemovido = lista.removerEObterIesimo(indiceDesejado);

        if (noRemovido != null) {
            System.out.println("Valor do " + indiceDesejado + "-ésimo nó removido: " + noRemovido.dado);
        } else {
            System.out.println("Índice inválido");
        }
    }
}
