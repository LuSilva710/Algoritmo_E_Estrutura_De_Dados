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
public class E03comIF {

    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
       String siglaEstado = "";
       
       System.out.print("Informe estado: ");
       siglaEstado = teclado.nextLine();
       teclado.close();
       
       if ("RJ".equals(siglaEstado) || "rj".equals(siglaEstado)) {
            System.out.println("Carioca!\n");
        } else if ("SP".equals(siglaEstado) || "sp".equals(siglaEstado)) {
            System.out.println("Paulista!\n");
        } else if ("MG".equals(siglaEstado) || "mg".equals(siglaEstado)) {
             System.out.println("Mineiro!\n");
        }  else if ("RN".equals(siglaEstado) || "rn".equals(siglaEstado)) {   
             System.out.print("Potiguar\n");
        } else if ("ES".equals(siglaEstado) || "es".equals(siglaEstado)) {   
             System.out.print("Capixaba!\n");
        } else if ("RS".equals(siglaEstado) || "rs".equals(siglaEstado)) {   
             System.out.print("Gaucho!\n"); 
        } else if ("SC".equals(siglaEstado) || "sc".equals(siglaEstado)) {   
             System.out.print("Catarinense!\n"); 
        } else {
            System.out.println("Outro estado!");
         }   
    }         
}
