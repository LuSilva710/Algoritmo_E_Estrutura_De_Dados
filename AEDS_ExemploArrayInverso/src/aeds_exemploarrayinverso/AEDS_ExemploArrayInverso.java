/*
 * Dado um array de inteiros e seu numero de elementos, inverta a posição dos seus elementos.
 * Caso base: tamanho do array menor ou igual a 1;
 */
package aeds_exemploarrayinverso;

import java.util.Scanner;

public class AEDS_ExemploArrayInverso {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tamanhoVetor = 5;
        int vetor[] = new int[tamanhoVetor];

        for (int indice = 0; indice < tamanhoVetor; indice++) {
            vetor[indice] = in.nextInt();
        }

        inverteArray(vetor, 0, tamanhoVetor - 1);
        for (int indice = 0; indice < tamanhoVetor; indice++) {
            System.out.print(vetor[indice] + " ");
        }
    }

    static void inverteArray(int vetor[], int indiceEsquerdo, int indiceDireito) {
        int auxiliar;
        if (indiceEsquerdo >= indiceDireito) {
            return;
        }
        auxiliar = vetor[indiceEsquerdo];
        vetor[indiceEsquerdo] = vetor[indiceDireito];
        vetor[indiceDireito] = auxiliar;
        inverteArray(vetor, indiceEsquerdo + 1, indiceDireito - 1);

    }
}
