/*
Desenvolva um programa que solicite e leia as alturas de quatro atletas que participaram dos
Jogos Olímpicos do Rio 2016. Após a leitura das alturas o programa deve exibir as seguintes
informações.
* maior altura
* menor altura
* altura média
 */
package ListaJava01;
import java.util.Scanner;
public class E10 {

    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
       float  altura, maior_altura = 0, menor_altura=3, media=0;
       int cont;
       
       for(cont = 1; cont <=4; cont++){
       System.out.print("Informe a altura do "+cont+" atleta: ");
       altura = teclado.nextFloat();
       teclado.close();
       
       media = media + altura;
       if(altura > maior_altura){
           maior_altura = altura;
       }else if(altura < menor_altura){
           menor_altura = altura;
       }
       }  
      media = media/4;
      System.out.print("O maior atleta possui " + maior_altura + "m, o menor atleta possui " + menor_altura+ "m, e a altura média é igual a " + media + "m.\n");
    }
}
