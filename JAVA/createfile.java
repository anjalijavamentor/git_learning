import java.io.*;
//import java.io.IOException;
//import java.io.PrintWriter;
public class createfile{
    public static void main(String[] args){
        try{
            File file = new File("filename.txt");
            if(file.createNewFile()){
                System.out.println("file is created successfully"+file.getName());
            }
            PrintWriter p = new PrintWriter(file);
            p.println("this is file data which i wnd to enter inthis file");
            p.println("this is file data which i wnd to enter inthis file");
            p.println("this is file data which i wnd to enter inthis file");
            p.println("this is file data which i wnd to enter inthis file");
            p.println("this is file data which i wnd to enter inthis file");
            p.close();
           System.out.println("file is already exist in this folder");

           
        }

        catch(IOException e){
        System.out.println("error!!");
        //e.printstecktrace();

        }
    }
}