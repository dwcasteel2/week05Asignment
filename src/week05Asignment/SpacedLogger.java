//5. Implement the SpacedLogger methods:
//
//Note:  The SpacedLogger should add a space or " " between each character of the String argument passed into its methods.
//
//
//a. If the log method received “Hello” as an argument, it should print H e l l o
//
//b. The error method should do the same, but with “ERROR:” preceding the spaced out input (i.e. ERROR: H e l l o)

package week05Asignment;

public class SpacedLogger implements Logger {

	@Override
	public void Log(String str) {
		StringBuilder log = new StringBuilder();
		for(int i = 0; i <str.length(); i++) {
			log.append(str.charAt(i)).append(" ");
	}
		System.out.println(log);
}

	@Override
	public void Error(String str) {
		String er = ("ERROR: " + str);
		Log(er);
		
	}
	

}
