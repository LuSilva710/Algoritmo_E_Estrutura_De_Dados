/*
Desenvolva um programa para calcular a soma dos pesos das pessoas com mais de trinta
anos. O usuário deverá informar a quantidade de pessoas e em seguida a idade e o peso de
cada uma delas. Exiba o resultado na tela.
 */
package ListaJava01;
import java.util.Scanner;
public class E13 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        float peso, soma = 0;
        int idade, n_pessoas, cont = 0;
        System.out.print("Informe a quantidade de pessoas: ");
        n_pessoas = teclado.nextInt();
        
        while(cont < n_pessoas){
            System.out.print("Informe idade: ");
            idade = teclado.nextInt();
            System.out.print("Informe peso.: ");
            peso = teclado.nextFloat();
            if(idade > 30){
                soma = soma + peso;
            }
             cont++;
        }
        System.out.print("A soma do peso das pessoas com idade maior que 30 anos é igual a " + soma + "kg.\n");
    } 
}
