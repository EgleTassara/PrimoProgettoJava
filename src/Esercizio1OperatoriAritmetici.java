import java.util.Scanner;

public class Esercizio1OperatoriAritmetici {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Inserisci un numero intero");
        int a = myObj.nextInt();
        System.out.println("Inserisci un altro numero intero");
        int b = myObj.nextInt();

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
    }

}
