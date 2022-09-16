import java.util.Scanner;

public class RimpiazzaGliIntrusi {

    /*Date tre stringhe a, b e c in input, stampare c dopo aver rimpiazzato, all’interno di c, ogni occorrenza
    compresa tra due spazi di a con b. Ad esempio, date in input le stringhe «a», «b», «a abc d», stampare a
    video «a bbc d».*/

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
