import java.util.Scanner;  // Import the Scanner class

class Occurrence {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter String: ");

    String userName = sc.nextLine();  // Read user input
    int i=0, k=0, j=0;
    int len=userName.length();
    char[] ch = new char[len];
    int[] cnt = new int[len];
    for(i=0; i<len; i++) {
    	ch[i]=userName.charAt(i);
    }
    for(i=0; i<len; i++) {
    	for(k=0; k<len; k++) {
    		if(ch[i]==ch[k]) {
    			for(j=0; j<len; j++) {
    				
    				cnt[i]++;
    			}		
    		}
    	}
    }
    for(i=0; i<len; i++) {
    	System.out.println("Letter: "+ch[i]+", Occurrence: "+cnt[i]);  // Output user input
    }  
  }
}