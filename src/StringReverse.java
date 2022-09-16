import java.util.Scanner;

public class StringReverse {

    /*Scrivere un metodo che, data una stringa s in input, ne stampi il reverse, ossia la stringa al contrario.
    Esempio: data la stringa «ciao», dovrà stampare «oaic».*/

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Scrivi una frase!!");
        String str = myObj.nextLine();
        System.out.println("Questa è la frase che hai inserito: " + str);
        StringBuilder strb = new StringBuilder(str);
        str = strb.reverse().toString();
        System.out.println("Questa è la tua frase al contrario: " + str);

        //Utilizzando Array e ciclo for

        String s = "Welcome guys";

        char[] ch = s.toCharArray();
        String text = "";
        for (int i=ch.length-1; i>=0; i--) {
            text = text + ch[i];
        }

        System.out.println("Frase originale: " + s);
        System.out.println("Frase al contrario " + text);

    }

}
