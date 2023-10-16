//Example 5: Calculate.java

import javax.swing.JOptionPane;

public class Calculate {
    public static void main(String[] args) {
        String strNum1, strNum2;
        String strNotification = "The two numbers ";

        
        strNum1 = JOptionPane.showInputDialog(null,
            "Please input the first number: ",
            "First number",
            JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum1 + " and ";

        strNum2 = JOptionPane.showInputDialog(null,
            "Please input the next number: ",
            "Next number", 
            JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum2;

        double num1 = Double.parseDouble(strNum1); //đổi hai số sang double
        double num2 = Double.parseDouble(strNum2);
        double sum = num1 + num2;              // tính tổng hai số
        double dif = num1 - num2;              // tính hiệu hai số
        double quoti = num1 / num2;            // tính thương hai số
        double prod = num1 * num2;              // tính tích hai số
        
        JOptionPane.showMessageDialog(null,
            strNotification + " has the sum: " + sum + ", difference: " + dif + ", product: " + prod + " and quotient: " + quoti ,
            "Calculations with the two numbers",
            JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }       
}    