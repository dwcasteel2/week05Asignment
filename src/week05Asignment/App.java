//6.     Create a class named App that has a main method.
//
//a.  In this class instantiate an instance of each of your logger classes that implement the Logger interface.
//
//b. Test both methods on both instances, passing in Strings of your choice.


package week05Asignment;

public class App {

	public static void main(String[] args) {
	
		
		Logger asteriskLogger = new AsteriskLogger();
		Logger spacedLogger = new SpacedLogger();
		
		asteriskLogger.Log("Hi!");
		asteriskLogger.Error("Bye!");
		
		System.out.println();
		
		spacedLogger.Log("Hello");
		spacedLogger.Error("Danger!");
		
		System.out.println();
	}

}
