package org.example.solution;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.ZonedDateTime;

public class Logger {


    public static void log(String message) throws IOException {

        PrintWriter writer = new PrintWriter(new FileWriter("log.txt",true));

        ZonedDateTime now = ZonedDateTime.now();
        int timeStamp = now.toLocalTime().getNano();

        String logMsg = "[" + timeStamp + "]" + message;

        writer.println(logMsg);
        writer.close();


    }

}
