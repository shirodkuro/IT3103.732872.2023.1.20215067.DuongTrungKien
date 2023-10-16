//Example 6: Simple equations

import javax.swing.JOptionPane;

public class SystemOfEquations {
    public static void main(String[] args) {
        double a11, a12, a21, a22, b1, b2, D, D1, D2, x1, x2;
        String strNotification = "";

        a11 = Double.parseDouble(JOptionPane.showInputDialog(null, 
                "Please input a11: ",
                "a11.x1 + a12.x2 = b1",
                JOptionPane.INFORMATION_MESSAGE));

        a12 = Double.parseDouble(JOptionPane.showInputDialog(null, 
                "Please input a12: ",
                a11+".x1 + a12.x2 = b1",
                JOptionPane.INFORMATION_MESSAGE));

        b1 = Double.parseDouble(JOptionPane.showInputDialog(null, 
                "Please input b1: ",
                a11+".x1 + "+a12+".x2 = b1",
                JOptionPane.INFORMATION_MESSAGE));

        a21 = Double.parseDouble(JOptionPane.showInputDialog(null, 
                "Please input a21: ",
                "a21.x1 + a22.x2 = b2",
                JOptionPane.INFORMATION_MESSAGE));

        a22 = Double.parseDouble(JOptionPane.showInputDialog(null, 
                "Please input a22: ",
                a21+".x1 + a22.x2 = b2",
                JOptionPane.INFORMATION_MESSAGE));

        b2 = Double.parseDouble(JOptionPane.showInputDialog(null, 
                "Please input b2: ",
                a21+".x1 + "+a22+".x2 = b2",
                JOptionPane.INFORMATION_MESSAGE));

        D = a11 * a22 - a21 * a12;
        D1 = b1 * a22 - b2 * a12;
        D2 = a11 * b2 - a21 * b1;

        strNotification += "Solutions of the system of equations:\n"; 
        strNotification += a11+".x1 + "+a12+".x2 = "+b1+"\n"; 
        strNotification += a21+".x1 + "+a22+".x2 = "+b2+"\n"; 
        strNotification += "are:\n"; 

        if (D == 0 ) {
            if (D1 == D2) {
                // nếu D = 0, D1 = D2 thì hệ phương trình có vô số nghiệm
                strNotification += "Infinite solutions";
            } else  {
                // nếu D = 0, D1 != D2 thì hệ phương trình vô nghiệm
                strNotification += "No solution";
            }
        } else {
            // nếu D != 0 thì hệ phương trình có nghiệm duy nhất x1 = D1/D, x2 = D2/D
            x1 = D1 / D;
            x2 = D2 / D;
            strNotification += "x1 = " + x1 + "\n";
            strNotification += "x2 = " + x2 + "\n";
        }

        JOptionPane.showMessageDialog(null, 
            strNotification, 
            "Show solution", 
            JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

}