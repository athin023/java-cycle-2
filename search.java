import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
class search {
	public static void main(String[] args){
	int c=0;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter no of elements");		
	int no = scanner.nextInt();
	int[] arr=new int [no];
	scanner.nextLine();

		for(int i = 0; i<no; i++)
		{
                System.out.println("Enter the elements");
		arr[i] = scanner.nextInt();	
		}
	System.out.println("Enter element to be searched");
	int k = scanner.nextInt();
	for(int i = 0; i<no; i++)
		{
                if(arr[i]==k)
		c++;	
		}

	if(c==0)
{
System.out.println("Element not found");

}
else
{
System.out.println("Element found");
}

}
}
