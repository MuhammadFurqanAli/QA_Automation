import java.util.Scanner;

class findMiss{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter (1-100) Number You Want to Miss: ");
	    int n = sc.nextInt();
	    int[] arr = new int[100];
	    int i=0, result =0;
	    for(i=0;i<100;i++) {
		    if(n==i+1) {
		    	arr[i]=0;
		    }
		    else {
		    	arr[i]=i+1;
		    }
	    }
	    for(i=0;i<100;i++) {
		    if(arr[i]!=i+1) {
		    	result=i;
		    }
	    }
	    
		System.out.println("Number "+(int)(result+1)+" is Missing at Index is: "+result);
	}
}