/*
 * PILHA IMPLEMENTADA EM VETOR COM REDIMENSIONAMENTO
 */
package aeds_pilhas_01;

    public class PilhaRedimensionavel<Item> {

        private Item[] itens;
        private int contador;

        // construtor
        public PilhaRedimensionavel() {
            itens = (Item[]) new Object[2];
            contador = 0;
        }

        public boolean isEmpty() {
            return contador == 0;
        }

        public void push(Item item) {
            if (contador == itens.length) {
                resize(2 * itens.length);
            }
            itens[contador++] = item;
        }

        public Item pop() {
            Item item = itens[--contador];
            if (contador > 0 && contador == itens.length / 4) {
                resize(itens.length / 2);
            }
            return item;
        }

        private void resize(int max) {
            Item[] temp;
            temp = (Item[]) new Object[max];
            for (int i = 0; i < contador; i++) {
                temp[i] = itens[i];
            }
            itens = temp;
        }

        public int size() {
            return contador;
        }
    }

