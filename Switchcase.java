
import java.util.*;
public class Switchcase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your choice");
        int button = sc.nextInt();
        sc.close();
        switch(button){
            case 1: System.out.println("hello");
            break;
            case 2: System.out.println("namaste");
            break;
            case 3: System.out.println("bonjour");
            break;
            default: System.out.println("get lost");
        }
    }
}
