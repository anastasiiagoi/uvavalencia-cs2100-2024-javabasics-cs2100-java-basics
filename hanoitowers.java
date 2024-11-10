import java.util.Scanner;

public class hanoitowers {
    
    
    public static void solveHanoi(int n, char start, char temp, char end) {
        
        if (n == 1) {
            System.out.println("Move disk 1 from " + start + " to " + end);
            return;
        }
       
        solveHanoi(n - 1, start, end, temp);
        
        System.out.println("Move disk " + n + " from " + start + " to " + end);
        
       
        solveHanoi(n - 1, temp, start, end);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of disks: ");
        int n = scanner.nextInt();

        System.out.println("\nSteps to move the disks:");
        solveHanoi(n, 'A', 'B', 'C');

        scanner.close();
    }
}
