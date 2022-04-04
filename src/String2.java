import java.util.Scanner;

import static java.lang.Character.toUpperCase;

public class String2 {
    public static void main(String[] args) {
        System.out.println("vilket ord vill du fixa?");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String b = camelCase(s);
        System.out.println("Din nya text blev " + b);
    }
    public static String camelCase(String s)
    {
        String b = "";
        for(int i = 0; i<s.length(); i++)
        {
            if (s.charAt(i) == ' ') {
                b = b + toUpperCase(s.charAt(i+1));
                i++;
            }
            else {
                b = b + s.charAt(i);
            }
        }
        return b;
    }
}
