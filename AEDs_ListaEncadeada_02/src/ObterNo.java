/*
 *  Seja L uma lista duplamente encadeada. Escreva um método que receba um valor i e retorne o i-ésimo nó de L.
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

    public NoDuplo obterNoIesimo(int i) {
        if (i < 0) {
            return null; 
        }

        NoDuplo atual = inicio;
        int contador = 0;

        while (atual != null && contador < i) {
            atual = atual.proximo;
            contador++;
        }

        return atual;
    }
}

public class ObterNo {

    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        lista.adicionarNo(1);
        lista.adicionarNo(2);
        lista.adicionarNo(3);
        lista.adicionarNo(4);

        int indiceDesejado = 2;
        NoDuplo noIesimo = lista.obterNoIesimo(indiceDesejado);

        if (noIesimo != null) {
            System.out.println("Valor do " + indiceDesejado + "-ésimo nó: " + noIesimo.dado);
        } else {
            System.out.println("Índice inválido");
        }
    }
}
