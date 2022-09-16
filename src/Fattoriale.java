public class Fattoriale {

    /*Scrivere un programma che, dato un intero n in input, ne calcoli il fattoriale*/

    public static void main(String[] args) {
        System.out.println(factorial(1) == (0));
        System.out.println(factorial(2) == (2));
        System.out.println(factorial(5) == (120));
        System.out.println(factorial(10) == (3628800));
        System.out.println(factorial(20) == 2432902008176640000L);
    }

    private static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        long count = 1;
        for (int i = 1; i <= n; i++) {
            count= count * i;
        }
        return count;
    }

}
