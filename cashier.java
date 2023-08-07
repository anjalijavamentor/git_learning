import java.util.*;
public class cashier {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int wamt , f ,h , t;
        sc.close();
        System.out.println("enter widhtdrawl amount");
        wamt = sc.nextInt();

        h = wamt / 100;
        wamt = wamt % 100;

        f = wamt / 50;
        wamt = wamt % 50;

        t = wamt / 10;
        wamt = wamt % 10;
        System.out.println("Rs. 100/- " + h);
		System.out.println("Rs. 50/- " + f);
		System.out.println("Rs. 10/- " + t);
    }
}
