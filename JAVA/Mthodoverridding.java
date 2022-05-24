public class Mthodoverridding{

 class family{
    void Member(){
        System.out.println("papa is the main gardain of the family :)");
    }
}
class secMem extends family{
    void Member(){
        System.out.println("mummy is also a main member of the family because she take cares of everyone :)");
    }
}
class thirdMem extends family{
    void Member(){
        System.out.println("anjali is the third member of the family ;)");
    }
}

class forthMem extends family{
    void Member(){
        System.out.println("amit is the forth member of the family:)");
    }
}

class lastMem extends family{
    void Member(){
        System.out.println("saddu is the last member of the family ;)");
    }
}
 

     public static void main(String[] args) {
        family f  = new family();
        secMem s = new secMem();
        thirdMem t = new thirdMem();
        forthMem fo = new forthMem();
        lastMem l = new lastMem();

        f.Member();
        s.Member();
        t.Member();
        fo.Member();
        l.Member();
    }
}