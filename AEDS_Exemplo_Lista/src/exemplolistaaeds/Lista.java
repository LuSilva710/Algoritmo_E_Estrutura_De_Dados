/*
 * Checar se lista está vazia (Retorna true se lista vazia, false caso contrario
 * Checar se lista está cheia (Retorna true se lista vazia, false caso contrario
 * Insere  elemento, x, na posição [x]
 */
package exemplolistaaeds;

public class Lista {

    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.cheia();

        System.out.println("A lista está vazia? " + lista.vazia());

        Aluno aluno = new Aluno("João", 123456);

        lista.insereAlunoIndice(aluno, 0);
        lista.insereAlunoIndice(aluno, 1);
        lista.insereAlunoIndice(aluno, 2);
        lista.insereAlunoIndice(aluno, 3);

        System.out.println("A lista está vazia? " + lista.vazia());
        System.out.println("A lista está cheia? " + lista.cheia());
        System.out.println("Quantidade de alunos: " + lista.nAtualAlunos);

    }

    private final int MAX = 2;
    private int nAtualAlunos;
    private Aluno[] lista;

    public Lista() {
        lista = new Aluno[MAX];
    }

    /*Retorna true  se lista vazia, false caso contrário*/
    public boolean vazia() {
        return nAtualAlunos == 0 ? true : false;
    }

    /*Retorna true se lista cheia, false caso contrário*/
    public boolean cheia() {
        return nAtualAlunos == MAX ? true : false;
    }

    public void apagarLista() {
        lista = new Aluno[MAX];
    }

    /* Insere novo elemento, x, na posição p da Lista. 
    * Se L = a1, a2,... an então temos a1, a2,...ap-1 x ap+1 ... an. 
    * Devolve true se sucesso, false c.c. (L não tem nenhuma posição p 
    * ou Lista cheia). Operação para LISTA NÃO ORDENADA!
    */
    
    public boolean insereAlunoIndice(Aluno aluno, int indice) {
        if (cheia() || indice >= lista.length || indice < 0) {
            return false;
        }
        // Inserir o novo aluno no índice especificado
        if (lista[indice] == null) {
            lista[indice] = aluno;
            nAtualAlunos += 1;
            return true;
        } else {
            // Deslocar os elementos para a direita ou esquerda
            for (int i = nAtualAlunos; i > indice; i--) {
                lista[i] = lista[i - 1];
            }
            return true;
        }
    }

    public static class Aluno {

        private String nome;
        private int cpf;

        Aluno(String _nome, int _cpf) {
            nome = _nome;
            cpf = _cpf;
        }
    }
}
