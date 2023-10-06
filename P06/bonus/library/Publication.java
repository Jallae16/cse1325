package library;
import java.time.LocalDate;
import java.util.Date;
import java.util.Calendar;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;

/**
  * An item in the library that can be checked out
  *
  * @author   Jacob Mathew
  * @version  1.0
  * @since    1.0
  *
  */


public class Publication{
   private String title;
   private String author;
   private int copyright;
   private Patron loanedTo;
   private LocalDate dueDate;
   
   /**
	  * Constructs a Publication and checks for valid copyright
	  *
	  * @param title        Title of video
	  * @param author       Author of video
	  * @param copyright    copyright year for the video
	  * @since         1.0
	  *
	  */
   
   public Publication(String title, String author, int copyright){
      if(copyright < 1900 || copyright > Calendar.getInstance().get(Calendar.YEAR)){
         throw new IllegalArgumentException("Invalid Copyright date");
      }
      
      this.title = title;
      this.author = author;
      this.copyright = copyright;
   }
   
   /**
     * Sets duedate of the Publication and saves who checked out the publication
     *
     * @param patron    name of patron
     * @since 1.0
     */
   
   public void checkOut(Patron patron){
      loanedTo = patron;
      dueDate = LocalDate.now().plusDays(14);
   }
   /**
     * Sets loanedTo to NULL
     *
     * @since 1.0
     */
   public void checkIn(){
      loanedTo = null;
   }
   
   /**
	  *
	  * Returns information about the publication
	  *
	  * @return    String of title, author, copyright in a delightful sentence
	  * @since     1.0
	  *
	  */
     
   public Publication(BufferedReader br) throws IOException{
      if(copyright < 1900 || copyright > Calendar.getInstance().get(Calendar.YEAR)){
         throw new IllegalArgumentException("Invalid Copyright date");
      }
      
      this.title = br.readLine();
      this.author = br.readLine();
      this.copyright = Integer.parseInt(br.readLine());
      if(br.readLine().equals("checked in")){
         dueDate = null;
         loanedTo = null;
      }
      //this.loanedTo = br.readLine();
      this.dueDate = LocalDate.parse(br.readLine());
   }   
   public void save(BufferedWriter bw) throws IOException{
      bw.write(title + '\n');
      bw.write(author + '\n');
      bw.write("" + copyright + '\n');
      if(loanedTo == null){ 
      	bw.write("checked in" + '\n');
      	loanedTo.save(bw);
      }
      else if(loanedTo != null){
      	bw.write("checked out" + '\n');
      	loanedTo.save(bw);
      }
      bw.write("" + LocalDate.now().plusDays(14) + '\n');
   }
   
   @Override
   public String toString(){
      StringBuilder pub_toString = new StringBuilder();
      pub_toString.append("The Great ").append(author).append(" wrote ");
      pub_toString.append(title).append(", with its copyright active since ");
      pub_toString.append(copyright);
      if(loanedTo != null)
         pub_toString.append("\n>>>>loaned to the incredible, beautiful, and The GOAT, ").append(loanedTo).append(", until they must concede the item back to the library on ").append(dueDate);
      return pub_toString.toString();
   }
}
