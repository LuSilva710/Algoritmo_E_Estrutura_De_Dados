/*
3 - Escreva uma função recursiva que recebe um número e verifica se este é um primo ou não.
 */
package aeds_3;

import java.util.Scanner;

public class AEDS_3 {

    public static boolean verificadorDePrimos(int numero, int divisor) {
        if (numero < 0) {
            System.out.println("Valor inválido!");
        }
        if (numero < 2) {
            return false; // Números menores que 2 não são primos.
        }
        if (divisor == 1) {
            return true;      // Se chegou a 1, significa que nenhum divisor foi encontrado, é primo.
        }

        if (numero % divisor == 0) {
            return false;      // Encontrou um divisor, não é primo
        }

        // Chamada recursiva com um divisor menor (divisor - 1).
        return verificadorDePrimos(numero, divisor - 1);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Verificar numero: ");
        int numero = teclado.nextInt();

        if (verificadorDePrimos(numero, numero - 1)) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }
    }

}
