import javax.swing.JOptionPane;

public class Calculation {
    public static void main(String[] args) {
        String strNum1, strNum2;
        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
        String strNotification = "Answer: \n";
        strNotification += "Sum: " + sum + "\n";
        strNotification += "Difference: " + difference + "\n";
        strNotification += "Product: " + product + "\n";
        strNotification += "Quotient: " + quotient + "\n";
        JOptionPane.showMessageDialog(null, strNotification, "Result", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
