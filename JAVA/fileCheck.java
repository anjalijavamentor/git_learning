import java.io.*;
public class fileCheck{
    public static void main(String[] args){
          
             File obj1 = new  File ("filename.txt");
             if(obj1.delete()){
                 System.out.println("file is deleted successfully:"+obj1.getName());
                
             } 
             else{
                 System.out.println("Failed to delete the file.");
             }
          
    }
}