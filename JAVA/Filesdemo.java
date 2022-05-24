import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

public class Filesdemo{
    public static void main(String[] args){
        try{
        File obj = new File("filename.txt");
        if(obj.createNewFile()){
            System.out.println("file created:"+obj.getName());
        }
        else{
            System.out.println("file already exist in your system");
        }
            
        }

        catch(IOException e){
            System.out.println("an error ");
            e.printStackTrace();
        }
        
    }
}