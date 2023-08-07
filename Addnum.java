import java.util.*;
public class Addnum {
    public static void main(String[] args){
                
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first num");
        int s = sc.nextInt();
        System.out.println("enter second num");
        int n = sc.nextInt();
        sc.close();
        int sum = s + n;
        System.out.println(sum);
        
    }
    
}
