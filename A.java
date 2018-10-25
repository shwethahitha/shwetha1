package Training;

public class A {

	public static void main(String[] args) {
		int i;
for( i=0, System.out.println("Initializer"); i<5; i++, System.out.println("Increment"))
	
{
	System.out.println("Body");
}

	}
}


/* since semicolon used here "Initializer" print once and ends with 
printing last statement "Body" then it checks for second condition i<5 and i++ and prints
 Body Increment 4 times and when i value becomes 5 the 
 condition fails and prints only "Increment" at last */


/*Initializer
Body
Increment
Body
Increment
Body
Increment
Body
Increment
Body
Increment */