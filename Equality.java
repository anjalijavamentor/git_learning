import java.util.*;

public class Equality {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        sc.close();
        if(a == b){
            System.out.println("Equal");
        }
        else{
            if(a > b ){
                System.out.println("greater");
            }
            else{
                System.out.println("lesser");
            }
        }
    }
}
