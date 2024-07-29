import java.util.*;
public class java14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 for Juice or Press 2 for Soda");
        int a = sc.nextInt();
        if(a==1){
            System.out.println("Dispensing juice");
        }
        else if(a == 2){
            System.out.println("Dispensing soda");
        }
        else{
            System.out.println("Invalid choice");
        }
    }
}
