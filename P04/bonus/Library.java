import java.util.ArrayList;

public class Library{
	private String name;
	private ArrayList <Publication> publications = new ArrayList<Publication>();
	private ArrayList <Patron> patrons = new ArrayList<Patron>();
	
	public Library(String name){
	   this.name = name;
	}
	
	public void addPublication(Publication publication){
	   publications.add(publication);
	}
	
	public void addPatron(Patron patron){
	   patrons.add(patron);
	}
	
	public void checkOut(int publicationIndex, int patronIndex){
	   publications.get(publicationIndex).checkOut(patrons.get(patronIndex));
	}
	
	public String patronMenu(){
	   StringBuilder patMenu = new StringBuilder();
	   patMenu.append("\nPatrons:");
	   for(int i = 0; i < patrons.size(); i++){
	      patMenu.append("\n").append(i).append(")").append(patrons.get(i));
	      patMenu.append(" ");
	   }
	   
	   return patMenu.toString();
	}
	
	@Override
	public String toString(){
	   StringBuilder lib_toString = new StringBuilder();
	   lib_toString.append("\n").append(name).append("\n");
	   for(int i = 0; i < publications.size(); i++){
	      lib_toString.append("\n").append(i).append(")").append(publications.get(i));
	   }
	   
	   return lib_toString.toString();
	}
}
