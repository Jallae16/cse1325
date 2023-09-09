import java.time.LocalDate;

public class Publication{
   private String title;
   private String author;
   private int copyright;
   private String loanedTo;
   private LocalDate dueDate;
   
   public Publication(String title, String author, int copyright){
      if(copyright < 1900 || copyright > dueDate.getYear()){
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
      return "The Great " + author + " wrote " + title +
      		 ", with its copyright active since " + copyright + 
      		 "\n>loaned to the incredible, beautiful, and The GOAT: " + loanedTo + 
      		 " until they must concede the book back to the library on " + dueDate;
   }
}
