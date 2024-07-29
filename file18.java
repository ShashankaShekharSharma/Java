import java.util.Scanner;
public class file18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for addition and 2 for subtraction");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(c==1){
            System.out.println("Addition: "+(a+b));
        }
        else{
            System.out.println("Subtraction: "+(a-b));
        }
    }
}