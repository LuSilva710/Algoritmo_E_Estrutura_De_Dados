/*
Fazer um programa que leia a sigla do estado de uma pessoa e imprima uma das mensagens
abaixo de acordo com estado informado:
a. carioca (RJ)
b. paulista (SP)
c. mineiro (MG)
d. potiguar (RN)
e. capixaba (ES)
f. gaucho (RS)
g. catarino (SC)
h. outro estado
*/

package ListaJava01;
import java.util.Scanner;
public class E03 {

    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
       String estado = "";
       
       System.out.print("Informe estado: ");
       estado = teclado.nextLine().toUpperCase();
       teclado.close();
       switch (estado) {
           case "RJ": 
               System.out.print("Carioca\n");
               break;
            
           case "SP": 
               System.out.print("Paulista\n");
               break;
               
           case "MG": 
               System.out.print("Mineiro\n");
               break;
               
           case "RN":
               System.out.print("Potiguar\n");
               break;
               
           case "ES":
               System.out.print("Capixaba\n");
               break;
               
           case "RS":
               System.out.print("Gaucho\n");
               break;
               
           case "SC":
               System.out.print("Catarinense\n");
               break;
               
           default: 
               System.out.print("Outro estado\n");           
       }
    }
}
