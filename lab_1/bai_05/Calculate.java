import javax.swing.JOptionPane;

public class Calculate {
    public static void main(String[] args){
        String strNum1, strNum2;
        String strNotification = "Hai so ";

        
        strNum1 = JOptionPane.showInputDialog(null, "Hay nhap so dau tien: ","So dau tien", JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum1 + " va ";

        strNum2 = JOptionPane.showInputDialog(null, "Hay nhap so tiep theo: ","So tiep theo", JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum2;

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        
        JOptionPane.showMessageDialog(null,strNotification + " co tong la: " + num1+=num2 + , "Cac phep tinh voi hai so",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }       
}    