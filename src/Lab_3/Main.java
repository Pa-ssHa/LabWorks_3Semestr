package Lab_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Приложение");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 300);

            JPanel panel = new JPanel(new GridLayout(3, 1));

            JLabel label_1 = new JLabel("текст: ");
            JLabel label_2 = new JLabel("закрытый текст: ");
            JTextField textField = new JTextField();
            JPasswordField passwordField = new JPasswordField();
            JCheckBox checkBox = new JCheckBox("Скрыть текст");
            JButton button = new JButton("Вывести текст");

            panel.add(label_1);
            panel.add(textField);
            panel.add(label_2);
            panel.add(passwordField);
            panel.add(checkBox);
            panel.add(button);

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.print("ведите текст: ");
                    String inText = scan.nextLine();
                    if (checkBox.isSelected()) {
                        passwordField.setText(inText);
                        textField.setText("");
                    } else {
                        textField.setText(inText);
                        passwordField.setText("");
                    }
                }
            });

            frame.getContentPane().add(panel);
            frame.setVisible(true);
        });
    }
}
//String inputText = textField.getText();
//textField.setText(inText);

