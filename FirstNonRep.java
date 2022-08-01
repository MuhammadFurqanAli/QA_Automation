import java.util.Scanner;  // Import the Scanner class
class FirstNonRep {
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
    	for(k=i; k<len; k++) {
    			if(ch[i]==ch[k]) {
    				cnt[j]++;
    			}
    			if(cnt[j]==0) {
    				System.out.println(ch[j]);
    				System.exit(0);
    			}
    			j++;
    	}
    }
  }
}