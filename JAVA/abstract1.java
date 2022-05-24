abstract class abstractdemo{
    abstract void area();

    void area2(){
        System.out.println("this  is a abstract method");
    }
}
class abstration extends abstract1{
    void area(){
        System.out.println("abstraction is the implementation of area ");
    }
}

public  class abstract1{
    public static void main(String[] args){
        abstration abs = new abstration();
        abs.area();
        abs.area2();
    }
}