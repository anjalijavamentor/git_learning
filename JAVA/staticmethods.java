public class staticmethods{
    public void nonStatictest(){
        System.out.println("this is a non stat class");
    }

    public static void statictest(){
        System.out.println("this is a static class");

    }
    public static void main(String[] args){
        staticmethods methodtest = new staticmethods();
        System.out.println("hello static methods");
        methodtest.nonStatictest();
        statictest();
    }
}