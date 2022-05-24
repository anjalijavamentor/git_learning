import java.io.File;
import java.io.Scanner;
public class readfile{
    public static void main(String[] args){
        File obj = new File("readfile.txt");
        Scanner read = new Scanner(obj);
        while(read.hasNextLine()){
        String str = read.nextLine();
        System.out.println(str);    
        }

    }
}