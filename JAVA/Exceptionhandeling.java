public class Exceptionhandeling{
    public static void main(String[] args){

        System.out.println("this is a main method");
        int a=10,b=0,c;
        try{
        c=a/b;
        System.out.println(c);
        }
        catch(Exception e){
         System.out.println(e);
        }
        finally{
        System.out.println("main method is end here!!");

        }
    }
}