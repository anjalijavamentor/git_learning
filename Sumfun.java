
import java.util.*;

public class Sumfun {
    public static int calculateSum(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num");
        int a = sc.nextInt();
        System.out.println("enter num");
        int b = sc.nextInt();
        sc.close();
        int sum = calculateSum(a, b);
        System.out.println(sum);
    }
    
}
