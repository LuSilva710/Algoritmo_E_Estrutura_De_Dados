/*
* ALGORITMO DE ORDENAÇÃO: SELECTION SORT
* ORDEM CRESCENTE
 */
package algoritmoselectionsort;

import java.util.Random;

public class AlgoritmoSelectionSort {

    public static void main(String[] args) {

        int tamanhoVetor = 400000;
        int vetor[] = new int[tamanhoVetor];
        int intervaloMin = 1; // VALOR MINIMO DOS NÚMEROS ALEATÓRIOS 
        int intervaloMax = 400000; // VALOR MAXIMO DOS NÚMEROS ALEATÓRIOS 
        int indice;
        int ponteiro; // INICIALIZA MARCADOR DE POSIÇÕES  
        int min, aux;

        Random random = new Random(1234);
        for (int i = 0; i < tamanhoVetor; i++) {
            // GERA UM NÚMERO ALEATÓRIO ENTRE INTERVALO MIN E MAX (inclusive)
            vetor[i] = random.nextInt(intervaloMax - intervaloMin + 1) + intervaloMin;
        }

// PREENCHE O VETOR COM VALORES ATE 500000
        //for (int i = 0; i < tamanhoVetor; i++) {
        // vetor[i] = i + 1;
        //  }
        
        // TEMPO DE EXECUÇÃO INICIA AQUI 
        long startTime = System.nanoTime();

        for (indice = 0; indice < (tamanhoVetor - 1); indice++) {
            min = indice;
            for (ponteiro = (indice + 1); ponteiro < tamanhoVetor; ponteiro++) {
                if (vetor[ponteiro] < vetor[min]) {
                    min = ponteiro;
                }
            }
            if (vetor[indice] != vetor[min]) {
                aux = vetor[indice];
                vetor[indice] = vetor[min];
                vetor[min] = aux;
            }
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);  // TEMPO DE EXECUÇÃO EM NANOSSEGUNDOS
        double milliseconds = (double) duration / 1_000_000.0; // CONVERTE EM MILISEGUNDOS
        System.out.println("Tempo de execução: " + milliseconds + " milisegundos.");

        // IMPRIME O VETOR ORDENADO
        /*for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print(vetor[i] + " "); 
        }*/
    }
}
