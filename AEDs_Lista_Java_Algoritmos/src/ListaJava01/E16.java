/*
 Faça um programa que receba um número inteiro e positivo do usuário e calcule a fatorial
(!) desse número. Exemplo: 4! = 4*3*2*1 = 24.
 */
package ListaJava01;
import java.util.Scanner;
public class E16 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor, cont = 1, resultado = 1;
        System.out.print("Informe um valor: ");
        valor = teclado.nextInt();
        while(cont <= valor){
            resultado = resultado * cont;
            cont++;
        }
        System.out.print("A fatorial de "+valor+" é igual a: " +resultado+".\n");
    }
    
}
