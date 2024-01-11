/*
Faça um programa que receba as notas AV1, AV2 e a frequência (em porcentagem) de um
aluno. Caso a frequência seja inferior a 50% ou ambas as notas sejam inferiores a 4,0, o
programa deve imprimir que o aluno está reprovado. Caso contrário, se apenas uma das
notas for inferior a 4,0 ou a média AV1 e AV2 for inferior a 6,0, o programa deve imprimir
que o aluno está de recuperação. Caso nenhuma das restrições anteriores se aplique, o
programa deve imprimir que o aluno está aprovado e apresentar sua média
*/

package ListaJava01;
import java.util.Scanner;
public class E05 {

    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
       double AV1, AV2, frequencia = 0, media = 0;
       System.out.print("Informe a AV1.......: ");
       AV1 = teclado.nextDouble();
       System.out.print("Informe AV2.........: ");
       AV2 = teclado.nextDouble();
       System.out.print("Informe a frequência: ");
       frequencia = teclado.nextDouble();
       teclado.close();
       
       media = (AV1 + AV2)/2;
       
       if(AV1 < 4 && AV2 < 4 ||  frequencia < 50){
           System.out.print("Aluno reprovado!");
       }else if(AV1 < 4 || AV2 < 4 || media < 6){
           System.out.print("Aluno em recuperação!");
       }else{
           System.out.print("Aluno aprovado!");
       }
    }
}
