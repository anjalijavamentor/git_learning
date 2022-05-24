import java.util.*;
public class Listerators{
    public static void main(String[] args){
        ArrayList<String> str = new ArrayList<String>();
        str.add("anjali");
        str.add("amit");
        str.add("adarsh");
        str.add("mama");
        str.add("motu");
        str.add("mummy");

        ListIterator<String> itr = str.listIterator();
        while(itr.hasNext())
            System.out.println(itr.next());

            System.out.println("  ");

        while(itr.hasPrevious())
            System.out.println(itr.previous());

        
    }
}