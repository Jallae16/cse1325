package library;
import java.time.Duration;

/**
  * A video that can be checked out
  *
  * @author   Jacob Mathew
  * @version  1.0
  * @since    1.0
  *
  */

public class Video extends Publication{
   private Duration runtime;
   
   /**
	  * Constructs a Video and checks for valid runtime
	  *
	  * @param title        Title of video
	  * @param author       Author of video
	  * @param copyright    copyright year for the video
	  * @param runtime      runtime of video
	  * @since         1.0
	  *
	  */
	  
   public Video(String title, String author, int copyright, int runtime){
      super(title, author, copyright);
      if(runtime <= 0)
      	throw new InvalidRuntimeException(title, runtime);
      this.runtime = Duration.ofMinutes(runtime);
   }  
   /**
	  *
	  * Returns information about the video
	  *
	  * @return    String of Video title, author, copyright, and runtime
	  * @since     1.0
	  *
	  */
   @Override
   public String toString(){
      StringBuilder vid_toString = new StringBuilder();
      vid_toString.append("Video: " + "with a runtime of " + runtime.toMinutes() + " mintues, ");
      vid_toString.append(super.toString());
      
      return vid_toString.toString();
      
   }
}
