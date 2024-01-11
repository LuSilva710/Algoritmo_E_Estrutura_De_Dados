/*
 Faça um programa para ler um número inteiro n, calcular e exibir a soma dos números
inteiros ímpares no intervalo [1;n].
 */
package ListaJava01;
import java.util.Scanner;
public class E14 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, cont = 1, soma = 0;
        System.out.print("Informe um valor: ");
        n = teclado.nextInt();
        while(cont < n){
            if(cont % 2 != 0){
                soma = soma + cont;
            }
            cont++;
        }
        System.out.print("A soma dos valores ímpares entre 1 e " + n + " é igual a " + soma+".\n");
        
    }
    
}
