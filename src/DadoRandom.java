import java.util.Random;

public class DadoRandom {

    /*
    • Non tutti i dadi hanno 6 facce! Per ogni evenienza vogliamo simulare il lancio di un dado con un numero
        arbitrario di facce
    • Scrivete un programma che estrae casualmente un valore da un dado ad n facce (un intero compreso tra 1 e n)
    */

        public static void main(String args[])
        {
            int numeroFacce = 20;
            System.out.println(lanciaDado(numeroFacce));
        }

        private static int lanciaDado(int numeroFacce)
        {
            Random rand = new Random();
            int valueDado = rand.nextInt(20);
            System.out.println("Il numero del Dado che è uscito è: ");
            return valueDado + 1;
        }
    }
