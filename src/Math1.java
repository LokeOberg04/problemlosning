import javax.swing.*;

public class Math1 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Vilket tal är N?"));
        JOptionPane.showMessageDialog(null, "Summan av alla tal är " + SummaN(n));
    }
    public static int SummaN(int n) {
        int s = 0;
        for(int i = n; i>0; i--)
            s = s + i;
        return s;
    }
}
