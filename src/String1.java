import javax.swing.*;

public class String1 {
    public static void main(String[] args) {
    String a = JOptionPane.showInputDialog("Text?");
    String b = reverse(a);
        System.out.println(b);
    }

    public static String reverse(String a)
    {
    String c = "";
    for(int i = a.length(); i>0; i--)
        {
        c = c + a.charAt(i-1);
        }
    return c;
    }
}