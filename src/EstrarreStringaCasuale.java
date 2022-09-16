import java.util.Random;

public class EstrarreStringaCasuale {

    /*
    • A partire da un array di stringhe, es. [‘Andrea’, ‘Marco’, ‘Melvin’, ...], vogliamo estrarre uno dei valori
        presenti in esso
    • Scrivete un programma che dato un array di stringhe, estrae casualmente una delle stringhe
    • Provate a implementare diverse soluzioni del programma, utilizzando i diversi metodi per estrarre un
    valore casuale e provando ad estrarre la stringa con una probabilità non omogenea, es. ‘Andrea’ viene estratto
    il 50% delle volte, ‘Marco’ il 20%, ...
    */

    public static void main(String[] args) {
        //Creare l'array di Stringhe
        String[] nomi = {"Daniel", "Valerio", "Filippo", "Pippo", "Rossi"};
        //Generare il metedo Random
        Random estrattoreRandom = new Random();
        //Numero Casuale equivalente all'indice dell'array
        int numeroRandom = estrattoreRandom.nextInt(5);
        //Stampare a video il numero random
        System.out.println(nomi[numeroRandom]);
    }

}
