/*
1 - Escreva uma função que receba um array (vetor) e imprima seus elementos.
 */
package aeds_1;

import java.util.Scanner;

public class AEDS_1 {

    // Método para preencher um vetor com valores fornecidos pelo usuário.
    public static void preencheVetor(int[] vetor, int indice) {
        Scanner teclado = new Scanner(System.in);
        //Condição de parada
        if (indice < vetor.length) {
            System.out.print(indice + ": ");
            vetor[indice] = teclado.nextInt();
            //Chama metodo recursivo  enquanto o índice for menor que o comprimento do vetor
            preencheVetor(vetor, indice + 1);
        }
    }

    // Método para imprimir os elementos de um vetor.
    public static void imprimeVetor(int[] vetor, int indice) {
        //Condição de parada
        if (indice < vetor.length) {
            System.out.print(vetor[indice] + " ");
            //Chama metodo recursivo  enquanto o índice for menor que o comprimento do vetor
            imprimeVetor(vetor, indice + 1);
        }
    }

    //Método principal que coleta numeros do vetor
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Define tamanho do vetor
        System.out.print("Informe o tamanho do vetor: ");
        int tamanho = teclado.nextInt();
        int vetor[] = new int[tamanho];

        System.out.println("Preencha o vetor:");
        preencheVetor(vetor, 0);

        System.out.println("Elementos do vetor:");
        imprimeVetor(vetor, 0);
    }
}
