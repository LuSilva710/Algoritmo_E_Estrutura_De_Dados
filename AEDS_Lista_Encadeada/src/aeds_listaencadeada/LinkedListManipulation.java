package aeds_listaencadeada;

public class LinkedListManipulation {

    // MERGE DA LISTA ENCADEADA A COM A LISTA ENCADEADA B
    public static LinkedList<Integer> mergeLists(LinkedList<Integer> listaA, LinkedList<Integer> listaB) {
        LinkedList<Integer> merge = new LinkedList<Integer>();
        LinkedList.Item<Integer> ponteiro = listaA.getLista();

        while (ponteiro != null) {
            merge.addTail(ponteiro.elemento); // ADICIONA ELEMENTOS DA LISTA_A NO FINAL DA LISTA MERGE
            ponteiro = ponteiro.proximo;
        }
        ponteiro = listaB.getLista();
        while (ponteiro != null) {
            merge.addTail(ponteiro.elemento); // ADICIONA ELEMENTOS DA LISTA_b  NO FINAL DA LISTA MERGE
            ponteiro = ponteiro.proximo;
        }
        return merge;
    }

}
