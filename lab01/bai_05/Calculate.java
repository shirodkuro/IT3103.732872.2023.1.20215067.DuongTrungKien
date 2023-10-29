//Example 5: Calculate.java

import javax.swing.JOptionPane;

public class Calculate {
    public static void main(String[] args) {
        String strNum1, strNum2; // khai báo các xâu để lưu
        String strNotification = "The two numbers ";

        
        strNum1 = JOptionPane.showInputDialog(null,
            "Please input the first number: ",
            "Duong Trung Kien 20215067 - First number",
            JOptionPane.INFORMATION_MESSAGE); // nhập vào xâu strNum1
        strNotification += strNum1 + " and ";

        strNum2 = JOptionPane.showInputDialog(null,
            "Please input the next number: ",
            "Duong Trung Kien 20215067 - Next number", 
            JOptionPane.INFORMATION_MESSAGE); // nhập vào xâu strNum2
        strNotification += strNum2;

        double num1 = Double.parseDouble(strNum1); //đổi hai số sang double
        double num2 = Double.parseDouble(strNum2);
        double sum = num1 + num2;              // tính tổng hai số
        double dif = num1 - num2;              // tính hiệu hai số
        double quoti = num1 / num2;            // tính thương hai số
        double prod = num1 * num2;             // tính tích hai số
        
        JOptionPane.showMessageDialog(null,
            strNotification + " has the sum: " + sum +"\n"+ "difference: " + dif + "\n"+ "product: " + prod +"\n" + "quotient: " + quoti ,
            "Duong Trung Kien 20215067 - Calculations with the two numbers",
            JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }       
}    