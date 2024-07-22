import java.util.*;/**
 * file8
 */
public class file8 {

    public static void main(String[] args) {
        System.out.println("Enter you age");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>17){
            System.out.println("Adult");
        }
        else{
            System.out.println("Child");
        }
    }
}