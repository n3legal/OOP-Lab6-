import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window extends JFrame {

    private JButton button = new JButton("Ввод");
    private JTextField input = new JTextField("", 5);
    private JLabel label = new JLabel("Введите число от 0 до 20: ");
    private int result = 0 + (int)(Math.random() * 20);

    public Window() {
        super("Угадайка");
        this.setBounds(300,300,300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 1, 2, 2));
        container.add(label);
        container.add(input);

        button.addActionListener(new ButtonEventListener (result, input));
        container.add(button);
    }


}
