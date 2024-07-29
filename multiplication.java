import java.util.Scanner;
    public class multiplication {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number ");
        int num = scanner.nextInt();

        int i = 1;
        do {
            System.out.println(num+ " x " + i + " = " + (num * i));
            i++;
        } while (i <= 10);
    }
}
