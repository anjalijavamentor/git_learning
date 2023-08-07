

abstract class Anjali{
    abstract void temp(); 
}

class Buddhu extends Anjali{

    void temp(){
        System.out.println("hello world");
    }
}

class fox extends Anjali{
     void temp(){
        System.out.println("hello again");
     }
}



public class Abstraction {
   public static void main(String[] args){
        Anjali f = new fox();
        f.temp();
   } 
}
