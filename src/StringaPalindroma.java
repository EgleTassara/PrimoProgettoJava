public class StringaPalindroma {

    /*Scrivere un programma che, data in input una stringa s, restituisca true se s è palindroma, false altrimenti
    Suggerimento: inserite il codice della vostra soluzione all’interno del metodo*/

    public static void main(String[] args) {
        System.out.println(isPalindrome("c"));
        System.out.println(isPalindrome("ciic"));
        System.out.println(isPalindrome("aaaa"));
        System.out.println(!isPalindrome("absca"));
        System.out.println(!isPalindrome("abbaa"));
        System.out.println(isPalindrome("zzzzz"));
        System.out.println(isPalindrome("zzczz"));
        System.out.println(isPalindrome("aabbaa"));
    }

    /**
     * Riceve una stringa s e verifica ricorsivamente se e' palindroma
     *
     * CASI BASE: s e' vuota o e' composta da un solo carattere
     *		s e' palindroma
     * PASSO INDUTTIVO: s e' composta da almeno due caratteri
     *		s e' palidroma se e solo se
     *			1) il primo e l'ultimo carattere sono uguali
     *			2) e' palindroma la sottostringa di s che parte dal secondo
     * 				carattere e si ferma al penultimo carattere
     */

    private static boolean isPalindrome(String s) {
        if (s.length() < 2)
            return true;
        if (s.charAt(0) == s.charAt(s.length() - 1))
            return isPalindrome(s.substring(1, s.length() - 1));
        else
            return false;
    }

}
