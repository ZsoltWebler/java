package test_exam_1.java_basics;

public class NamingConventionConverter {


    public static String toSnakeCase(String sentence, boolean toUppercase) {

        String[] words = sentence.split(" ");

        StringBuilder snakeCase = new StringBuilder();
        for (String word : words) {
            snakeCase.append(toUppercase ? (word.toUpperCase()) : word);
            snakeCase.append("_");
        }
        return snakeCase.toString();

    }
    public static String toKebabCase(String sentence){
        //TODO
        return sentence;
    }

    public static String toCamelCase(String sentence){
        //TODO
        return sentence;
    }

    public static String toPascalCase(String sentence){
        //TODO
        return sentence;
    }




}
