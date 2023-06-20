package org.webler.zsolt;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class StringDemo {

    /**
     * https://docs.oracle.com/javase/8/docs/api/java/util/Formatter.html
     */
    public static void stringDemo(){
        String greetings = String.format("Hello %s !", "World");
        System.out.println(greetings);

        /**
         *  %[argument_index$][flags][width][.precision]conversion
         */

        String greetings_2 = String.format("%2$s %1$s !", "World", "Hello");
        System.out.println(greetings_2);

        Calendar c = new GregorianCalendar(2017, 11, 10);
        String formattedDate = String.format("The date is: %1$tm %1$te,%1$tY", c);
        System.out.println(formattedDate);


        String s = String.format("The correct answer is %s", false);
        System.out.println(s);
        s = String.format("The correct answer is %b", null);
        System.out.println(s);
        s = String.format("The correct answer is %B", true);
        System.out.println(s);
        s = String.format("The correct answer is %c", 'a');
        System.out.println(s);
        s = String.format("The correct answer is %c", null);
        System.out.println(s);
        s = String.format("The correct answer is %C", 'b');
        System.out.println(s);
        s = String.format("The valid unicode character: %c", 0x0400);
        System.out.println(s);

        s = String.format("The number 25 in decimal = %d", 25);
        System.out.println(s);
        s = String.format("The number 25 in octal = %o", 25);
        System.out.println(s);
        s = String.format("The number 25 in hexadecimal = %x", 25);
        System.out.println(s);
        s = String.format("The computerized scientific format of 10000.00 " + "= %e", 10000.00);
        System.out.println(s);
        s = String.format("The decimal format of 10.019 = %f", 10.019);
        System.out.println(s);
        s = String.format("First Line %nSecond Line");
        System.out.println(s);
        s = String.format("Without left justified flag: %5d", 25);
        System.out.println(s);
        s = String.format("With left justified flag: %-5d", 25);
        System.out.println(s);

        s = String.format("Output of 25.09878 with Precision 2: %.2f", 25.09878);
        System.out.println(s);
        s = String.format("Output of general conversion type with Precision 2: %.2b", true);
        System.out.println(s);
    }


    /*
    * Térjen vissza igazzal, ha a String palindróm. (Előről és hátulról olvasva is ugyan az)
    * */
    public static boolean isPalindrome(String s1, String s2){


        return false;
    }

    /*
    * Térjen vissza a megfordított Stringgel
    * */
    public static String reverse(String s){
        return null;
    }

    /*
    * Térjen vissza a substring előfordulási számával az s Stringben.
    * */
    public static int occurences(String s, String substring){

        return 0;
    }

    /*
     * Térjen vissza a leghosszabb prefixxel, ami illeszkedik az összes listában lévő stringre.
     * */
    public static String longestCommonPrefix(List<String> stringList){

        return "";
    }

    /*
     * Nézze meg, hogy a két string izomorf-e.
     * Két string izomorf, ha a betűk az egyikből leképezhetőek a másikba.
     * példa:
     *  aab és xxy, a két string izomorf, a leképezés a->x és b->y
     *  aab ás xyy, a két string nem izomorf, mert nincs olyan leképezés, ami egyenlővé tenné a két stringet.
     * */
    public static boolean isIsomorphic(String s1, String s2){

        return false;
    }

    /*
     * Nézze meg, hogy a két string egymás annagrammája-e.
     * A betúk átrendezésével az egyik szóból a másikat kapjuk.
     * élet -> étel
     * */
    public static boolean isAnagram(String s1, String s2){

        return false;
    }

    /*
    * Valósítsátok meg a Caesar kódolást.
    * Elég az angol abc betűrire
    * https://hu.wikipedia.org/wiki/Caesar-rejtjel#:~:text=b%C3%A1r%20rendk%C3%ADv%C3%BCl%20neh%C3%A9z.-,Caesar,-k%C3%B3dol%C3%A1s%20megval%C3%B3s%C3%ADt%C3%A1sa%5B
    * */
    public static String caesarCode(String message, int offset){

        return "";
    }

}
