import java.util.Scanner;  // Import the Scanner class
class Duplicate {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter String: ");
    String userName = sc.nextLine();  // Read user input
    int i=0, k=0, j=0;
    int len=userName.length();
    char[] ch = new char[len];
    char[] chnew = new char[len];
    for(i=0; i<len; i++) {
    	ch[i]=userName.charAt(i);
    }
    for(i=0; i<len; i++) {
    	for(k=0; k<i; k++) {
    		if(ch[i]==ch[k]) {
    			break;
    		}
    	}
    	if(k==i) {
    		chnew[j++]=ch[i];
    	}
    }
    for(i=0; i<len; i++) {
    	System.out.print(chnew[i]);  // Output user input
    }
  }
}