import java.util.Scanner;

public class Esercizio4 {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Digita una parola");
        String a = myObj.nextLine();

        System.out.println("Digita un'altra parola");
        String b = myObj.nextLine();

        System.out.println("Digita un'altra parola");
        String c = myObj.nextLine();
        System.out.println(c);

        System.out.println("Le parole che hai digitato sono:" + a + " " + b + " " + c);
        //String c = a.replaceAll();
    }

}
