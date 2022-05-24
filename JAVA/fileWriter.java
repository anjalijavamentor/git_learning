import java.io.FileWriter;  
import java.io.IOException;

public class fileWriter{
    public static void main(String[] args){
        try{
            FileWriter mywriter = new FileWriter("filename.txt");
            mywriter.write("this file crated in java code");
            mywriter.close();
            System.out.println("Successfully wrote to the file.");
        }
        catch(IOException e){
            System.out.println("an error ");
            e.printStackTrace();
        }
        
    }
}