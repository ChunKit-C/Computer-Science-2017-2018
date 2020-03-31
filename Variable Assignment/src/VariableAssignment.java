
public class VariableAssignment {

	public static void main(String[] args) {
			//Program 1
			// Calculates perimeter and area of a rectangle with set length and width
			int Length = 20; //variable
			System.out.print("The length of your rectangle is: "); 
			System.out.print(Length);
			System.out.println(" Units");
		
			int Width= 10; //variable  
			System.out.print("The width of your rectangle is: "); 
			System.out.print(Width);
			System.out.println(" Units");
			
			int Perimeter; //variable 
			Perimeter = 0;
			System.out.print("The perimeter is: "); 
			System.out.print(Perimeter= 2 * Length + 2 * Width); // formula for perimeter
			System.out.println(" Units");
			
			int Area= 0; //variable 
			System.out.print("The area is: "); 
			System.out.print(Area = Length * Width); // formula for area
			System.out.println(" Units");
			System.out.print("\n");
			System.out.print("\n");
			System.out.print("\n");
			System.out.print("\n");
		
			//Program 2
			// Calculates perimeter and area of a circle
			float pi = (float) Math.PI;  
			int radius = 5;
			System.out.print("The radius of your circle is: "); 
			System.out.print(radius); 
			System.out.println(" Units");
			
			float circumference= 2 * pi * radius; // formula for circumference of a circle
			System.out.println("The circumference of your circle is: " + circumference + " Units"); 
			
			float area = pi * radius * radius; // formula for area of a circle
			System.out.print("The area of your circle is: " + area); 
			System.out.println(" Units");
			System.out.print("\n");
			System.out.print("\n");
			System.out.print("\n");
			System.out.print("\n");
			//Program 3
			// Converts a temperature in Celsius to Fahrenheit
			double fahTemp = 0;
			double celTemp = 0;
			System.out.print(celTemp);
			System.out.print(" degrees in Celsius is equal to "); 
			System.out.print(fahTemp = (celTemp*9/5) + 32); // formula for temperature conversion
			System.out.println(" Fahrenheit");
			System.out.print("\n");
			System.out.print("\n");
			System.out.print("\n");
			System.out.print("\n");
			//Program 4
			// displays your name and calculates your average based on your 4 favourite subjects
			double English = 85;
			double Math = 75; 
			double Chemistry = 87;
			double Computer_Studies = 95;
			System.out.print("Your English mark is "); 
			System.out.print(English + "%\n"); 
			System.out.print("Your Math mark is "); 
			System.out.print(Math + "%\n"); 
			System.out.print("Your Chemistry mark is "); 
			System.out.print(Chemistry + "%\n"); 
			System.out.print("Your Computer_Studies mark is "); 
			System.out.print(Computer_Studies + "%\n"); 
			System.out.print("Your average of all subjects is "); 
			System.out.print((English + Math + Chemistry + Computer_Studies)/4 + "%"); // formula for average of 4 marks
			
	}

}
