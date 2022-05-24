public class interfaceKey{
    interface Anjali{
      public  void fun();
      public  void fun1();
    }

    class Anjali1 implements Anjali{
         public void fun(){
             System.out.println("this is a function of interface ");
         }

         public void fun1(){
           Syste.out.println("this is also a function of interface class");
         }
    }

    public static void main(String[] args){
      Anjali1 anj = new Anjali1();
      anj.fun1();
      anj.fun1();
    }
}