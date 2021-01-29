package ua.lits.java_base.hw4_Calculator.hwReconstructionHw3;

public class AIsPalindrome {

    public boolean isPalindrome(String word) {
        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            char c = word.charAt(i);
//            System.out.println("char at " + i + " index is: " + c);
            reverse += c;
//            System.out.println(reverse);
            //System.out.println(i.length);
        }
//        System.out.println(reverse);
//        System.out.println(word);
        return reverse.equals(word);
    }



}
