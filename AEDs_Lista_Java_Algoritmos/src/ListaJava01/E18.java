/*
A fábrica da Vôlquis produz uma determinada quantidade de automóveis por dia. Faça um
programa para ler a quantidade produzida diariamente ao longo de um período (em dias)
informado pelo usuário, e depois informe:
a. A quantidade produzida nesse período
b. A média diária de produção
c. A menor produção diária do período
d. A maior produção diária do período
*/

package ListaJava01;
import java.util.Scanner;
public class E18 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int maior_producao = 0, menor_producao = 999, producao=0, soma = 0;
        double media=0;
        
        System.out.print("Período (em dias) de produção analisada: ");
        int periodo = teclado.nextInt();
        for(int i = 1; i <= periodo; i++){
        System.out.print("Quantidade produzida no "+i+ "° dia: ");
        producao = teclado.nextInt();
        soma = soma + producao;
        media = soma/periodo;
        if(menor_producao > producao){
            menor_producao = producao;
        }
        if( maior_producao < producao){
            maior_producao = producao;
        }
        }
         System.out.println("Quantidade produzida nos "+periodo+" dias: "+soma);
         System.out.println("Média diária de produção: "+media);
         System.out.println("Menor produção diária: "+menor_producao);
         System.out.println("Maior produção diária: "+ maior_producao);   
    }
}
