import java.util.Arrays;
import  java.util.Scanner;
import java.util.Random;

public class Tabbelline {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Scrivi un numero");
        int n = myObj.nextInt();
        System.out.println("Decidi la lunghezza dell'array!");
        int m = myObj.nextInt();
        Random valoriArray = new Random();
        int randomNum = valoriArray.nextInt(200);
        int [] arrayEmme = new int[m];
        int moltiplicazione = 0;


        for (int i = 0; i < m; i++) {
            moltiplicazione = n * i;
            System.out.println(moltiplicazione);
            arrayEmme[i] = moltiplicazione;
        }
        System.out.println(Arrays.toString(arrayEmme));
    }

}
