import java.util.LinkedList;

public class Linkedlistarr{
    public static void main(String[] args){
        LinkedList<String> str = new LinkedList<String>();
        str.add("anjali");
        str.add("ram");
        str.add("syam");
        str.add("anju");
        str.add("beta");
        str.addFirst("krishna");
        str.addLast("tanu");

        System.out.println("size of linkedlist is: "+ str.size());
        for(String i: str){
            System.out.println(i);
        }






    }
}