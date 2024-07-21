import java.util.Scanner;
public class file4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("What is your age?");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is your favourite color?");
        String color = scanner.nextLine();
        System.out.println("Hello! "+name);
        System.out.println("Your age is "+age);
        System.out.println("Your favourite color is "+color);
    }
    
}
//44:37