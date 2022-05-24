import java.util.Scanner;

public class Takinginput2{
    public static void main(String[] args){
        Scanner str = new Scanner(System.in);
        System.out.println("enter your name");
        String name = str.nextLine();
        System.out.println(name);
        System.out.println("enter your id");
        int id = str.nextInt();
        System.out.println(id);
        System.out.println(name +" "+id);



    }
}