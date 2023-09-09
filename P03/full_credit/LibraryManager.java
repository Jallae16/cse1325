public class LibraryManager{
	public static void main(String[] args){
		 Library lib = new Library("Meowsier-Kitty Public Library");
		 Publication book1 = new Publication("meow", "kat", 1953);
		 
		 lib.addPublication(book1);
		 
		 System.out.println(lib.toString());
	}
}
