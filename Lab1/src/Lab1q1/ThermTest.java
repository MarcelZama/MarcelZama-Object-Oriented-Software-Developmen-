package Lab1q1;

public class ThermTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Student Name 	: Oisin Cawley
		// Student Id Number: 
		// Date 			: Nov-2015
		// Purpose 			: My first class implementation

				Thermometer thermA = new Thermometer();		// Create an instance of our Thermometer class
				Thermometer thermB = new Thermometer();		// Create an instance of our Thermometer class

				System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
				thermA.setCelsius(20.0);
				System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
				thermB.setCelsius(10.0);
				System.out.println("Temp. of Thermometer B is " + thermB.getCelsius() );
		
	}

}
