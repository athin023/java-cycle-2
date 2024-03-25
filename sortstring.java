import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
class sortstring {
	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter no of strings");		
	int no = scanner.nextInt();
	String[] str=new String [no];
	scanner.nextLine();

		for(int i = 0; i<no; i++)
		{
                System.out.println("Enter the string");
		str[i] = scanner.nextLine();	
		}	

	Arrays.sort(str);
 	System.out.println("Sorted strings\n");
	for(int i = 0; i<no; i++)
		{
                 System.out.println(str[i]);
		}	

}
}
