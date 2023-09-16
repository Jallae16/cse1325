package library;
import java.time.Duration;

public class Video extends Publication{
   private Duration runtime;
   
   public Video(String title, String author, int copyright, int runtime){
      super(title, author, copyright);
      this.runtime = Duration.ofMinutes(runtime);
   }  
   
   @Override
   public String toString(){
      StringBuilder vid_toString = new StringBuilder();
      vid_toString.append("Video: " + super.toString());
      vid_toString.append(", with a runtime of " + runtime.toMinutes() + " minutes");
      
      return vid_toString.toString();
      
   }
}
