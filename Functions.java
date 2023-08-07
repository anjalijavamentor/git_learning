import java.util.*;
public class Functions {
    public static void printName(String name){
            System.out.println(name);
            return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter you name");
        String name = sc.next();
        sc.close();
        System.out.println(name);
    }
    
}
