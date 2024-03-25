import java.io.*;
import java.util.Scanner;
class strm {
	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the string");		
	String str = scanner.nextLine();
	System.out.println("STRING MANIPULATION");
	System.out.println("Length of string: "+str.length());
	System.out.println("Uppercase: "+str.toUpperCase());	
	System.out.println("Lowercase: "+str.toLowerCase());
	System.out.println("Index of a: "+str.indexOf('a'));
	System.out.println("Join : "+str.concat("joined"));
StringBuffer st = new StringBuffer(str);
System.out.println("STRING MANIPULATION USING STRING BUFFER");
st.reverse();
System.out.println("Reversed string: "+st.toString());
st.insert(2," insert ");
System.out.println("Inseted string: "+st.toString());
}
}
	
