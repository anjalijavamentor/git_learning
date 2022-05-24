public class Functionoverloading{
   
        public int sum(int x , int y){
            return(x+y);

        }
        public int sum(int x ,int y ,int z){
            return(x+y+z);
        }
        public double sum(double x ,double y){
            return(x + y);
        }

        public static void main(String[] args){
            Functionoverloading  s = new Functionoverloading();
            System.out.println(s.sum(20+30));
            System.out.println(s.sum(30+20+30));
            System.out.println(s.sum(2.3+4.4+5.5));
        }
}