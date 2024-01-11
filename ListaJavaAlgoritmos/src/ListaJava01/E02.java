/*
A prefeitura de Ouro Branco abriu uma linha de crédito para os funcionários estatutários. O
valor máximo da prestação não poderá ultrapassar 30% do salário bruto. Desenvolva um
programa que permita entrar com o salário bruto e o valor da prestação e informar se o
empréstimo pode ou não ser concedido.
 */
package ListaJava01;
import java.util.Scanner;
public class E02 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double salario, valor_prestacao, prestacao_maxima;
        System.out.print("Informe salário bruto.........: R$");
        salario = teclado.nextDouble();
        System.out.print("Informe o valor das prestações: R$");
        valor_prestacao = teclado.nextDouble();
        teclado.close();
        prestacao_maxima = salario * 0.3;
        
        if(valor_prestacao > prestacao_maxima ){
            System.out.print("Empréstimo não pode ser concedido!");
        }
        else{
            System.out.printf("Emprestimo concedido com sucesso! As prestações do empréstimo serão de: R$%.02f \n", valor_prestacao);
           }        
    }
}
