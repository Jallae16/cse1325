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
		 
		 Patron pat1 = new Patron("Allie", "allie23@gmail.com");
		 Patron pat2 = new Patron("Alex", "alexC1@gmail.com");
		 lib.addPatron(pat1);
		 lib.addPatron(pat2);
		 System.out.println(lib.patronMenu());
		 
		 String buffer = scanner.nextLine();
		 System.out.println("\nWhich one are you: ");
		 int patron = scanner.nextInt();
		 
		 lib.checkOut(bookNum, patron);
		 
		 System.out.println(lib.toString());
	}
}
