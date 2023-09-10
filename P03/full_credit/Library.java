import java.util.ArrayList;

public class Library{
	private String name;
	private ArrayList <Publication> publications = new ArrayList<Publication>();
	
	public Library(String name){
	   this.name = name;
	}
	public void addPublication(Publication publication){
	   publications.add(publication);
	}
	
	public void checkOut(int publicationIndex, String patron){
	   publications.get(publicationIndex).checkOut(patron);
	}
	
	@Override
	public String toString(){
	   StringBuilder lib_toString = new StringBuilder();
	   lib_toString.append("\n").append(name).append("\n");
	   for(Publication p : publications){
	      lib_toString.append("\n").append(p).append(") ").append(publications.get(p));
	   }
	   
	   return lib_toString.toString();
	}
}
