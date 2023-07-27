package test_exam_1.java_database;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:postgresql://localhost/imdb?user=postgres&password=admin";
        Connection conn = DriverManager.getConnection(url);

        try (Statement stmt = conn.createStatement()) {
            String selectSql = "SELECT * FROM movie";
            try (ResultSet resultSet = stmt.executeQuery(selectSql)) {

                while (resultSet.next()) {
                    int id = resultSet.getInt("movie_id");
                    String name = resultSet.getString("movie_name");
                    float score = resultSet.getFloat("movie_imdb_score");
                    int category_id = resultSet.getInt("movie_category_id");


                    System.out.println(id + " " + name + " " + score + " " + category_id);
                }


            }
        }

    }
}
