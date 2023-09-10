import java.time.LocalDate;
import java.util.Date;
import java.util.Calendar;

public class Publication{
   private String title;
   private String author;
   private int copyright;
   private String loanedTo;
   private LocalDate dueDate;
   
   public Publication(String title, String author, int copyright){
      if(copyright < 1900 || copyright > Calendar.getInstance().get(Calendar.YEAR)){
         throw new IllegalArgumentException("Invalid Copyright date");
      }
      
      this.title = title;
      this.author = author;
      this.copyright = copyright;
   }
   
   public void checkOut(String patron){
      loanedTo = patron;
      dueDate = LocalDate.now().plusDays(14);
   }
   
   public void checkIn(){
      
   }
   
   @Override
   public String toString(){
      StringBuilder pub_toString = new StringBuilder();
      pub_toString.append("The Great ").append(author).append(" wrote ");
      pub_toString.append(title).append(", with its copyright active since ");
      pub_toString.append(copyright);
      if(loanedTo != null)
         pub_toString.append("\n>loaned to the incredible, beautiful, and The GOAT: 		 ").append(loanedTo).append(" until they must concede the book back to the 			 library on ").append(dueDate);
      return pub_toString.toString();
   }
}
