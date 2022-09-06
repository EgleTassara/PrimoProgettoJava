import java.util.Scanner;

public class contaOccorrenzeInStringa {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter character a:");
        String a = sc.nextLine();
        System.out.print("Enter string b:");
        String b =sc.nextLine();
        countOccurrences(a.charAt(0), b);
    }

    static void countOccurrences(char a, String b) {
        int count = 0;
        System.out.println(b);
        for (int x = 0; x<b.length(); x++) {
            System.out.println(b.charAt(x));
            char z = b.charAt(x);
            if(z == a){
                count++;
            }
        }

        System.out.println(count);
    }

}
