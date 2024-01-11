/*
* ALGORITMO DE ORDENAÇÃO: INSERTION SORT
* ORDEM CRESCENTE
 */
package algoritmoinsertionsort;

import java.util.Random;

public class AlgoritmoInsertionSort {

    public static void main(String[] args) {

        int tamanhoVetor = 400000;
        int vetor[] = new int[tamanhoVetor];
        int intervaloMin = 1; // VALOR MINIMO DOS NUMEROS ALEATORIOS 
        int intervaloMax = 400000; // VALOR MAXIMO DOS NUMEROS ALEATORIOS 
        int ponteiro = 1; // INICIALIZA MARCADOR DE POSICÕES  
        int indice = 0;

        Random random = new Random();

        for (int i = 0; i < tamanhoVetor; i++) {
            // GERA UM NÚMERO ALEATÓRIO ENTRE INTERVALO MIN E MAX (inclusive)
            vetor[i] = random.nextInt(intervaloMax - intervaloMin + 1) + intervaloMin;
        }

        // PREENCHE O VETOR COM VALORES ATE 500000
        // for (int i = 0; i < tamanhoVetor; i++) {
        //   vetor[i] = i + 1;
        //}
        
        // TEMPO DE EXECUÇÃO INICIA AQUI 
        long startTime = System.nanoTime();
        while (ponteiro < tamanhoVetor) {
            int aux = vetor[ponteiro];  // ARMAZENA VALOR ATUAL EM AXILIAR 
            indice = ponteiro - 1;  // INICIALIZA O INDICE COM O VALOR DO MARCADOR DE POSIÇÕES COM DECREMENT

            while ((indice >= 0) && (vetor[indice] > aux)) {
                vetor[indice + 1] = vetor[indice];  // MOVE ELEMENTOS MAIORES PARA A DIREITA
                indice = indice - 1;   // DECREMENTA O INDICE
            }
            vetor[indice + 1] = aux;  // INSERE O VALOR AUX NA POSIÇÃO CORRETA 
            ponteiro = ponteiro + 1;
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);  // TEMPO DE EXECUÇÃO EM NANOSSEGUNDOS
        double milliseconds = (double) duration / 1_000_000.0; // CONVERTE EM MILISEGUNDOS
        System.out.println("Tempo de execução: " + milliseconds + " milisegundos.");

        /*for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print(vetor[i] + " ");   // Imprime o vetor ordenado
        }*/
    }
}
