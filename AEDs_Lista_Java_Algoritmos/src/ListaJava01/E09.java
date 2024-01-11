/*
Crie um programa que leia um valor de hora (hh:mm:ss) [hh no formato de 24h] inserido
pelo usuário e informe quantos segundos se passaram desde o início do dia.
 */
package ListaJava01;
import java.util.Scanner;
public class E09 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int horas, minutos, segundos, resultado;
               
        System.out.print("Informe o valor de horas...: ");
        horas = teclado.nextInt();
        System.out.print("Informe o valor de minutos.: ");
        minutos = teclado.nextInt();
        System.out.print("Informe o valor de segundos: ");
        segundos = teclado.nextInt();
        teclado.close();
        
        horas = horas * 3600;
        minutos = minutos * 60;
        resultado = horas + minutos + segundos;
        System.out.print("Se passaram " + resultado +  " segundos desde o início do dia.\n");
    }
}
