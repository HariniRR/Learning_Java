package basicConceptsOfJava;

public class StringClassDemo {
    public static void main(String[] args) {
        String greeting = "Hello, Java!";
        System.out.println("Original greeting: " + greeting);

        char[] charArray = {'W', 'o', 'r', 'l', 'd'};
        String anotherGreeting = new String(charArray);
        System.out.println("Constructed from characters: " + anotherGreeting);

        int length = greeting.length();
        System.out.println("Total characters in greeting: " + length);

        char charAtIndex = greeting.charAt(7);
        System.out.println("Character found at position 7: " + charAtIndex);

        String subString = greeting.substring(7, 11);
        System.out.println("Extracted part of greeting: " + subString);

        String upperCaseGreeting = greeting.toUpperCase();
        System.out.println("Greeting in uppercase: " + upperCaseGreeting);

        String lowerCaseGreeting = greeting.toLowerCase();
        System.out.println("Greeting in lowercase: " + lowerCaseGreeting);

        int indexOfComma = greeting.indexOf(",");
        System.out.println("Comma appears at index: " + indexOfComma);

        boolean areEqual = greeting.equals("Hello, Java!");
        System.out.println("Is greeting exactly 'Hello, Java!': " + areEqual);

        boolean startsWithHello = greeting.startsWith("Hello");
        System.out.println("Does greeting begin with 'Hello': " + startsWithHello);

        boolean endsWithExclamation = greeting.endsWith("!");
        System.out.println("Does greeting end with '!': " + endsWithExclamation);

        String concatenatedString = greeting.concat(" Welcome!");
        System.out.println("Greeting after adding message: " + concatenatedString);

        String replacedString = greeting.replace('a', 'o');
        System.out.println("Greeting with 'a' changed to 'o': " + replacedString);
    }
}

/*Output
 Original greeting: Hello, Java!
Constructed from characters: World
Total characters in greeting: 12
Character found at position 7: J
Extracted part of greeting: Java
Greeting in uppercase: HELLO, JAVA!
Greeting in lowercase: hello, java!
Comma appears at index: 5
Is greeting exactly 'Hello, Java!': true
Does greeting begin with 'Hello': true
Does greeting end with '!': true
Greeting after adding message: Hello, Java! Welcome!
Greeting with 'a' changed to 'o': Hello, Jovo!

 */
 
/*
The String class provides a rich set of methods for various string manipulations, including:
	Examination: length(), charAt(), isEmpty().
	Comparison: equals(), equalsIgnoreCase(), compareTo().
	Searching: indexOf(), contains(), startsWith(), endsWith().
	Manipulation: concat(), substring(), replace(), toLowerCase(), toUpperCase(), trim().
	Conversion: toCharArray(), valueOf().

 While String is immutable, Java provides StringBuffer and StringBuilder classes for scenarios requiring mutable character sequences. 
 StringBuffer is thread-safe (synchronized), while StringBuilder is not (not thread-safe i.e. for single-threaded operations but faster).
 */