class animal { 
 private String Name = "Animal";
 private int Age = 3;

 void set_Value(String str, int num){
	 this.Name=str;
	 this.Age=num;
 }
 void get_Value() { 
	 System.out.println("My Name is: "+Name);
	 System.out.println("My Age is: "+Age);
}
}
class zebra extends animal {
	zebra(){
	animal myZ = new animal();
	myZ.set_Value("Zebra", 13);
	myZ.get_Value();
	System.out.println("I am from Lahore Zoo.");
	}
}
class dolphin extends animal {
	dolphin(){
		animal myD = new animal();
		myD.set_Value("Dolphin", 7);
		myD.get_Value();
		System.out.println("I am from Karachi Sea.");
		}
}
class animals{
public static void main(String args[]) 
{   
     zebra myZebra = new zebra();
     dolphin myDolphin = new dolphin();

}
}
