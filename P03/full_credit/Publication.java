import java.time.LocalDate;

public class Publication{
   private String title;
   private String author;
   private int copyright;
   private String loanedTo;
   private LocalDate dueDate;
   
   public Publication(String title, String author, int copyright){
      this.title = title;
      this.author = author;
      this.copyright = copyright;
   }
   
   public void checkOut(String patron){
      
   }
   
   public void checkIn(){
      
   }
   
   @Override
   public String toString(){
      
   }
}
