import java.util.Scanner;
// java has a scanner class for taking input to keyboard scnner class has many methods
//to read tha data from the keyboard

public class Takinginput{
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");
    
        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input
      }
}