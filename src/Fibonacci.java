import java.util.Scanner;

public class Fibonacci {
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

