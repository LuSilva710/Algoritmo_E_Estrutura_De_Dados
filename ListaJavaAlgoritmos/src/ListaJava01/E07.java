/*
 Faça um programa que leia um número e some 5 caso seja par e divisível por 5 ou some 8
caso seja ímpar. Imprimir o resultado desta operação.
 */
package ListaJava01;
import java.util.Scanner;
public class E07 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor;
        System.out.print("Informe um valor: ");
        valor = teclado.nextInt();
        teclado.close();
        
        if(valor % 2 == 0 && valor % 5 == 0){
            valor = valor + 5;
            System.out.print("Resultado é um número par igual a: " + valor + ".\n");
        }else if(valor % 2 != 0){
            valor = valor + 8;
            System.out.print("Resultado é um número impar igual a: " + valor + ".\n");
        }
    }
}
