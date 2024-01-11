package aeds_listaencadeada;

public class Main {
    public static void main(String[] args) {
        System.out.println("Criando Lista");
        LinkedList listaA = new LinkedList();
        
        // INSERINDO NOVOS ITENS
        listaA.addHead(2);
        listaA.addHead(33);
        listaA.addTail(99);
        listaA.addTail(1000);
        listaA.printLinkedList();   

        // CHECANDO SE ELEMENTO EXISTE NA LISTA
        boolean exist = listaA.elementExist(99);
        System.out.println("O elemento 99 existe? " + exist);
        exist = listaA.elementExist(100);
        System.out.println("O elemento 100 existe? " + exist);

        // TESTANDO REMOÇÃO DE ITEM
        System.out.println("Removendo um elemento da lista");
        listaA.removeNode(99);
        listaA.printLinkedList();   

        // MERGE DELISTAS
        LinkedList listaB = new LinkedList();
        listaB.addHead(1);
        listaB.addTail(3);
        listaB.addTail(50);
        listaB.addTail(60);

        LinkedList mergedList = LinkedListManipulation.mergeLists(listaA, listaB); 
        System.out.println("Lista mesclada");
        mergedList.printLinkedList();   

        // TESTANDO IGUALDADE ENTRE DUAS LISTAS
        boolean areEqual = LinkedList.areEqual(listaA, listaB);
        System.out.println("As listas são iguais? " + areEqual);
        
    }
}