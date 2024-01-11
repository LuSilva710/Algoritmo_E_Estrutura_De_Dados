package quantidadededigitos_recursivo;
// Para determinar quantos digitos de um numero inteiro positivo basta dividir por 10
// 

public class QuantidadeDeDigitos {

    public static void main(String[] args) {
        int n = 100000;
        QuantidadeDeDigitos div = new QuantidadeDeDigitos();
        System.out.println("Quantidade de divisões: " + dividir(n));
    }

    private static int dividir(int n) {
        if (n < 10) {
            return 1;
        } else{
            return 1 + dividir(n / 10);
        }
    }
}
