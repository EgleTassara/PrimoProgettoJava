public class SommaArmonica {

    /*Scrivere un programma che, dato un intero n in input, calcoli la somma di una serie armonica fino a n*/

    public static void main(String[] args) {
        System.out.println(harmonicSum(0) == (0));
        System.out.println(harmonicSum(1) == (1));
        System.out.println(harmonicSum(2) == (3./2));
        System.out.println(harmonicSum(20) == (55835135./15519504));
    }

    private static double harmonicSum(int n) {
        if (n <= 1)
            return 1;
        else
            return ((double) 1/n) + harmonicSum(n - 1);
    }

}
