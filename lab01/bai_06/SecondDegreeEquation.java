//Example 6: Simple equations

import javax.swing.JOptionPane;

public class SecondDegreeEquation {
    public static void main(String[] args) {
        double a, b, c, x, x1, x2, D;
        String strNotification = "";

        a = Double.parseDouble(JOptionPane.showInputDialog(null, 
                "Please input a: ",
                "Duong Trung Kien 20215067 - ax^2 + bx + c = 0",
                JOptionPane.INFORMATION_MESSAGE));

        b = Double.parseDouble(JOptionPane.showInputDialog(null, 
                "Please input b: ",
                "Duong Trung Kien 20215067 - " + a + "x^2 + bx + c = 0",
                JOptionPane.INFORMATION_MESSAGE));

        c = Double.parseDouble(JOptionPane.showInputDialog(null, 
                "Please input c: ",
                "Duong Trung Kien 20215067 - " + a +"x^2 + "+ b + "x + c = 0",
                JOptionPane.INFORMATION_MESSAGE));

        D = b * b - 4 * a * c; // tính delta

        strNotification += "Solution for the equation :\n"; 
        strNotification += a + ".x^2 + "+ b + ".x + " + c + " = 0\n"; 
        strNotification += "Solution:\n"; 

        if (a == 0) {
            if (b == 0 ) {
                if (c == 0) {
                    // nếu a = 0, b = 0, c = 0 phương trình có vô số nghiệm
                    strNotification += "Infinite solutions";
                } else  {
                    // nếu a = 0, b = 0, c != 0 phương trình vô nghiệm
                    strNotification += "No solution";
                }
            } else {
                // nếu a = 0, b != 0, c != 0 phương trình có 1 nghiệm duy nhất x = -c/b
                x = -c / b;
                strNotification += "x = " + x;
            }
        } else {
            if (D < 0) {
                // nếu D < 0 phương trình vô nghiệm
                strNotification += "No solution";
            } else if (D == 0) {
                // nếu D == 0 phương trình có nghiệm duy nhất x = -b/2a;
                x = -b / (2 * a);
                strNotification += "x = " + x + "\n";
            } else {
                // nếu D > 0 phương trình có 2 nghiệm phân biệt
                // x1 = (b + sqrt(D)) / (2 * a)
                // x2 = (b - sqrt(D)) / (2 * a)
                x1 = (b + Math.sqrt(D)) / (2 * a);
                x2 = (b - Math.sqrt(D)) / (2 * a);
                strNotification += "x1 = " + x1 + "\n";
                strNotification += "x2 = " + x2 + "\n";
            }
        }
        
        JOptionPane.showMessageDialog(null, strNotification, "Duong Trung Kien 20215067 - Show solution", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    };
}