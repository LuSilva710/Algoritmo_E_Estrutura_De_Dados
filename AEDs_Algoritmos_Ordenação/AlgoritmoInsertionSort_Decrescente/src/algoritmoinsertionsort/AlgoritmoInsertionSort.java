/*
* ALGORITMO DE ORDENAÇÃO: INSERTION SORT
* ORDEM DECRESCENTE
 */
package algoritmoinsertionsort;

import java.util.Random;

public class AlgoritmoInsertionSort {

    public static void main(String[] args) {

        int tamanhoVetor = 400000;
        int vetor[] = new int[tamanhoVetor];
        int intervaloMin = 1; // VALOR MINIMO DOS NÚMEROS ALEATÓRIOS 
        int intervaloMax = 400000; // VALOR MAXIMO DOS NÚMEROS ALEATÓRIOS 
        int posicao = 1; // INICIALIZA MARCADOR DE POSIÇÕES  
        int indice = 0;

        Random random = new Random();

        for (int i = 0; i < tamanhoVetor; i++) {
            // GERA UM NÚMERO ALEATÓRIO ENTRE INTERVALO MIN E MAX (inclusive)
            vetor[i] = random.nextInt(intervaloMax - intervaloMin + 1) + intervaloMin;
        }

        // PREENCHE O VETOR COM VALORES DE 500000 ATE 0
        //for (int i = 0; i < tamanhoVetor; i++) {
        //   vetor[i] = tamanhoVetor - 1;
        //  }
        
        // TEMPO DE EXECUÇÃO INICIA AQUI 
        long startTime = System.nanoTime();

        while (posicao < tamanhoVetor) {
            int aux = vetor[posicao];  // ARMAZENA VALOR ATUAL EM AXILIAR 
            indice = posicao - 1;  // INICIALIZA O INDICE COM O VALOR DO MARCADOR DE POSIÇÕES COM DECREMENT

            while ((indice >= 0) && (vetor[indice] < aux)) {
                vetor[indice + 1] = vetor[indice];  // MOVE ELEMENTOS MAIORES PARA A DIREITA
                indice = indice - 1;   // DECREMENTA O INDICE
            }
            vetor[indice + 1] = aux;  // INSERE O VALOR AUX NA POSIÇÃO CORRETA 
            posicao = posicao + 1;
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);  // TEMPO DE EXECUÇÃO EM NANOSSEGUNDOS
        double milliseconds = (double) duration / 1_000_000.0; // CONVERTE EM MILISEGUNDOS
        System.out.println("Tempo de execução: " + milliseconds + " milisegundos.");

        /*for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print(vetor[i] + " ");    // IMPRIME O VETOR ORDENADO
        }*/
    }
}
