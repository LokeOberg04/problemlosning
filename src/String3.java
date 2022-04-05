import javax.swing.*;

public class String3 {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("kolla om text är palindrom");
        if (ispalindrom(s) == 1) {
            JOptionPane.showMessageDialog(null,"ja det är en palindrom");
        }
        else {
            JOptionPane.showMessageDialog(null,"nej det är inte en palindrom");
        }
    }
    public static int ispalindrom(String s) {
        int a;
        if (s.equals(String1.reverse(s))) {
            a = 1;
        }
        else{
            a = 0;
        }
        return a;
    }
}
