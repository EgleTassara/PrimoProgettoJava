import java.util.*;

public class SecondiOreMinutiGiorni {

    /*Scrivete una funzione che dato in input un numero di secondi, restituisce una stringa che dice «Giorni: numero
    di giorni, Ore: numero di ore etc...»*/

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input secondi: ");
        int seconds = in.nextInt();
        int S = seconds % 60;
        int H = seconds / 60;
        int M = H % 60;
        H = H / 60;
        int G = H / 24;
        System.out.print("Giorni " + G + " : " + "Ore " + H + " : " + "Minuti " + M + " : " + "Secondi " + S);
        System.out.print("\n");
    }
}
