public class NumeriPrimi {

    /*Scrivere un metodo che, dato in input un intero a, ritorni true se il numero è primo, false altrimenti.*/

    public static void main(String[] args) {

        int number = 0;
        System.out.println(isPrime(number));
        number = 1;
        System.out.println(isPrime(number));
        number = 2;
        System.out.println(isPrime(number));
        number = 17;
        System.out.println(isPrime(number));
        number = 631;
        System.out.println(isPrime(number));
        number = 634;
        System.out.println(!isPrime(number));
        number = 999;
        System.out.println(!isPrime(number));
        number = 997;
        System.out.println(isPrime(number));
    }

    private static boolean isPrime(int number) {
        if(number < 2) //il primo numero primo è il 2, quindi se abbiamo un numero minore a 2 allora non sarà primo
            return false;

        if (number <= 3) //se il numero in questione è minore o uguale a 3 allora a questo punto si tratta del 2 o del 3, entrambi primi
            return true;

        if (number % 2 == 0) //se dividendo per 2 il numero si ha resto uguale a zero allora è un numero pari (maggiore a 2) quindi primo
            return false;


        for (int i=3; i<number; i=i+2) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

}
