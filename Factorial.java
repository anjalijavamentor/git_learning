public class Factorial {
    public static void main(String[] args){
        int fact=1 , i;
        int num = 4;
        for(i = 1; i <= 4; i++){
            fact = fact * i;
        }
        System.out.println("factorial of "+num+ "is"+fact);
    }
}
