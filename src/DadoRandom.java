import java.util.Random;

public class DadoRandom {

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
