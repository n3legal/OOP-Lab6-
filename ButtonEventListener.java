import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Closeable;
import java.lang.String;

public class ButtonEventListener implements ActionListener {
    public static int i = 0;
    private int res = 0;
    private int in = 0;
    private JTextField input = new JTextField();

    public ButtonEventListener(int res, JTextField text){
        this.res = res;
        this.input = text;
    }

    public void actionPerformed (ActionEvent e){
        i++;

        this.in = stringToInt(this.input.getText(), in);
        String str_1;
        if (i <= 3){
            str_1 = String.valueOf(i) + " попытка: " +  "\n";
            if (in < res){
                str_1 += "Число меньше заданного " + String.valueOf(res);
                JOptionPane.showMessageDialog(null, str_1, "Output", JOptionPane.PLAIN_MESSAGE);
            } else if (in > res){
                str_1 += "Число больше заданного" + String.valueOf(res);
                JOptionPane.showMessageDialog(null, str_1, "Output", JOptionPane.PLAIN_MESSAGE);
            } else {
                str_1 += "Вы выйграли";
                JOptionPane.showMessageDialog(null, str_1, "Output", JOptionPane.PLAIN_MESSAGE);
                System.exit(1);
            }

        } else {
            str_1 = "Вы проиграли (использовали больше 3-х попыток)";
            JOptionPane.showMessageDialog(null, str_1, "Output", JOptionPane.PLAIN_MESSAGE);
            System.exit(1);

        }
    }
    public int stringToInt(String val, int defaultVal) {
        try {
            return Integer.parseInt(val);
        } catch (NumberFormatException e) {
            return defaultVal;
        }
    }
}
