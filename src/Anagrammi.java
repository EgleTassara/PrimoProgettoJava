import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagrammi {

    /*Due stringhe a e b sono dette anagrammi se contengono gli stessi caratteri con le stesse frequenze. Ad esempio,
    gli anagrammi di CAT sono CAT, ACT, TAC, TCA, ATC, e CTA.
    Date due stringhe a e b in input, stampare «anagrammi» se sono anagrammi (case-insensitive), «non anagrammi»
    altrimenti.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserire la Stringa a:");
        String a = sc.nextLine();
        System.out.print("Inserire la stringa b:");
        String b =sc.nextLine();
        anagrams(a, b);
        if(anagrams(a, b)) {
            System.out.println("Anagramma");
        } else {
            System.out.println("Non è un Anagramma");
        }
    }

    static boolean anagrams(String a, String b) {
        //Caso base nel caso in cui le 2 stringhe siano vuote
        if (a == null || b == null) {
            return false;
        }
        //Se la lunghezza è differente tra le 2 stringhe non possono essere anagrammi
        if (a.length() != b.length()) {
            return false;
        }
        //Creiamo la mappa vuota per mappare i caratteri in interi.
        Map<Character, Integer> freq = new HashMap<>();
        //Mantiene il conteggio di ogni carattere di 'a' sulla mappa
        for (char caratteri: a.toCharArray()) {
            freq.put(caratteri, freq.getOrDefault(caratteri, 0) + 1);
        }
        //Fare per ogni carattere 'B' di 'b'
        for (char caratteri: b.toCharArray()) {
            //Se 'B' non è trovato nella mappa, cioè o 'B' non è presente
            //nella stringa 'a' o ha più occorrenze nella stringa 'B'
            if(!freq.containsKey(caratteri)) {
                return false;
            }
            //Diminuisce la frequenza di 'B' sulla mappa
            freq.put(caratteri, freq.get(caratteri) - 1);
            //Se la sua frequenza diventa 0, cancellala dalla mappa
            if (freq.get(caratteri) == 0) {
                freq.remove(caratteri);
            }
        }
        //Restituisce true se la mappa diventa vuota
        return freq.isEmpty();

    }


}

