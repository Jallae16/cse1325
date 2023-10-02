package mdi;
import library.Library;
import library.Patron;
import library.Publication;
import library.Video;
import java.util.Scanner;

public class LibraryManager{

	public LibraryManager(){
		
	}

	public void listPublications(){
		
	}

	public void addPublication(){
		
	}

	public void addVideo(){
		
	}
	
	public void checkOutPublication(){
		
	}
	
	public void checkInPublication(){
		
	}
	
	public void listPatrons(){
		
	}
	
	public void addPatron(){
		
	}
	
	public void loadData(){
	
	}
	
	public static void main(String[] args){
	   try{
		 Library lib = new Library("Meowsier-Kitty Public Library");
		 Publication book1 = new Publication("The Assassination of Fred Hampton", "Jeffrey Haas", 2010);
		 Publication book2 = new Publication("1984", "George Orwell", 1949);
		 Publication book3 = new Publication("The Formation of Poltiical Parties and the First National Elections in Russia", "Terence Emmons", 1983);
		 
		 Video vid1 = new Video("The search for the saddest punt in the world | Chart Party", "Jon Bois", 2019, 54);
		 Video vid2 = new Video("Deus Ex: Human Revolution is FINE, And Here's Why", "Harry Brewis", 2022, 213);
		 Video vid3 = new Video("Fear of Cold", "Jacob Geller", 2022, 47);
		 
		 //System.out.println(vid1.toString());
		 
		 lib.addPublication(book1);
		 lib.addPublication(book2);
		 lib.addPublication(book3);
		 lib.addPublication(vid1);
		 lib.addPublication(vid2);
		 lib.addPublication(vid3);
		 
		 System.out.println(lib.toString());
		 
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("\nWhat item would you like to checkout: ");
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
		catch(Exception e){
		 System.err.println("Unable to checkout a publication\n" + e);
		}
	}
}
