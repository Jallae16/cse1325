package library;
import java.util.ArrayList;

/**
  * A library that contains publications
  *
  * @author   Jacob Mathew
  * @version  1.0
  * @since    1.0
  *
  */


public class Library{
	private String name;
	private ArrayList <Publication> publications = new ArrayList<Publication>();
	private ArrayList <Patron> patrons = new ArrayList<Patron>();
	
	/**
	  * Constructs a library
	  *
	  * @param name  name of library
	  * @since 1.0
	  */
	
	public Library(String name){
	   this.name = name;
	}
	
	/**
	  * Adds publication to an ArrayList
	  *
	  * @param publication   the publication to be added
	  * @since 1.0
	  */ 
	
	public void addPublication(Publication publication){
	   publications.add(publication);
	}
	
	/**
	  * Adds patron to an ArrayList
	  *
	  * @param publication   the patron to be added
	  * @since 1.0
	  */ 
	
	public void addPatron(Patron patron){
	   patrons.add(patron);
	}
	
	/**
	  * Checks out publication for a patron
	  *
	  * @param publicationIndex    the location of the publication in ArrayList
	  * @param patronIndex         the location of the patron in ArrayList
	  * @since 1.0
	  * 
	  */
	
	public void checkOut(int publicationIndex, int patronIndex){
	   publications.get(publicationIndex).checkOut(patrons.get(patronIndex));
	}
	
	public int checkInPublication(int publicationIndex){
		return 0;
	}
	
	/**
	  * Creates a menu of patrons of the library
	  *
	  * @return returns the menu of patrons
	  * @since 1.0
	  */
	
	public String patronMenu(){
	   StringBuilder patMenu = new StringBuilder();
	   patMenu.append("\nPatrons:");
	   for(int i = 0; i < patrons.size(); i++){
	      patMenu.append("\n").append(i).append(")").append(patrons.get(i));
	      patMenu.append(" ");
	   }
	   
	   return patMenu.toString();
	}
	
	/**
	  *
	  * Returns all the publications in the library
	  *
	  * @return    String of all publications
	  * @since     1.0
	  *
	  */
	
	@Override
	public String toString(){
	   StringBuilder lib_toString = new StringBuilder();
	   
	   lib_toString.append("\n").append(name).append("\n");
	   for(int i = 0; i < publications.size()/2; i++){
	      lib_toString.append("\n").append(i).append(") Book: ").append(publications.get(i));
	   }
	   for(int i = publications.size()/2; i < publications.size(); i++){
	      lib_toString.append("\n").append(i).append(")").append(publications.get(i));
	   }
	   
	   return lib_toString.toString();
	}
}
