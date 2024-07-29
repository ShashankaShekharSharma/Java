import java.util.Scanner;

public class file17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();  // Close the scanner to prevent resource leaks
        
        switch (a / 10) {
            case 10: // Handle the edge case of 100
                System.out.println("A (Excellent)");
                break;
            case 9:
                System.out.println("A (Excellent)");
                break;
            case 8:
                System.out.println("B (Very Good)");
                break;
            case 7:
                System.out.println("C (Good)");
                break;
            case 6:
                System.out.println("D (Satisfactory)");
                break;
            default:
                if (a >= 0 && a < 60) {
                    System.out.println("F (Fail)");
                } else {
                    System.out.println("Invalid");
                }
                break;
        }
    }
}
