package DemoPractice;

import java.io.Console;

public class IoConsole {

	public static void main(String[] args) {
		Console console = System.console();
		if (console != null) {
		    String name = console.readLine("Enter your name: ");
		    console.printf("Hello, %s\n", name);
		}
		// TODO Auto-generated method stub

	}

}
//⚠️ Note: System.console() often returns null in IDEs like Eclipse or IntelliJ, so it's more reliable in command-line environments.