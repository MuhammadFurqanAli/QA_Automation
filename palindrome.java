import java.util.Scanner;  // Import the Scanner class
class palindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter String: ");
    String userName = sc.nextLine();  // Read user input
    int i=0, k=0, j=0, cn=0, cnt=0;
    int len=userName.length();
    char[] ch = new char[len];
    char[] chnew = new char[len];
    for(i=0; i<len; i++) {
    	ch[i]=userName.charAt(i);
    }
    for(i=0; i<len-1; i++) {
    	if(ch[i]==ch[i+1]) {
    		chnew[cn++]=ch[i];
    		cnt=0;
    		for(k=i-1; k>=0; k--) {
    			System.out.println(k+" :k: "+ch[k]);
    			for(j=i+2; j<len; j++) {
    				System.out.println(j+" :j: "+ch[j]);
    				if(ch[k]==ch[j]) {
    					chnew[cn++]=ch[k];
    					cnt++;
    				}
    				else {
    					break;
    				}
    				System.out.println();
    			}
    		if(cnt==0) {break;}
    		}
    		chnew[cn++]=' ';
    	}
    }
    for(i=0; i<len; i++) {
    	System.out.print(chnew[i]);  // Output user input
    }
  }
}