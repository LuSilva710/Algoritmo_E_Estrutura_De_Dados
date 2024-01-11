/*
Faça um programa que leia o número e a altura de 5 atletas. Calcular o exibir o número e a
altura do maior atleta. A entrada da altura será em centímetros.
*/
package ListaJava01;
import java.util.Scanner;
public class E01 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int n_atleta, altura_atleta, cont, maior_altura = 0, maior_atleta = 0;
        
        for(cont = 1; cont <= 5; cont++){
                System.out.print("Informe o número "+cont+ "° do atleta: ");
                n_atleta = teclado.nextInt();
                System.out.print("Informe altura do atleta.....: ");
                altura_atleta = teclado.nextInt();
                teclado.close();
                if(altura_atleta > maior_altura) {
                maior_atleta = n_atleta;
                maior_altura = altura_atleta;
                }   
          }
        System.out.printf("O atleta %d apresenta a maior altura = %dcm\n", maior_atleta, maior_altura);
    }  
}
