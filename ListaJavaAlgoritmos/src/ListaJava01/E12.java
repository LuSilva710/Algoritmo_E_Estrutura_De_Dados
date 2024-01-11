/*
Faça um programa que leia dois números, calcule e imprima a soma dos mesmos. O
programa deve repetir até que ambos os valores digitados sejam iguais a zero.
 */
package ListaJava01;
import java.util.Scanner;
public class E12 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1 = 1, n2 = 1, soma = 0;
        
        while(n1 !=0 || n2 !=0){
        System.out.println("Para Finalizar informe 0 em ambos os campos!");
        System.out.print("Informe o primeiro valor: ");
        n1 = teclado.nextInt();
        System.out.print("Informe o segundo valor.: ");
        n2 = teclado.nextInt();
        soma = n1 + n2;
        System.out.println("A soma dos valores digitados é igual a " +soma+ ".\n");
        } 
        
    }
    
}
