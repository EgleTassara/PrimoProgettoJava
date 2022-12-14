import java.util.Scanner;
import java.util.Arrays;

public class minimoMassimo {

    /*Scrivere un metodo che stampa l’ennesimo elemento della sequenza di Fibonacci, nella quale ogni numero è definito
    dalla somma dei due precedenti, eccetto i primi due che sono per definizione 0 e 1.
    Esempio: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ... E così via.
    Assumete di iniziare da 0, dunque fibonacci(0) = 0, fibonacci(1) = 1, ... e così via.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers (comma-separated):");
        // Stringa di numeri inseriti dall'utente
        String a = sc.nextLine();
        // Creazione dell'array contente il metodo parse, passandogli come parametro la stringa
        int[] values = parseNumbers(a);
        computeMinAndMax(values);
    }

    // s è un parametro dell'array
    static int[] parseNumbers(String s) {
        //s  = "1,2,3"
        String[] values = s.split(",");
        //["1","2","3"]
        // Creazione dell'array di appoggio
        int[] arrayInteri = new int[values.length];
        // ciclare l'array di appoggio e parsarlo in interi
        for (int i = 0; i < values.length; i++) {
            arrayInteri[i] = Integer.parseInt(values[i]);
        }
        return arrayInteri;
    }

    static void computeMinAndMax(int[] values) {
        int minimo = 0;
        int massimo = 0;
        for (int value : values) {
            if (value < minimo) {
                minimo = value;
            }
            else if(value > massimo) {
                massimo = value;
            }
        }
        System.out.println(minimo + "," + massimo);
    }

}
