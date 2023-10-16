//Example 6: Simple equations

import javax.swing.JOptionPane;

public class FirstDegreeEquation {
    public static void main(String[] args) {
        double a, b, x;
        String strNotification = "";

        a = Double.parseDouble(JOptionPane.showInputDialog(null, 
                "Please input a: ",
                "ax + b = 0",
                JOptionPane.INFORMATION_MESSAGE));

        b = Double.parseDouble(JOptionPane.showInputDialog(null, 
                "Please input b: ",
                "ax + b = 0",
                JOptionPane.INFORMATION_MESSAGE));

        strNotification += "Solution of the equation : "+a+"x + "+b+" = 0\n"; 
        strNotification += "Solution:\n"; 

        if (a == 0 ) {
            if (b == 0) {
                //nếu a = 0 b = 0 thì có vô số nghiệm
                strNotification += "Infinite solutions";
            } else  {
                //nếu a = 0 thì vô nghiệm
                strNotification += "No solution";
            }
        } else {
            // nếu a khác 0 thì có nghiệm duy nhất là x=-b/a
            x = -b / a;
            strNotification += "x = " + x;
        }

        JOptionPane.showMessageDialog(null, 
            strNotification, 
            "Show solution", 
            JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}