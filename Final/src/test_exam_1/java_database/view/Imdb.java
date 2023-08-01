package test_exam_1.java_database.view;

import test_exam_1.java_database.controller.ImdbController;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Imdb extends JFrame {

    private JPanel contentPane;


    public Imdb(ImdbController controller) {
        this.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);

        JButton listMovies = new JButton("List Movies");
        listMovies.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controller.listMovies();
            }
        });
        contentPane.add(listMovies);

        JButton listCategories = new JButton("List Categories");
        listCategories.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controller.listCategories();
            }
        });
        contentPane.add(listCategories);

        JButton movieAddButton = new JButton("Add new movie");
        movieAddButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //TODO
                controller.addMovie(null);
            }
        });
        contentPane.add(movieAddButton);
    }

}

