/*
Desenvolva um programa que leia dois números fornecidos pelo usuário. O primeiro
número será o início do intervalo e o segundo número o final do intervalo. Verifique cada
número desse intervalo, incluindo o número inicial e final do intervalo, e exiba as seguintes
mensagens:
a. “pif”: caso o número seja divisível por 3
b. “paf”: caso o número seja divisível por 5
c. “pifpaf”: caso o número seja divisível por 3 e 5
 */
package ListaJava01;
import java.util.Scanner;
public class E17 {

    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
       int inicio = teclado.nextInt();
       int fim = teclado.nextInt();
       for(int i = inicio; i < fim; i ++){
           if(i % 3 == 0 && i % 5 == 0){
               System.out.println(i+": PifPaf");
       }
           else if(i % 3 == 0){
               System.out.println(i+": Pif");
           }
           else if(i % 5 ==0){
               System.out.println(i+": Paf");
           }
       }
    }
    
}
