import java.util.Scanner;

public class TrueFalse {

    /*Dato un numero, stampare true se il numero è pari, false altrimenti.*/

    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero intero");
        int x = scanner.nextInt();

        boolean risultato = x % 2 == 0;
        System.out.println(risultato);
    }

}
