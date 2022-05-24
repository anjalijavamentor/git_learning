import  java.util.ArrayList;
import java.util.Collections;
public class Arrays{
 public static  void main(String[] args){
    ArrayList<Integer> myList = new ArrayList<Integer>(5);
    myList.add(23);
    myList.add(24);
    myList.add(26);
    myList.add(77);
    myList.add(87);


    Collections.sort(myList);
    for(Integer x : myList){
        System.out.println(x);
    }

    System.out.println("SIZE"+myList.size());

    myList.remove(2);
    //myList.clear();
   // myList.set(0 , 244);

    // for(Integer x : myList){
    //     System.out.println(x);
    // }

    // System.out.println("SIZE"+myList.size());

    
}

}