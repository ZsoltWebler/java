package org.webler.zsolt;

import java.util.*;

public class StringDemo {

    /**
     * https://docs.oracle.com/javase/8/docs/api/java/util/Formatter.html
     */
    public static void stringDemo() {
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
    public static boolean isPalindrome(String s1) {


        return s1.equals(reverse(s1));
    }

    /*
     * Térjen vissza a megfordított Stringgel
     * */
    public static String reverse(String s) {

        return new StringBuilder(s).reverse().toString();
    }

    /*
     * Térjen vissza a substring előfordulási számával az s Stringben.
     * */
    public static int occurences(String s, String substring) {


        int occurrenceIndex = 0;
        int occurrences = 0;
        while (occurrenceIndex != -1) {

            int possibleOccurence = s.indexOf(substring, occurrenceIndex);
            if (possibleOccurence != -1) {
                occurrences++;
                occurrenceIndex = possibleOccurence + 1;
            } else {
                break;
            }

        }
        return occurrences;
    }

    /*
     * Térjen vissza a leghosszabb prefixxel, ami illeszkedik az összes listában lévő stringre.
     * */
    public static String longestCommonPrefix(List<String> stringList) {

        String prefix = "";
        if (stringList.size() > 0) {
            prefix = stringList.get(0);
            for (int i = 1; i < stringList.size(); i++) {
                while (stringList.get(i).indexOf(prefix) != 0) {
                    prefix = prefix.substring(0, prefix.length() - 1);
                }
            }
        }
        return prefix;
    }

    public static String longestCommonPrefix2(List<String> stringList) {

        for (var s : stringList) {
            if (s.isBlank()) {
                return "";
            }
        }

        var prefixIndex = 0;
        while (true) {

            var prefix = stringList.get(0).substring(0, prefixIndex);
            for (var s : stringList) {

                if (!s.startsWith(prefix)) {
                    return prefix.substring(0, prefix.length() - 1);
                }

            }
            prefixIndex++;


        }

    }

    /*
     * Nézze meg, hogy a két string izomorf-e.
     * Két string izomorf, ha a betűk az egyikből leképezhetőek a másikba.
     * példa:
     *  aab és xxy, a két string izomorf, a leképezés a->x és b->y
     *  aab ás xyy, a két string nem izomorf, mert nincs olyan leképezés, ami egyenlővé tenné a két stringet.
     * */
    public static boolean isIsomorphic(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        Set<List<Integer>> positionsForS1 = getPositionsForIsIsomorphic(s1);
        Set<List<Integer>> positionsForS2 = getPositionsForIsIsomorphic(s2);

        return positionsForS1.equals(positionsForS2);
    }

    private static Set<List<Integer>> getPositionsForIsIsomorphic(String s) {
        Map<Character, List<Integer>> positionsByCharacter = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char next = s.charAt(i);
            positionsByCharacter
                    .computeIfAbsent(next, k -> new ArrayList<>())
                    .add(i);
        }
        return new HashSet<>(positionsByCharacter.values());
    }

    public static boolean isIsomorphic2(String s1, String s2) {

        if (s1 == null || s2 == null || s1.length() != s2.length()) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {

            char char_str1 = s1.charAt(i);
            char char_str2 = s2.charAt(i);

            if (map.containsKey(char_str1)) {
                if (map.get(char_str1) != char_str2)
                    return false;
            } else {
                if (map.containsValue(char_str2))
                    return false;
                map.put(char_str1, char_str2);
            }
        }
        return true;
    }

    public static boolean isIsomorphic3(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        int length = s1.length();
        int[] map1 = new int[256];
        int[] map2 = new int[256];
        for (int i = 0; i < length; i++) {
            char char1 = s1.charAt(i);
            char char2 = s2.charAt(i);
            if (map1[char1] != map2[char2]) {
                return false;
            }
            if (map1[char1] == 0) {
                map1[char1] = i + 1;
                map2[char2] = i + 1;
            }
        }
        return true;
    }

    /*
     *
     * aab és xxy, TRUE
     * aab ás xyy, FALSE
     * */
    public static boolean isIsomorphic4(String s1, String s2) {


        Set<Character> replacedChars = new HashSet<>();
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {

            if (s1.charAt(i) != s2.charAt(i)) {
                if (replacedChars.contains(s2.charAt(i))) {
                    return false;
                }
                replacedChars.add(s2.charAt(i));
                s1 = s1.replace(s1.charAt(i), s2.charAt(i));

            }

        }

        return s1.equals(s2);

    }


    /*
     * Nézze meg, hogy a két string egymás annagrammája-e.
     * A betúk átrendezésével az egyik szóból a másikat kapjuk.
     * élet -> étel
     * */
    public static boolean isAnagram(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }
        return Arrays.equals(s1.chars().sorted().toArray(), s2.chars().sorted().toArray());
    }

    /*
     * Valósítsátok meg a Caesar kódolást.
     * Elég az angol abc betűrire
     * https://hu.wikipedia.org/wiki/Caesar-rejtjel#:~:text=b%C3%A1r%20rendk%C3%ADv%C3%BCl%20neh%C3%A9z.-,Caesar,-k%C3%B3dol%C3%A1s%20megval%C3%B3s%C3%ADt%C3%A1sa%5B
     * */
    public static String caesarCode(String message, int offset) {

        String newMessage = "";
        for (int i = 0; i < message.length(); i++) {
            int char_message = (int) message.charAt(i) + offset;
            newMessage += (char) char_message;
            //charList.add(char_message);
        }
        return newMessage;
    }

    public static String caesarCode2(String message, int offset) {

        char[] chars = message.toUpperCase().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i])) {
                chars[i] = (char) ((chars[i] - 'A' + offset) % 26 + 'A');
            }
        }
        return new String(chars);
    }

}
