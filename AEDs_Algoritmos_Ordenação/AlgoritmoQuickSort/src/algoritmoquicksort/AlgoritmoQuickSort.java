/*
* ALGORITMO DE ORDENAÇÃO: QUICK SORT
* ORDEM CRESCENTE
 */
package algoritmoquicksort;

//import java.util.Random;
import java.util.Random;

public class AlgoritmoQuickSort {

    public static void main(String[] args) {
        int tamanhoVetor = 500000;
        int vetor[] = new int[tamanhoVetor];
        int intervaloMin = 1; // VALOR MINIMO DOS NÚMEROS ALEATÓRIOS 
        int intervaloMax = 500000; // VALOR MAXIMO DOS NÚMEROS ALEATÓRIOS 

        Random random = new Random();
        for (int i = 0; i < tamanhoVetor; i++) {
         //GERA UM NÚMERO ALEATÓRIO ENTRE INTERVALO MIN E MAX (inclusive)
           vetor[i] = random.nextInt(intervaloMax - intervaloMin + 1) + intervaloMin;
        }
        
        // PREENCHE O VETOR COM VALORES ATE 500000
        //for (int i = 0; i < tamanhoVetor; i++) {
        //   vetor[i] = i + 1;
        // }
        
        // TEMPO DE EXECUÇÃO INICIA AQUI 
        long startTime = System.nanoTime();

        // CHAMA A FUNÇÃO QUICKSORT PARA ORDENAR O VETOR
        quickSort(vetor, 0, vetor.length - 1);

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);  // TEMPO DE EXECUÇÃO EM NANOSSEGUNDOS
        double milliseconds = (double) duration / 1_000_000.0; // CONVERTE EM MILISEGUNDOS
        System.out.println("Tempo de execução: " + milliseconds + " milisegundos.");

        // IMPRIME O VETOR ORDENADO
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

    private static void quickSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            // SEPARA O VETOR EM DUAS PARTES E REORNA A POSIÇÃO DO PIVO
            int posicaoPivo = separar(vetor, inicio, fim);
            // ORDENA A PRIMEIRA PARTE DO VETOR (ANTES DO PIVO)
            quickSort(vetor, inicio, posicaoPivo - 1);
            // ORDENA A SEGUNDA PARTE DO VETOR (DEPOIS DO PIVO)
            quickSort(vetor, posicaoPivo + 1, fim);
        }
    }

    // METODO SEPARAR: DIVIDE O VETOR EM DUAS PARTES COM BASE NO VALOR DO PIVO
    private static int separar(int[] vetor, int inicio, int fim) {
        int pivo = vetor[inicio];
        int indicePercorrer = inicio + 1;
        while (indicePercorrer <= fim) {
            if (vetor[indicePercorrer] <= pivo) {
                indicePercorrer++;
            } else if (pivo < vetor[fim]) {
                fim--;
            } else {
                int troca = vetor[indicePercorrer];
                vetor[indicePercorrer] = vetor[fim];
                vetor[fim] = troca;
                indicePercorrer++;
                fim--;
            }
        }

        // COLOCA PIVO NA POSIÇÃO CORRETA
        vetor[inicio] = vetor[fim];
        vetor[fim] = pivo;
        return fim;
    }
}
