import java.util.Scanner;

public class Hello{
	public static void main(String[] args){
		Scanner inName = new Scanner(System.in);
		System.out.print("Enter Name: ");
		
		String name = inName.nextLine();
		System.out.println("Hello, " + name);
	}
}
