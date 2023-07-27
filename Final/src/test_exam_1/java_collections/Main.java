package test_exam_1.java_collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {


        Scanner sc = new Scanner(new File("W:\\Webler\\JuniorJava\\Git\\java\\Final\\src\\test_exam_1\\java_collections\\kerdesek.txt"));
        List<Question> questions = new ArrayList<>();

        LocalDate orderDate = null;
        while (sc.hasNext()) {

            String question = sc.nextLine();
            String details = sc.nextLine();

            questions.add(createQuestion(question,details));
        }

        QuizManager manager = new QuizManager(questions);

        System.out.println(manager.getQuestionsByGenre("tortenelem"));
        System.out.println(manager.getQuestionsByGenre("hadi ipar"));
        manager.getQuestionGroupedByGenre();

        System.out.println(manager.randomQuestions(10));
        System.out.println(manager.genreWithMaxScore());
        System.out.println();

    }

    private static Question createQuestion(String question, String questionDetails) {

        String[] details = questionDetails.split(" ");

        return new Question(question,details[0],Integer.parseInt(details[1]),details[2]);


    }
}
