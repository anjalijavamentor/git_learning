
import java.util.*;
public class Condition{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);    
    int age = scanner.nextInt();
    scanner.close();

     
    if(age >= 18){
        System.out.println("you are  eligible");
    }
    else{
        System.out.println("you are not eligible");
    }
}
    
}