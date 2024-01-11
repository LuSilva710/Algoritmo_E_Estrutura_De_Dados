/*
Escrever um programa que leia três números e exiba-os em ordem decrescente
 */
package ListaJava01;
import java.util.Scanner;
public class E04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, n2, n3;
        System.out.print("Informe o primeiro número: ");
        n1= teclado.nextInt();
        System.out.print("Informe o segundo número.: ");
        n2 = teclado.nextInt();
        System.out.print("Informe o terceiro número: ");
        n3 = teclado.nextInt();
        teclado.close();
        if(n1 > n2 && n1 > n3){
            if(n2 > n3){
                System.out.print("A ordem decrescente dos valores é: " + n1 + ", " + n2 +", "+ n3 +".\n");
            }else{
                System.out.print("A ordem decrescente dos valores é: " + n1 + ", " + n3 +", "+ n2 +".\n");
            }
        } else if(n2 > n1 && n2 > n3){
             if(n1 > n3){
                 System.out.print("A ordem decrescente dos valores é: " + n2 + ", " + n1 +", "+ n3 +".\n");
             }else{
                 System.out.print("A ordem decrescente dos valores é: " + n2 + ", " + n3 +", "+ n1 +".\n");
             }
        }else{
                 if(n1 > n2) {
                 System.out.print("A ordem decrescente dos valores é: " + n3 + ", " + n1 + ", " + n2+ ".\n");
             }else {
                  System.out.print("A ordem decrescente dos valores é: " +n3+ ", " + n2+ ", " + n1+ ".\n");
             }
         }
        }
    }
