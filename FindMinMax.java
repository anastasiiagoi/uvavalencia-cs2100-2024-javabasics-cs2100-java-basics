import java.util.Scanner;

public class FindMinMax {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n]; 
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;


        for (int j = 0; j < n; j++) {
            System.out.print("Enter a number to put in the array: ");
            numbers[j] = scanner.nextInt();
            if (numbers[j] < min) {
                min = numbers[j];
            }
            if (numbers[j] > max) {
                max = numbers[j];
            }
        
        }

        System.out.println("The minimum value is " + min);
        System.out.println("The maximum value is " + max);
        
        scanner.close();
    }
}


