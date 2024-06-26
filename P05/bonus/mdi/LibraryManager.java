package mdi;
import library.Library;
import library.Patron;
import library.Publication;
import library.Video;
import java.util.Scanner;
import java.io.File;
import java.nio.file.Files;

public class LibraryManager{	
	
	public LibraryManager(){
		//lib = new Library("Meowsier-Kitty Public Library");
	}

	public static void listPublications(Library lib){
		System.out.println(lib.toString());
	}

	public static void addPublication(Library lib){
		 Publication book1 = new Publication("The Assassination of Fred Hampton", "Jeffrey Haas", 2010);
		 Publication book2 = new Publication("1984", "George Orwell", 1949);
		 Publication book3 = new Publication("The Formation of Political Parties and the First National Elections in Russia", "Terence Emmons", 1983);
		 lib.addPublication(book1);
		 lib.addPublication(book2);
		 lib.addPublication(book3);
		 addVideo(lib);
	}

	public static void addVideo(Library lib){
		 Video vid1 = new Video("The search for the saddest punt in the world | Chart Party", "Jon Bois", 2019, 54);
		 Video vid2 = new Video("Deus Ex: Human Revolution is FINE, And Here's Why", "Harry Brewis", 2022, 213);
		 Video vid3 = new Video("Fear of Cold", "Jacob Geller", 2022, 47);
		 lib.addPublication(vid1);
		 lib.addPublication(vid2);
		 lib.addPublication(vid3);
	}
	
	public static void checkOutPublication(Library lib){
		int bookNum = Integer.parseInt(System.console().readLine("\nWhat item would you like to checkout(0-5): "));
		int patronInd = Integer.parseInt(System.console().readLine("\nWhich patron are you(0-1): "));
		lib.checkOut(bookNum, patronInd);
		
	}
	
	public static void checkInPublication(Library lib){
		int remBook = Integer.parseInt(System.console().readLine("\nWhat item would you like to checkIn: "));
		lib.checkIn(remBook);
	}
	
	public static void listPatrons(Library lib){
		System.out.println(lib.patronMenu());
	}
	
	public static void addPatron(Library lib){
		Patron pat1 = new Patron("Allie", "allie23@gmail.com");
		Patron pat2 = new Patron("Alex", "alexC1@gmail.com");
		lib.addPatron(pat1);
		lib.addPatron(pat2);
	}
	
	public static void main(String[] args){
	   boolean menuRun = true;
	   Library lib = new Library("Meowsier-Kitty Public Library");
	   while(menuRun){
		   try{
			 System.out.println("-------Main Menu-------");
			 System.out.println("\nPublication:");
		     System.out.println("1) List");
		     System.out.println("2) Add");
		     System.out.println("3) Check Out");
		     System.out.println("4) Check In");
		     System.out.println("\nPatrons");
		     System.out.println("5) List");
		     System.out.println("6) Add");
		     System.out.println("\nExit");
		     System.out.println("0) Exit");
		     int selection = Integer.parseInt(System.console().readLine("\nSelection: "));
		     if(selection == 1 )
		     	listPublications(lib);
		     else if(selection == 2)
		     	addPublication(lib);
		     else if(selection == 3)
		     	checkOutPublication(lib);
		     else if(selection == 4)
		     	checkInPublication(lib);
		     else if(selection == 5)
		     	listPatrons(lib);
		     else if(selection == 6)
		     	addPatron(lib);
		     else if(selection == 0)
		     	menuRun = false;
		     else throw new IllegalArgumentException("your selection, " + selection + ", must be between 0 and 6");
			}
			catch(Exception e){
			 System.err.println("Unable to checkout a publication\n" + e);
			 menuRun = false;
			}
		}
	}
}
