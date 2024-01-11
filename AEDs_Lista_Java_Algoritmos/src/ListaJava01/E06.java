/*
O IMC (Índice de Massa Corporal) é um critério da Organização Mundial de Saúde para dar
uma indicação sobre a condição de peso de uma pessoa adulta. A fórmula é IMC =
peso/altura^2.
Desenvolva um programa que leia o peso e a altura de um adulto e mostre sua
condição de acordo com a tabela abaixo.
IMC <18,5 = baixo peso
IMC ≥18,5 até 25 = eutrofia (peso adequado)
IMC ≥25 até 30 = sobrepeso
IMC ≥30 até 35 = obesidade grau 1
IMC≥35 até 40 = obesidade grau 2
IMC≥ 40 = obesidade extrema
 */
package ListaJava01;
import java.util.Scanner;
public class E06 {

    public static void main(String[] args) {
       Scanner teclado =new Scanner (System.in);
       double peso, altura, imc;
       System.out.print("informe seu peso em quilogramas: ");
       peso = teclado.nextDouble();
       System.out.print("Informe sua altura em metros...: ");
       altura = teclado.nextDouble();
       teclado.close();
       imc = peso / (altura * altura);
       System.out.printf("Seu IMC é......................: %.2f\n", imc); 
       
       if (imc < 18.5){
        System.out.print("Condição.............: Abaixo do peso.\n");
       }else if(imc >= 18.5 && imc < 25){
        System.out.print("Condição................: Peso normal.\n");
       }else if(imc >= 25 && imc < 30){
           System.out.print("Condição..................: Sobrepeso.\n");
       }else if(imc >= 30 && imc < 35){
           System.out.print("Condição............: Obesidade Grau I.\n");
       }else if(imc >= 35 && imc < 40){
           System.out.print("Condição..........: Obesidade Grau II.\n");
      }else{
           System.out.print("Condição........: Obesidade Extrema.\n");
       }
    }    
}
