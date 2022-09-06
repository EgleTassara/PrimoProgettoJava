public class Main {

    //Permette di eseguire il programma
    //Questo main è un metodo ed in Java equivale ad una funzione
    //Un metodo è una funzione contenuta in una classe

    /* un metodo si scrive definendo i modificatori di visibilità, altri modificatori
       tipo di ritorno, nome del metodo e tra parwntesi tonde i parametri
    */
    public static void main(String[] args) {
        System.out.println("Hello Word!");

        int a = 3;
        int b = 2;
        //non uscirà il resto in quanto a e b sono interi per avere il resto devo dichiarare tutti double
        int c = a/b;
        System.out.println(c);
        float d = c;
        System.out.println(d);

        //metodo String
        String s = "buon pomeriggio a tutti";
        System.out.println(s.length());

        String s2 = s.substring(1, 9);
        System.out.println((s2));

        //equals per verificare se 2 stringhe sono uguali;
        System.out.println(s2);
        System.out.println(s.equals(s2));

        char x = s.charAt(11);
        System.out.println(x);

        //stringhe maiuscole
        System.out.println(s.toUpperCase());
        System.out.println(s);

        /* Ovviamente prende la variabile e la modifica ma se ristampo s senza riassegnarne il valore verrà
        stampata sempre in minuscolo */
        s = s.toUpperCase();

        Double number = 5.2;
        System.out.println(number++);
        System.out.println(number);
        System.out.println(++number);
    }

}
