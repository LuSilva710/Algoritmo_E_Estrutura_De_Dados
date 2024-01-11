package aedes_ex_filas;

public class Main {

    public static void main(String[] args) {
        Fila fila = new Fila(5);
        fila.adicionar(1);
        fila.adicionar(2);
        fila.adicionar(3);
        fila.adicionar(4);
        fila.adicionar(5);
        fila.adicionar(6);
        fila.remover();
        fila.adicionar(6);
        fila.adicionar(7);

    }
}
