package library;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;

/**
  * Has data of a patron of the library
  *
  * @author   Jacob Mathew
  * @version  1.0
  * @since    1.0
  *
  */

public class Patron{
	private String name;
	private String email;
	
	/**
	  * Creates a Patron instance
	  *
	  * @param name    The name of the patron
	  * @param email   The email of the patron
	  * @since         1.0
	  *
	  */
	
	public Patron(String name, String email){
	   this.name = name;
	   this.email = email;
	}
	/**
	  *
	  * Returns the name and email in the form of name (email).
	  *
	  * @return    String of name and email
	  * @since     1.0
	  *
	  */
	@Override
	public String toString(){
	   return name + " (" + email + ")";
	}
}
