//1.Create an interface named Logger.
//2.Add two void methods to the Logger interface, each should take a String as an argument
//    a.  log
//    b.  error
//3.Create two classes that implement the Logger interface
//a.  AsteriskLogger
//b.  SpacedLogger


package week05Asignment;

public interface Logger {
	
	public void Log(String str);
	public void Error(String str);
	

}
