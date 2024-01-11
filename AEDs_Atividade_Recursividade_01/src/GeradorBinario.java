
public class GeradorBinario {
     public static void gerarNumeroBinario(int numeroBits) {
        gerarNumBinarioRecursivo(numeroBits, new int[numeroBits], 0);
    }

    private static void gerarNumBinarioRecursivo(int numeroBits, int[] atual, int indice) {
        if (indice ==  numeroBits) {
            imprimirBinario(atual);
        } else {
            atual[indice] = 0;
            gerarNumBinarioRecursivo(numeroBits, atual, indice + 1);

            atual[indice] = 1;
            gerarNumBinarioRecursivo(numeroBits, atual, indice + 1);
        }
    }

    private static void imprimirBinario(int[] bits) {
        for (int bit : bits) {
            System.out.print(bit + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        gerarNumeroBinario(7);
    }
}
