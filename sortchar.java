import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
class sortchar {
	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the string");		
	String s = scanner.nextLine();
	char[] str=s.toCharArray();
	Arrays.sort(str);
 	System.out.println("Sorted strings\n");
 	System.out.println(str);
}
}
