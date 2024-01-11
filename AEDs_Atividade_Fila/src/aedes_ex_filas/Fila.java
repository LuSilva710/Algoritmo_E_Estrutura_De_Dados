/**
 * Exemplo de uma fila, onde a estrutura a fila usará um array com tamanho determinado pelo usuario.
 * Também teremos as variaveis cabeca_fila e cauda_fila para conseguir adicionar e remover elementos.
 * */
package aedes_ex_filas;

public class Fila {

    private int[] fila;
    private int cabeca_fila;
    private int cauda_fila;
    private int num_itens;

    public Fila(int tamanho_fila) {
        fila = new int[tamanho_fila];
        cabeca_fila = 0;
        cauda_fila = 0;
    }

    public void adicionar(int valor) {
        if (num_itens < fila.length) {
            num_itens++;
            fila[cauda_fila] = valor;

            if (cauda_fila < fila.length - 1) {
                cauda_fila++;
            } else {
                cauda_fila = 0;
            }
            System.out.println("Item adicionado à fila: " + valor);
        } else {
            System.out.println("Fila está cheia!");
            imprimirFila();
        }
    }

    public void remover() {
        if (num_itens > 0) {
            num_itens--;
            int valor = fila[cabeca_fila];

            if (cabeca_fila < fila.length - 1) {
                cabeca_fila++;
            } else {
                cabeca_fila = 0;
            }
            System.out.println("Item removido da fila: " + valor);
        } else {
            System.out.println("Fila está vazia!");
            imprimirFila();
        }
    }

    public void imprimirFila() {
        System.out.print("Fila: ");
        for (int i = cabeca_fila; i < cauda_fila; i++) {
            System.out.print(fila[i] + " ");
        }
        System.out.println();
    }
}


/*
adicionarElemento(){
        if(!estaCheia){
            num_item++
            } else {
                ERRO
                causa_fila = 0 BUG
                }
 */
