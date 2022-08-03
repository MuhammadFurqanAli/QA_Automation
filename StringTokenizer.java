import java.util.Scanner;  // Import the Scanner class
class StringTokenizer {
	
	 Scanner sc = new Scanner(System.in);  // Create a Scanner object
	 private String inp =sc.nextLine();
	 
	 public String input() { 	//get input function
		return inp;
	 }
	
	 public int countToken( String inp ) { 	//counter for tokens		
		int i=0, cnt=0;
		int len = inp.length();
		char[] ch = new char[len];
		for(i=0;i<len;i++) {
			ch[i]=inp.charAt(i);
			if(ch[i]=='@' || ch[i]=='#' || ch[i]==' ' || ch[i]==',' || ch[i]=='*') {
				cnt++;
			}
		}
		return cnt;
	}
	
	//main
  public static void main(String[] args) {
	  System.out.println("Enter String: ");
	  
	  StringTokenizer func = new StringTokenizer(); // declared object
	  String arr = func.input();	// got input using getter

    int chk = func.countToken(arr);
    System.out.println("Count is: "+chk);
    
  }
}