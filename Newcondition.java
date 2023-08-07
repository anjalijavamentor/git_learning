import java.util.*;

public class Newcondition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number please");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        if(a == b){
            System.out.println("the number is equal");
        }
        else if(a > b){
            System.out.println("the number is greater");
        }
        else{
            System.out.println("the number is less");
        }
    }
    
}
