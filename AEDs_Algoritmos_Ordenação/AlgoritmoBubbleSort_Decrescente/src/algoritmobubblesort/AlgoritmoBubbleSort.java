/*
* ALGORITMO DE ORDENAÇÃO: BUBBLE SORT
* ORDEM DECRESCENTE
 */
package algoritmobubblesort;

import java.util.Random;

public class AlgoritmoBubbleSort {

    public static void main(String[] args) {

        int tamanhoVetor = 400000;
        int vetor[] = new int[tamanhoVetor];
        int intervaloMin = 1; // VALOR MINIMO DOS NÚMEROS ALEATÓRIOS 
        int intervaloMax = 400000; // VALOR MAXIMO DOS NÚMEROS ALEATÓRIOS 

        Random random = new Random(12345);

        for (int i = 0; i < tamanhoVetor; i++) {
            //GERA UM NÚMERO ALEATÓRIO ENTRE INTERVALO MIN E MAX (inclusive)
            vetor[i] = random.nextInt(intervaloMax - intervaloMin + 1) + intervaloMin;
        }

        // PREENCHE O VETOR COM VALORES DE 500000 ATE 0
        //for (int i = 0; i < tamanhoVetor; i++) {
        //   vetor[i] = tamanhoVetor - 1;
        // }
        
        int indice, fim, aux;
        // TEMPO DE EXECUÇÃO INICIA AQUI 
        long startTime = System.nanoTime();

        for (fim = tamanhoVetor - 1; fim > 0; --fim) {

            for (indice = 0; indice < fim; ++indice) {
                if (vetor[indice] < vetor[indice + 1]) {
                    aux = vetor[indice];
                    vetor[indice] = vetor[indice + 1];
                    vetor[indice + 1] = aux;
                }
            }
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);  // TEMPO DE EXECUÇÃO EM NANOSSEGUNDOS
        double milliseconds = (double) duration / 1_000_000.0; // CONVERTE EM MILISEGUNDOS
        System.out.println("Tempo de execução: " + milliseconds + " milisegundos.");

        /* for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print(vetor[i] + " ");   // IMPRIME O VETOR ORDENADO
        }*/
    }
}
