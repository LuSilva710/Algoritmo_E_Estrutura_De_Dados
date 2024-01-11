/*
 Desenvolva um programa que calcule uma operação de potência. A base e o expoente
devem ser solicitados ao usuário. O valor a ser retornado é base^expoente.
Por exemplo, o usuário digita para o valor da base “3” e para o expoente “4”. A operação a ser realizada é
“3 * 3 * 3 * 3”. Assuma que o expoente seja um valor inteiro maior ou igual a zero e a base
seja um valor inteiro. Não utilize operadores matemáticos que calculam a potência
diretamente.
 */
package ListaJava01;
import java.util.Scanner;
public class E15 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int base, expoente, cont = 0,  resultado = 1;
        System.out.print("Informe a base da potencialização....: ");
        base = teclado.nextInt();
        System.out.print("Informe o expoente da potencialização: ");
        expoente = teclado.nextInt();
        if(expoente >= 0){
            while(cont < expoente){
                resultado = resultado * base;
                cont++;
            }
        }
        System.out.print("O resultado da potencialização é igual a: " +resultado+ ".\n");
    }
    
}
