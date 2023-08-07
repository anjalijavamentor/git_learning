import java.util.*;

public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(a==b){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
        scanner.close();
    }
        
    }

