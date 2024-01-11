/*
 4 - Escreva uma função recursiva que recebe dois números min e max que definem o intervalo. Imprima todos os número pares e ímpares da seguinte forma, por exemplo:
	min = 1 e max = 6
	Números pares: 2 4 6
	Números ímpares: 1 3 5
 */
package aeds_4;

import java.util.Scanner;

public class AEDS_4 {

    public static void paresIntervaloMinMax(int valor, int min, int max) {
        if (valor <= max) {
            if (valor % 2 == 0) {
                System.out.print(valor + " ");
            }
            paresIntervaloMinMax(valor + 1, min, max);
        }
    }

    public static void imparesIntervaloMinMax(int valor, int min, int max) {
        if (valor <= max) {
            if (valor % 2 != 0) {
                System.out.print(valor + " ");
            }
            imparesIntervaloMinMax(valor + 1, min, max);
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Valor inicial: ");
        int min = teclado.nextInt();
        System.out.print("Valor final: ");
        int max = teclado.nextInt();

        System.out.println("Valores pares: ");
        paresIntervaloMinMax(min, min, max);

        System.out.println("\nValores ímpares: ");
        imparesIntervaloMinMax(min, min, max);
    }
}
