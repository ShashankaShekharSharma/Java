import java.util.Scanner;
public class SimpleInterest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double principal = scanner.nextDouble();
        double rate = scanner.nextDouble();
        int years = scanner.nextInt();
        double interest=0.0;
        for (int i = 1; i <= years; i++) {
            interest = interest+ (principal * rate * i) / 100;
        }
        System.err.println("Simple interest="+ interest);
    }
}