/*
Faça um programa que some todos os números digitados até que o número 0 seja digitado.
Exiba a soma dos números digitados.
 */
package ListaJava01;
import java.util.Scanner;
public class E11 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int valor = 1, soma = 0;
        
        while(valor != 0){
           System.out.print("Informe um valor: ");
           valor = teclado.nextInt();
           soma = soma + valor;
          }  
        System.out.print("A soma dos valores digitados é igual a  " + soma + ".\n");
        }    
}
