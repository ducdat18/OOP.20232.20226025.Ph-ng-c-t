import javax.swing.JOptionPane;

public class TriangleDisplay {
    public static void main(String[] args) {
        String strHeight = JOptionPane.showInputDialog(null, "Enter the height of the triangle: ", "Input Height", JOptionPane.INFORMATION_MESSAGE);
        int height = Integer.parseInt(strHeight);
        displayTriangle(height);
    }

    public static void displayTriangle(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = height - i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
