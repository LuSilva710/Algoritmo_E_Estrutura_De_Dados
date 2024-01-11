/*
 5 - Escreva uma função recursiva para calcular a potência e de um número n. 
 */
package aeds_5;

import java.util.Scanner;

public class AEDS_5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um valor: ");
        int numero = teclado.nextInt();
        System.out.print("Informe a potencia: ");
        int potencia = teclado.nextInt();

        int resultado = calcularPotencia(numero, potencia);
        System.out.println("Resultado: " + resultado);
    }

    public static int calcularPotencia(int base, int expoente) {
        // Condição de parada: quando o expoente é igual a 0, a potência é 1.
        if (expoente == 0) {
            return 1;
        }
        // Caso recursivo: calcular a potência chamando a função recursivamente.
        int resultado = base * calcularPotencia(base, expoente - 1);
        return resultado;
    }
}
