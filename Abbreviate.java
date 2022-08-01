import java.util.Scanner;  // Import the Scanner class

class Abbreviate {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username: ");

    String userName = sc.nextLine();  // Read user input
    int i=0, k=0;
    char[] ch = new char[userName.length()];
    for(i=0; i<userName.length(); i++) {
    	ch[i]=userName.charAt(i);
    	
    	//if(ch[i]== 1){
    		
    	//} 
    }
    
    
    System.out.println("Abbreviated Username is: " + userName);  // Output user input
  }
}