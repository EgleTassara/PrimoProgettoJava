import java.util.Arrays;
import java.util.Random;

public class DispariPerDue {

    public static void main(String[] args) {

        // generare 99 numeri casuali
        Random rand = new Random();
        int randomNum = rand.nextInt(100);

        //Dichiarare l'array e assegnargli i numeri casuali
        int [] arrayNumRandom = new int[5];
        int [] arrayNumDispari = new int[5];

        //indice randomico dell'array di n umeri dispari
        int numeriArray = 0;

        //ciclare l'array dei numeri random per assegnargli i numeri random da 0 a 100
        for (int i = 0; i < arrayNumRandom.length; i++) {

            arrayNumRandom[i] = (int) (Math.random() * randomNum);

            //controllo per i numeri dispari
            if (arrayNumRandom[i] % 2 != 0) {
                //assegnazione dei valori
                arrayNumDispari[numeriArray] = arrayNumRandom[i] * 2;
                numeriArray++;
            }
        }

        System.out.println(Arrays.toString(arrayNumDispari));

    }

}
