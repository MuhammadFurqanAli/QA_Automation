public class RunEncapTest { 
 private String Name;
 private int Age;
 private int id;

//Default Constructor is Auto-Called
//When the object is created
//write parameterized constructor with three parameters
RunEncapTest() {
	 Name = "Furqan";
	 Age = 19;
	 id = 1999;
}
RunEncapTest (String Name1, int Age1, int id1) {
	 Name = Name1;
	 Age = Age1;
	 id = id1;
}
 //write getters
public String getName() {
  return Name;
}
public int getAge() {
	  return Age;
	}
public int getId() {
	  return id;
	}

//write setters
public void setName(String newName) {
  this.Name = newName;
}
public void setAge(int newAge) {
	  this.Age = newAge;
	}
public void setId(int newId) {
	  this.id = newId;
	}

//main
public static void main(String args[ ]) 
	{   
		RunEncapTest encap = new RunEncapTest(); // Default Constructor is Auto-Called
		// When the object is created
		System.out.println();
		System.out.println("Using Default Constructor!!!");
		System.out.println();
		String name0 =  encap.getName();
    	System.out.println("Old Name Is: " + name0);
    	int Age0 = encap.getAge();
    	System.out.println("Old Age Is: " + Age0);
    	int id0 = encap.getId();
    	System.out.println("Old ID Is: " + id0);
    	System.out.println();
    	System.out.println("Applying Encapsulation!!!");
    	System.out.println();
    	//call setters for initialization
     	encap.setName("PewPew");
     	encap.setAge(23);
     	encap.setId(4123);
     
     	//call getter and print values
     	name0 =  encap.getName();
     	System.out.println("Set Name Is: " + name0);
     	Age0 = encap.getAge();
     	System.out.println("Set Age Is: " + Age0);
     	id0 = encap.getId();
     	System.out.println("Set ID Is: " + id0);
     
     	
     	
     	RunEncapTest encap1 = new RunEncapTest("CureMD",17,4000); // Parameterized Constructor is Auto-Called
		// When the object is created
		System.out.println();
		System.out.println("Using Paramterized Constructor!!!");
		System.out.println();
		name0 =  encap1.getName();
    	System.out.println("Old Name Is: " + name0);
    	Age0 = encap1.getAge();
    	System.out.println("Old Age Is: " + Age0);
    	id0 = encap1.getId();
    	System.out.println("Old ID Is: " + id0);
    	System.out.println();
    	System.out.println("Applying Encapsulation!!!");
    	System.out.println();
    	//call setters for initialization
     	encap1.setName("PomPom");
     	encap1.setAge(27);
     	encap1.setId(5000);
     
     	//call getter and print values
     	name0 =  encap1.getName();
     	System.out.println("Set Name Is: " + name0);
     	Age0 = encap1.getAge();
     	System.out.println("Set Age Is: " + Age0);
     	id0 = encap1.getId();
     	System.out.println("Set ID Is: " + id0);
	}
}
