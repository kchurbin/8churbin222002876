import java.util.Scanner; // Import the Scanner class 

class myobject {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in); // object ya scanner

    System.out.println("Enter username");

    String userName = myObj.nextLine(); // Read user input
    System.out.println("Username is: " + userName); // Output user input
  }
}
