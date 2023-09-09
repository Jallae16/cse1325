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
	   lib_toString.append(name).append("\n");
	   for(int i = 0; i < publications.size(); i++){
	      lib_toString.append(i).append(") ").append(publications.get(i));
	   }
	   
	   return lib_toString.toString();
	}
}
