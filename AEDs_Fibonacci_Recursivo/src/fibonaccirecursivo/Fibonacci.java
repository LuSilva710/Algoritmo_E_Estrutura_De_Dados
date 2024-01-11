package fibonaccirecursivo;
// Fibonacci
// Sequencia de números inteiros iniciados por zero e um, no qual cada termo subsequente corresponde a soma dos dois numeros anteriores: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144...

public class Fibonacci {

    public static void main(String[] args) {
        int n = 40;
        Fibonacci fib = new Fibonacci();
       
        for (int i = 0; i <= n; i++) {
            System.out.println("Fibonacci (" + i + ") = " + fib.fibonacci(i));
        }
    }

    public int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
