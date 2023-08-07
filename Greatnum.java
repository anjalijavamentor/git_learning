import java.util.*;
public class Greatnum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int a = sc.nextInt();
        System.out.println("enter another number");
        int b = sc.nextInt();
        sc.close();
        int result;
        result = Greater(a,b);
        System.out.println("The largest number is : " + result);
    }

        public static int Greater(int x, int y){
            int large;
            if(x > y){
                large = x;
            }
            else{
                large = y;
            }
            return large;
        }
    }
    

