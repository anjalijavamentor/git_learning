import java.util.*;
public class hasSet{
    public static void main(String[] args){
        HashSet<String> str = new HashSet<String>();
        str.add("anjali");
        str.add("shyam");
        str.add("ram");
        str.add("khaggu");
        str.add("heena");

        Iterator<String> itr = str.iterator<String>();
        while(itr.HashNext()){
            System.out.println(itr.next());
        }

                                                                                                                                                                                                                                                                                     

    }
}