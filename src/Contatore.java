public class Contatore {

    /*
    Progettare una classe Contatore che permetta di
    • Istanziare la classe con un valore iniziale
    • Istanziare la classe senza un valore iniziale
    • Incrementare il conteggio attuale
    • Ottenere il conteggio attuale
    • Resettare il conteggio a zero
    • Resettare il conteggio ad un altro valore
    Scrivere un main che verifica le funzioni della classe Contatore
    */

    public static void main(String[] args) {
        int n;
        System.out.println("Valore iniziale del Counter: " + Count.valore);
        Count.reset();
        Count.incremento();
        n = Count.getValue();
        System.out.println("Valore finale del Counter " + Count.valore);
    }

    public class Count {
        //Stanziare valore iniziale del counter
        private static int valore = 11;
        //metodo per resettare il valore
        public static void reset() {valore = 0;}
        //Metodo per incrementare il valore
        public static void incremento() {valore++;}
        //Metodo per prendere il valore
        public static int getValue() {return valore;}
    }

}
