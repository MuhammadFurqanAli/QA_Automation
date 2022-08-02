import java.util.Scanner;  // Import the Scanner class

class FirstNonRep {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter String: ");

    String userName = sc.nextLine();  // Read user input
    int i=0, k=0;
    int len=userName.length();
    char[] ch = new char[len];
    int[] cnt = new int[len];
    for(i=0; i<len; i++) {
    	ch[i]=userName.charAt(i);
    }
    for(i=0; i<len; i++) {
    	for(k=0; k<len; k++) {
    		if(ch[i]==ch[k]) {    				
    				cnt[i]++;		
    		}
    	}
    	if(cnt[i]==1) {
    		System.out.println("First Non-Repeating Letter is: "+ch[i]);
    		break;
    	}
    }
  }
}