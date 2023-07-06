package org.example.solution;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class WarGameFrame extends JFrame {

    private JPanel contentPane;
    private JLabel firstArmyNameLabel;
    private JLabel secondArmyNameLabel;
    private JList firstArmyList;
    private JList secondArmyList;
    private JTextArea logTextArea;
    private Army firstArmy;
    private Army secondArmy;


    public WarGameFrame(Army firstArmy, Army secondArmy) {
        init();
        this.firstArmy = firstArmy;
        this.secondArmy = secondArmy;
        refreshArmy();
    }

    public void showWinnerPopup(String armyName) {

        JOptionPane.showMessageDialog(this, "The winner is: " + armyName);

    }


    public void refreshArmy() {
        initArmy(firstArmy, firstArmyNameLabel, firstArmyList);
        initArmy(secondArmy, secondArmyNameLabel, secondArmyList);
    }


    private void initArmy(Army army, JLabel armyName, JList armyWarriorList) {

        armyName.setText(army.getName());

        DefaultListModel<String> warriors = new DefaultListModel<String>();

        for (Warrior warrior : army.getWarriors()) {
            warriors.addElement(warrior.getName());
        }

        armyWarriorList.setModel(warriors);

    }

    public void log(String msg) {

        var text = logTextArea.getText();
        text += msg + "\n";
        logTextArea.setText(text);

    }

    private void init() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        GridBagLayout gbl_contentPane = new GridBagLayout();
        gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
        gbl_contentPane.rowHeights = new int[]{0, 0, 0};
        gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
        gbl_contentPane.rowWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
        contentPane.setLayout(gbl_contentPane);

        JPanel panel = new JPanel();
        GridBagConstraints gbc_panel = new GridBagConstraints();
        gbc_panel.insets = new Insets(0, 0, 5, 5);
        gbc_panel.fill = GridBagConstraints.BOTH;
        gbc_panel.gridx = 0;
        gbc_panel.gridy = 0;
        contentPane.add(panel, gbc_panel);
        GridBagLayout gbl_panel = new GridBagLayout();
        gbl_panel.columnWidths = new int[]{0, 0};
        gbl_panel.rowHeights = new int[]{0, 0, 0};
        gbl_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panel.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
        panel.setLayout(gbl_panel);

        firstArmyNameLabel = new JLabel("armyName");
        GridBagConstraints gbc_firstArmyNameLabel = new GridBagConstraints();
        gbc_firstArmyNameLabel.insets = new Insets(0, 0, 5, 0);
        gbc_firstArmyNameLabel.gridx = 0;
        gbc_firstArmyNameLabel.gridy = 0;
        panel.add(firstArmyNameLabel, gbc_firstArmyNameLabel);

        JScrollPane scrollPane = new JScrollPane();
        GridBagConstraints gbc_scrollPane = new GridBagConstraints();
        gbc_scrollPane.fill = GridBagConstraints.BOTH;
        gbc_scrollPane.gridx = 0;
        gbc_scrollPane.gridy = 1;
        panel.add(scrollPane, gbc_scrollPane);

        firstArmyList = new JList();
        scrollPane.setViewportView(firstArmyList);
        firstArmyList.setModel(new AbstractListModel() {
            String[] values = new String[]{"WarriorName", "WarriorName", "WarriorName", "WarriorName", "WarriorName",
                    "WarriorName", "WarriorName", "WarriorName", "WarriorName", "WarriorName", "WarriorName",
                    "WarriorName", "WarriorName", "WarriorName", "WarriorName", "WarriorName", "WarriorName",
                    "WarriorName", "WarriorName", "WarriorName", "WarriorName", "WarriorName", "WarriorName",
                    "WarriorName", "WarriorName", "WarriorName", "WarriorName", "WarriorName", "WarriorName",
                    "WarriorName", "WarriorName", "WarriorName", "WarriorName", "WarriorName", "WarriorName",
                    "WarriorName", "WarriorName", "WarriorName", "WarriorName", "WarriorName"};

            public int getSize() {
                return values.length;
            }

            public Object getElementAt(int index) {
                return values[index];
            }
        });

        JPanel panel_1 = new JPanel();
        GridBagConstraints gbc_panel_1 = new GridBagConstraints();
        gbc_panel_1.insets = new Insets(0, 0, 5, 5);
        gbc_panel_1.fill = GridBagConstraints.BOTH;
        gbc_panel_1.gridx = 1;
        gbc_panel_1.gridy = 0;
        contentPane.add(panel_1, gbc_panel_1);
        GridBagLayout gbl_panel_1 = new GridBagLayout();
        gbl_panel_1.columnWidths = new int[]{0, 0};
        gbl_panel_1.rowHeights = new int[]{0, 0};
        gbl_panel_1.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panel_1.rowWeights = new double[]{1.0, Double.MIN_VALUE};
        panel_1.setLayout(gbl_panel_1);

        JScrollPane scrollPane_2 = new JScrollPane();
        GridBagConstraints gbc_scrollPane_2 = new GridBagConstraints();
        gbc_scrollPane_2.fill = GridBagConstraints.BOTH;
        gbc_scrollPane_2.gridx = 0;
        gbc_scrollPane_2.gridy = 0;
        panel_1.add(scrollPane_2, gbc_scrollPane_2);

        logTextArea = new JTextArea();
        logTextArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        scrollPane_2.setViewportView(logTextArea);

        JPanel panel_2 = new JPanel();
        GridBagConstraints gbc_panel_2 = new GridBagConstraints();
        gbc_panel_2.insets = new Insets(0, 0, 5, 0);
        gbc_panel_2.fill = GridBagConstraints.BOTH;
        gbc_panel_2.gridx = 2;
        gbc_panel_2.gridy = 0;
        contentPane.add(panel_2, gbc_panel_2);
        GridBagLayout gbl_panel_2 = new GridBagLayout();
        gbl_panel_2.columnWidths = new int[]{0, 0};
        gbl_panel_2.rowHeights = new int[]{0, 0, 0};
        gbl_panel_2.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panel_2.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
        panel_2.setLayout(gbl_panel_2);

        secondArmyNameLabel = new JLabel("armyName2");
        GridBagConstraints gbc_secondArmyNameLabel = new GridBagConstraints();
        gbc_secondArmyNameLabel.insets = new Insets(0, 0, 5, 0);
        gbc_secondArmyNameLabel.gridx = 0;
        gbc_secondArmyNameLabel.gridy = 0;
        panel_2.add(secondArmyNameLabel, gbc_secondArmyNameLabel);

        JScrollPane scrollPane_1 = new JScrollPane();
        GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
        gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
        gbc_scrollPane_1.gridx = 0;
        gbc_scrollPane_1.gridy = 1;
        panel_2.add(scrollPane_1, gbc_scrollPane_1);

        secondArmyList = new JList();
        scrollPane_1.setViewportView(secondArmyList);
        secondArmyList.setModel(new AbstractListModel() {
            String[] values = new String[]{"WarriorName", "WarriorName", "WarriorName", "WarriorName", "WarriorName",
                    "WarriorName", "WarriorName", "WarriorName", "WarriorName", "WarriorName", "WarriorName",
                    "WarriorName", "WarriorName", "WarriorName", "WarriorName", "WarriorName", "WarriorName",
                    "WarriorName", "WarriorName", "WarriorName", "WarriorName", "WarriorName", "WarriorName",
                    "WarriorName", "WarriorName", "WarriorName", "WarriorName", "WarriorName", "WarriorName",
                    "WarriorName", "WarriorName", "WarriorName", "WarriorName", "WarriorName", "WarriorName",
                    "WarriorName", "WarriorName", "WarriorName", "WarriorName", "WarriorName"};

            public int getSize() {
                return values.length;
            }

            public Object getElementAt(int index) {
                return values[index];
            }
        });

        JPanel panel_3 = new JPanel();
        GridBagConstraints gbc_panel_3 = new GridBagConstraints();
        gbc_panel_3.anchor = GridBagConstraints.EAST;
        gbc_panel_3.gridwidth = 3;
        gbc_panel_3.insets = new Insets(0, 0, 0, 5);
        gbc_panel_3.gridx = 0;
        gbc_panel_3.gridy = 1;
        contentPane.add(panel_3, gbc_panel_3);

        JButton btnNewButton = new JButton("Ok");
        panel_3.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("Cancel");
        panel_3.add(btnNewButton_1);
    }
}
