import java.util.Scanner;

public class InvertiStringa {

    /*Data una stringa, stampare la stessa stringa invertendone il contenuto a partire dal primo spazio, ad esempio
    data la stringa «come stai» stampare a video «stai come». Potete dare per assunto che la stringa conterrà sempre
    un solo spazio.*/

    public static void main(String[] arg) {

          Scanner scanner = new Scanner(System.in);
          System.out.print("Original string : ");

          String originalStr = scanner.nextLine();
          scanner.close();

          String words[] = originalStr.split("\\s");
          String reversedString = "";

          //Reverse each word's position
          for (int i = 0; i < words.length; i++) {
              if (i == words.length - 1)
                  reversedString = words[i] + reversedString;
              else
                  reversedString = " " + words[i] + reversedString;
          }

          // Displaying the string after reverse
          System.out.print("Reversed string : " + reversedString);
    }

}
