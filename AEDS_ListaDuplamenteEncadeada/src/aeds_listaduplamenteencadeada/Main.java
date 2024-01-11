package aeds_listaduplamenteencadeada;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>();

        // Adicionando elementos à lista
        lista.addHead(2);
        lista.addHead(33);
        lista.addTail(99);
        lista.addTail(1000);

        // Imprimindo a lista
        System.out.println("Lista original:");
        lista.printLinkedList();

        // Verificando se a lista contém um elemento
        int elementoBuscado = 99;
        boolean contemElemento = lista.contains(elementoBuscado);
        System.out.println("A lista contém o elemento " + elementoBuscado + "? " + contemElemento);

        // Removendo um elemento da lista
        int elementoRemovido = 33;
        lista.remove(elementoRemovido);
        System.out.println("Removendo o elemento " + elementoRemovido + ":");
        lista.printLinkedList();

        // Criando outra lista
        LinkedList<Integer> outraLista = new LinkedList<>();
        outraLista.addHead(2);
        outraLista.addTail(99);
        outraLista.addTail(1000);

        // Verificando se as duas listas são iguais
        boolean saoIguais = LinkedList.areEqual(lista, outraLista);
        System.out.println("As duas listas são iguais? " + saoIguais);

        // Buscando um elemento na lista
        int elementoParaBuscar = 1000;
        LinkedList.Item<Integer> resultadoBusca = lista.buscar(elementoParaBuscar);
        if (resultadoBusca != null) {
            System.out.println("Elemento " + elementoParaBuscar + " encontrado na posição: " + resultadoBusca.elemento);
        } else {
            System.out.println("Elemento " + elementoParaBuscar + " não encontrado na lista.");
        }
    }
}
