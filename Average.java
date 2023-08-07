import java.util.*;
public class Average{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
        System.out.println("enter third number");
        int c = sc.nextInt();
        sc.close();
        int sum = a + b + c;
        int temp = sum / 3;
        System.out.println(temp);


        
    }
}