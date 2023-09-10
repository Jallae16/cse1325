import java.util.Scanner;

public class LibraryManager{
	public static void main(String[] args){
		 Library lib = new Library("Meowsier-Kitty Public Library");
		 Publication book1 = new Publication("The Assassination of Fred Hampton", "Jeffrey Haas", 2010);
		 Publication book2 = new Publication("1984", "George Orwell", 1949);
		 Publication book3 = new Publication("The Formation of Poltiical Parties and the First National Elections in Russia", "Terence Emmons", 1983);
		 
		 lib.addPublication(book1);
		 lib.addPublication(book2);
		 lib.addPublication(book3);
		 
		 System.out.println(lib.toString());
		 
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("\nWhat book would you like to checkout: ");
		 int bookNum = scanner.nextInt();
		 String buffer = scanner.nextLine();
		 System.out.println("\nWhat is thy name: ");
		 String patron = scanner.nextLine();
		 
		 lib.checkOut(bookNum, patron);
		 
		 System.out.println(lib.toString());
	}
}
