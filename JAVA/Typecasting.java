public class Typecasting{
//typecasting means converting one datatype to another datatype;
//typecasting are two types implicity and explicity
// implicity small datatype to large
// explicity large to small conversion by default the compiler dosn't allow the explicit type casting.

    public static void main(String[] args){
        int a =34;
        double b = a;
        System.out.println(b);


        double c = 34.56;
        int d = (int)c;
        System.out.println(d);
    }   
}