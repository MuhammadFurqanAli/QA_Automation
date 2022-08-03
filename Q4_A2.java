//import java.util.Scanner;

class Operation{
	int reverse(int num1, int num2) {
		int sum =0;
		sum =num1+num2;
	    System.out.println("Sum is: "+sum);
	    return sum;
	}
}

class Operator extends Operation{
	void reverse(String arr) {
	    int i=0,cn=0;
	    int len = arr.length();
	    char [] ch= new char [len];
	    char [] chnew= new char [len];
	    char [] rev= new char [len];
	    for(i=0;i<len;i++) {
	    	ch[i] = arr.charAt(i);
	    }
	    for(i=0;i<len;i++) {
	    	if(ch[i]=='*') {
	    		chnew[i] = ch[i];
	    	}		
	    }
	    for(i=len-1;i>=0;i--) {
			if(ch[i]!='*') {
				rev[cn++]=ch[i];
			}
		}
	    cn=0;
	    for(i=0;i<len;i++) {
	    	if(ch[i]!='*') {
	    		chnew[i] = rev[cn++];
	    	}		
	    }
	    System.out.print("Reversed String is: ");  // Output user input
    	for(i=0; i<len; i++) {
    		System.out.print(chnew[i]);
    	}
}
	}

class Q4_A2{
		public static void main(String[] args) {
		Operator Opr = new Operator();
		Opr.reverse(15, 25); //Assign Numbers here
		Opr.reverse("*hel**l*o");
	}
}