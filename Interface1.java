interface Printable{
    void print();
}

interface Showable{
    void show();
}

class Interface1 implements Printable , Showable{

    public void print(){
        System.out.println("this is printable's method");
    }

    public void show(){
        System.out.println("this is Showable's method");
    }

    public static void main(String[] args){
        Interface1 obj = new Interface1();
        obj.print();
        obj.show();
    }

}


  

