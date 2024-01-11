/*
Faça um programa para ler as quatro notas escolares de um aluno e imprimir uma mensagem
dizendo que o aluno foi aprovado se o valor da média escolar for maior ou igual a 7,0. Se a
média for entre 5,0 (inclusive) e 7,0, informar que o aluno está em recuperação. Se a média
for inferior a 5,0 o aluno foi reprovado.
 */
package ListaJava01;
import java.util.Scanner;
public class E08 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        float n1, n2, n3, n4, media;
        System.out.print("Informe a primeira nota (0 a 10): ");
        n1 = teclado.nextFloat();
        System.out.print("Informe a segunda nota (0 a 10).: ");
        n2 = teclado.nextFloat();
        System.out.print("Informe a terceira nota (0 a 10): ");
        n3 = teclado.nextFloat();
        System.out.print("Informe a quarta nota (0 a 10)..: ");
        n4 = teclado.nextFloat();
        teclado.close();
        
        media = (n1 + n2 + n3 + n4) / 4;
        
        if(media >= 7) {
            System.out.print("Aluno aprovado!\n");            
        }else if(media >= 5 && media < 7){
            System.out.print("Aluno em recuperação!\n");
        }else if(media < 5){
            System.out.print("Aluno reprovado!\n");
        }
    }
}
