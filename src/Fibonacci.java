import java.util.Scanner;

public class Fibonacci {

    /*Scrivere un metodo che stampa l’ennesimo elemento della sequenza di Fibonacci, nella quale ogni numero è
    definito dalla somma dei due precedenti, eccetto i primi due che sono per definizione 0 e 1.
    Esempio: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ... E così via.
    Assumete di iniziare da 0, dunque fibonacci(0) = 0, fibonacci(1) = 1, ... e così via.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index:");
        int index = sc.nextInt();
        for (int i = 0; i <= index; i++) {
            int fibonacciNumber = printFibonacci(i);
            System.out.print(" " + fibonacciNumber);
        }
    }

    public static int printFibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return printFibonacci(n - 1) + printFibonacci(n - 2);
    }
}

