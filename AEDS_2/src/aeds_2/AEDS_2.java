/*
 2 - Escreva uma função que recebe um array e retorna o maior elemento do array de maneira recursiva. 
 */
package aeds_2;

import java.util.Scanner;

public class AEDS_2 {

    // Método para receber valores do usuário e preencher um vetor.
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

    // Método para encontrar o maior valor em um vetor.
    public static int encontraMaiorValor(int[] vetor, int indice, int maiorValor) {
        // Percorra o vetor para encontrar o maior valor enquanto o índice for menor que o comprimento do vetor
        if (indice < vetor.length) {
            if (vetor[indice] > maiorValor) {
                maiorValor = vetor[indice];
            }
            // Chama o método recursivamente com o próximo índice e o maiorValor atualizado.
            return encontraMaiorValor(vetor, indice + 1, maiorValor); //Chamada recursiva
        } // Se o índice for igual ao comprimento do vetor, retorne o maiorValor.
        else {
            return maiorValor;
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o tamanho do vetor: ");
        //Define o tamanho do vetor
        int tamanho = teclado.nextInt();
        int vetor[] = new int[tamanho];

        System.out.println("Preencha o vetor:");
        preencheVetor(vetor, 0);

        System.out.println("Elementos do vetor:");
        imprimeVetor(vetor, 0);

        int maiorValor = encontraMaiorValor(vetor, 0, vetor[0]);
        System.out.println("\nO maior valor no vetor é: " + maiorValor);
    }
}
