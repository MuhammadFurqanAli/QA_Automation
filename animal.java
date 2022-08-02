class animal { 
 private String Name = "Animal";
 private int Age = 3;

 void set_Value(String str, int num){
	 this.Name=str;
	 this.Age=num;
 }
 
 animal(){
	 System.out.println("My Name is: "+Name);
	 System.out.println("My Age is: "+Age);
 }
}
class zebra extends animal {
	zebra(){
	animal myZ = new animal();
	myZ.set_Value("Zebra", 13);
	System.out.println("I am from Lahore Zoo.");
	}
}
class dolphin extends animal {
	dolphin(){
		animal myD = new animal();
		myD.set_Value("Dolphin", 7);
		System.out.println("I am from Karachi Sea.");
		}
}
class findEmpty{
public static void main(String args[]) 
{   
     animal myAnimal = new animal();
     zebra myZebra = new zebra();
     dolphin myDolphin = new dolphin();

}
}
