import java.util.Random;

public class EstrarreStringaCasuale {

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
