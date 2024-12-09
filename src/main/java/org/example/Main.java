package org.example;import javax.swing.*;
import java.awt.*;import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Калькулятор");
        JLabel label = new JLabel("Введите число, для вычесления курса доллара");
JTextArea textArea = new JTextArea("");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(400,400));
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().add(textArea);
        frame.getContentPane().add(label);
        label.setBounds(20, 30, 300, 15);
        textArea.setBounds(20, 50, 200, 15);

        JButton button = new JButton("подтвердить");
        frame.getContentPane().add(button);
        button.setBounds(20, 70, 200,15);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double x = Double.parseDouble(textArea.getText());
                double y = x / 99.38;
                double z = x / 105.1;
                JLabel dollar = new JLabel();
                JLabel euro = new JLabel();
                frame.getContentPane().add(dollar);
                frame.getContentPane().add(euro);

                dollar.setText("доллар: " + y);
                euro.setText("евро: " + z);
                dollar.setBounds(20, 90, 100, 150);
                euro.setBounds(20, 110, 100, 150);

            }
        });


    }
}