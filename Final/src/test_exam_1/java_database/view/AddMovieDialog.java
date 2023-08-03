package test_exam_1.java_database.view;

import test_exam_1.java_database.model.MovieDao;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddMovieDialog extends JDialog {

    private final JPanel contentPanel = new JPanel();
    private JTextField movieNameField;
    private JTextField imdbScoreField;
    private JTextField categoryIdField;
    private final Imdb imdb;

    private MovieDao getFieldsAsMovie() {

        try {
            String movieName = movieNameField.getText();
            double imdbScore = Double.parseDouble(imdbScoreField.getText());
            int categoryId = Integer.parseInt(categoryIdField.getText());

            return new MovieDao(movieName, imdbScore, categoryId);
        } catch (Exception e) {
            System.out.println("Not valid input!");
        }

        return null;

    }

    public AddMovieDialog(Imdb imdb) {
        this.imdb = imdb;
        setBounds(100, 100, 450, 300);
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(contentPanel, BorderLayout.CENTER);
        GridBagLayout gbl_contentPanel = new GridBagLayout();
        gbl_contentPanel.columnWidths = new int[]{0, 0, 0};
        gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0};
        gbl_contentPanel.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
        gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
        contentPanel.setLayout(gbl_contentPanel);
        {
            JLabel lblNewLabel = new JLabel("Movie name");
            GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
            gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
            gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
            gbc_lblNewLabel.gridx = 0;
            gbc_lblNewLabel.gridy = 0;
            contentPanel.add(lblNewLabel, gbc_lblNewLabel);
        }
        {
            movieNameField = new JTextField();
            GridBagConstraints gbc_movieNameField = new GridBagConstraints();
            gbc_movieNameField.insets = new Insets(0, 0, 5, 0);
            gbc_movieNameField.fill = GridBagConstraints.HORIZONTAL;
            gbc_movieNameField.gridx = 1;
            gbc_movieNameField.gridy = 0;
            contentPanel.add(movieNameField, gbc_movieNameField);
            movieNameField.setColumns(10);
        }
        {
            JLabel lblNewLabel_1 = new JLabel("Imdb score");
            GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
            gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
            gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
            gbc_lblNewLabel_1.gridx = 0;
            gbc_lblNewLabel_1.gridy = 1;
            contentPanel.add(lblNewLabel_1, gbc_lblNewLabel_1);
        }
        {
            imdbScoreField = new JTextField();
            GridBagConstraints gbc_imdbScoreField = new GridBagConstraints();
            gbc_imdbScoreField.insets = new Insets(0, 0, 5, 0);
            gbc_imdbScoreField.fill = GridBagConstraints.HORIZONTAL;
            gbc_imdbScoreField.gridx = 1;
            gbc_imdbScoreField.gridy = 1;
            contentPanel.add(imdbScoreField, gbc_imdbScoreField);
            imdbScoreField.setColumns(10);
        }
        {
            JLabel lblNewLabel_2 = new JLabel("Category id");
            GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
            gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
            gbc_lblNewLabel_2.insets = new Insets(0, 0, 0, 5);
            gbc_lblNewLabel_2.gridx = 0;
            gbc_lblNewLabel_2.gridy = 2;
            contentPanel.add(lblNewLabel_2, gbc_lblNewLabel_2);
        }
        {
            categoryIdField = new JTextField();
            GridBagConstraints gbc_categoryIdField = new GridBagConstraints();
            gbc_categoryIdField.fill = GridBagConstraints.HORIZONTAL;
            gbc_categoryIdField.gridx = 1;
            gbc_categoryIdField.gridy = 2;
            contentPanel.add(categoryIdField, gbc_categoryIdField);
            categoryIdField.setColumns(10);
        }
        {
            JPanel buttonPane = new JPanel();
            buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
            getContentPane().add(buttonPane, BorderLayout.SOUTH);
            {
                JButton okButton = new JButton("OK");
                okButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        onOkButtonPressed();
                    }
                });
                okButton.setActionCommand("OK");
                buttonPane.add(okButton);
                getRootPane().setDefaultButton(okButton);
            }
            {
                JButton cancelButton = new JButton("Cancel");
                cancelButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        onCancelButtonPressed();
                    }
                });
                cancelButton.setActionCommand("Cancel");
                buttonPane.add(cancelButton);
            }
        }
    }

    private void onCancelButtonPressed() {
        setVisible(false);
        dispose();
    }

    private void onOkButtonPressed() {
        imdb.addMovie(getFieldsAsMovie());
        setVisible(false);
        dispose();
    }

}
