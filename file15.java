import java.util.*;
public class file15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temperature");
        int temp = sc.nextInt();
        if(temp>30){
            System.out.println("It's hot");
        }
        else if(temp<30 && temp>20){
            System.out.println("It's warm");
        }
        else if(temp<20 && temp>10){
            System.out.println("It's cool");
        }
        else{
            System.out.println("It's cold");
        }
    }
}
