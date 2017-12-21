package Execution_Environment;

public class CommandLine {
	
	public static void main(String[] args){
		
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("SystemRoot"));
		
		if(args.length < 1){
			System.out.println("No args");
		} else {
			System.out.println("Args");
		}
	}

}
