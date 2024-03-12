import java.util.Arrays;
import javax.swing.JOptionPane;

public class ArrayOperations {
    public static void main(String[] args) {
        String strSize = JOptionPane.showInputDialog(null, "Enter the size of the array: ", "Input Size", JOptionPane.INFORMATION_MESSAGE);
        int size = Integer.parseInt(strSize);
        double[] numbers = new double[size];
        for (int i = 0; i < size; i++) {
            String input = JOptionPane.showInputDialog(null, "Enter element at index " + (i+1) + ": ", "Input Element", JOptionPane.INFORMATION_MESSAGE);
            numbers[i] = Double.parseDouble(input);
        }
        insertionSort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        double average = sum / size;
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);
    }
    public static void insertionSort(double[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            double key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
