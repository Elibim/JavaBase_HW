package ua.lits.java_base.hw8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {

        Pattern patternEmail = Pattern.compile("([a-zA-Z0-9_.-]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9-.]+)");
        Matcher matcherEmail = patternEmail.matcher("rfhnzlkv elibielska@gmail.com here.dgsg eLi.bielska@gmail.com\n" +
                "eli3.bielska@gmail.com eLi3.bielska3567@gmail.com eLi.bielskay7657@gmail.com 84jiwruj9");
        while (matcherEmail.find()) {
        System.out.println(matcherEmail.group());
        }

        Pattern patternUaMobile = Pattern.compile("(\\+[3][8]\\s[0]\\d\\d\\s\\d\\d\\d\\s\\d\\d\\s\\d\\d)");
        Matcher matcherUaMobile = patternUaMobile.matcher("kdzjhg;n kjf856b +38 067 676 62 98 iug8 er678 6676544 ");
        while (matcherUaMobile.find()) {
            System.out.println(matcherUaMobile.group());
        }
    }
}
