import java.util.Scanner;  // Import the Scanner class
class Abbreviate {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username: ");
    String userName = sc.nextLine();  // Read user input
    int i=0, j=0, k=0, cn =0;
    int len = userName.length();
    char[] ch = new char[len];
    int[] cnt = new int[len];
    char[] arr = new char[len];
    for(i=0; i<len; i++) {
    	ch[i]=userName.charAt(i);
    }
    for(i=0; i<len; i++) {
    	if(ch[i]==' ') {
    		cnt[i]++;
    		cn = cn + cnt[i];
    	}
    }
    if(cn==0) {
    	System.out.println("Abbreviated Username is: " + userName);  // Output user input
    }
    else if(cn==1){
    	k=2;
    	arr[0]=ch[0];
    	arr[1]='.';
    	
    	for(i=0; i<len; i++) {
    		if(cnt[i]==1) {
    			for(j=i;j<len;j++) {
    				arr[k]=ch[j];
    				k++;
    			}
    		}
    	}
    	
    	System.out.println("Abbreviated Username is: ");  // Output user input
    	for(i=0; i<len; i++) {
    		System.out.print(arr[i]);
    	}
    }
    else if(cn==2){
    	k=4;
    	arr[0]=ch[0];
    	arr[1]='.';
    	for(i=0; i<len; i++) {
    		if(cnt[i]==1) {
    			arr[2]=ch[i+1];
    	    	arr[3]='.';
    	    	break;
    		}	
    	}
    	for(i=i+1; i<len; i++) {
    		if(cnt[i]==1) {
    			for(j=i+1;j<len;j++)
    			{
    				arr[k]=ch[j];
    				k++;
    			}
    		}
    	}
    	System.out.println("Abbreviated Username is: ");  // Output user input
    	for(i=0; i<len; i++) {
    		System.out.print(arr[i]);
    	}
    }
  }
}