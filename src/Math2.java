import javax.swing.*;

public class Math2 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Hur många tal vill du kolla?"));
        System.out.println(PrimTal(n));
    }
    public static String PrimTal(int n) {
        String prim = "";
        int b = 0;
        for(int i = 0; i<n; i++) {
            for (int a = 0; a < i; a++) {
                b = a / i;
                for (int c = 1; c < a; c++){
                    if (b == c && c != i && c != 1) {
                        prim = prim + b + ", ";
                    }
                }
            }
        }
        return prim;
    }
}
