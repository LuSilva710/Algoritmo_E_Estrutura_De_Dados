
import java.util.ArrayList;
import java.util.List;

public class SomaSubconjuntos {

    public static boolean existeSubconjunto(int[] conjunto, int valorAlvo) {
        return existeSubconjuntoRecursivo(conjunto, valorAlvo, 0, new ArrayList<>());
    }

    private static boolean existeSubconjuntoRecursivo(int[] conjunto, int valorAlvo, int indice, List<Integer> subconjunto) {
       if (indice == conjunto.length) {
            int soma = calcularSoma(subconjunto);

            if (soma == valorAlvo) {
                System.out.println(subconjunto);
                return true;
            }
            return false;
        }

        subconjunto.add(conjunto[indice]);
        if (existeSubconjuntoRecursivo(conjunto, valorAlvo, indice + 1, subconjunto)) {
            return true;
        }

        subconjunto.remove(subconjunto.size() - 1);
        return existeSubconjuntoRecursivo(conjunto, valorAlvo, indice + 1, subconjunto);
    }
    
     private static int calcularSoma(List<Integer> subconjunto) {
        int soma = 0;
        for (int elemento : subconjunto) {
            soma += elemento;
        }
        return soma;
    } 

    public static void main(String[] args) {
        int[] conjunto = {3, 5, 1, 8, -4};
        int valorAlvo = 4;

        System.out.println("Existe subconjunto: " + existeSubconjunto(conjunto, valorAlvo));
    }
}
