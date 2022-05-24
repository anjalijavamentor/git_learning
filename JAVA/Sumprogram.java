import java.util.Scanner;
public class Sumprogram{
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.println("enter first number");
        int a = num.nextInt();
        System.out.println("enter second number");
        int b = num.nextInt();
        int c = a + b;
        System.out.println("the sum of the numbers is:");
        System.out.println(c);
    }
}