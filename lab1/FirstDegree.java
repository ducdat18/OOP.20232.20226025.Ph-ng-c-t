import javax.swing.JOptionPane;

public class FirstDegree {
    public static void main(String[] args) {
        String strA = JOptionPane.showInputDialog(null, "Enter the value of 'a': ", "Input 'a'", JOptionPane.INFORMATION_MESSAGE);
        String strB = JOptionPane.showInputDialog(null, "Enter the value of 'b': ", "Input 'b'", JOptionPane.INFORMATION_MESSAGE);
        double a = Double.parseDouble(strA);
        double b = Double.parseDouble(strB);
        if (a != 0) {
            double solution = -b / a;
            JOptionPane.showMessageDialog(null, "The solution for the equation " + a + "x + " + b + " = 0 is:\n x = " + solution, "Solution", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error: 'a' cannot be zero for a linear equation.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
