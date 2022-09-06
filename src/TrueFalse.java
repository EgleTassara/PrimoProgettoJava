import java.util.Scanner;

public class TrueFalse {

    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero intero");
        int x = scanner.nextInt();

        boolean risultato = x % 2 == 0;
        System.out.println(risultato);
    }

}
