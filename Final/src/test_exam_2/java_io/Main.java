package test_exam_2.java_io;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        PeopleReader.readPeoplesFromCsv(new File("W:\\Webler\\JuniorJava\\Git\\java\\Final\\src\\test_exam_2\\java_io\\people.csv"));

    }
}
