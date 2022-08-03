import java.util.Scanner;  // Import the Scanner class
class Armstrong {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter Number: ");
    String arr = sc.nextLine();  // Read user input
    int chk = Integer.parseInt(arr);
    int i=0, b=0, c=0;
    int len = arr.length();
    for(i=0;i<len;i++) {
    	c = Character.getNumericValue(arr.charAt(i));
    	b = b + (int)Math.pow(c,len);   	
    }
    if(b==chk) {
    	System.out.print("Number "+chk+" is Armstrong.");
    }
    else if(b!=chk) {
    	System.out.print("Number "+chk+" is not Armstrong.");
    }
  }
}