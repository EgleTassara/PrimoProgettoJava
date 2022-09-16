import java.util.Scanner;

public class MinimumMaximum {

    /*Scrivere un metodo che stampa l’ennesimo elemento della sequenza di Fibonacci, nella quale ogni numero è definito
    dalla somma dei due precedenti, eccetto i primi due che sono per definizione 0 e 1.
    Esempio: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ... E così via.
    Assumete di iniziare da 0, dunque fibonacci(0) = 0, fibonacci(1) = 1, ... e così via.*/

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter numbers (comma-separated):");
        String a = sc.nextLine();
        int[] values = parseNumbers(a);
        computeMinAndMax(values);
    }

    static int[] parseNumbers(String s) {
        String[] values = s.split(",");
        int[] result = new int[values.length];
        for(int i=0; i<values.length; i++)
            result[i] = Integer.parseInt(values[i]);
        return result;
    }

    static void computeMinAndMax(int[] values) {
        int min = 0, max = 0;
        for(int value : values)
            if(value < min)
                min = value;
            else if(value > max)
                max = value;
        System.out.println(min + "," + max);
    }
}
