package library;
import java.lang.ArithmeticException;

/**
  * Thrown when a Runtime exception occurs
  *
  * @author   Jacob Mathew
  * @version  1.0
  * @since    1.0
  *
  */


public class InvalidRuntimeException extends ArithmeticException{
   
   /**
     *
     * Constructs an InvalidRuntimeException with no message
     * @since         1.0
     *
     */
     
   public InvalidRuntimeException(){
      super();
   }
   
   /**
     *
     * Constructs an InvalidRuntimeException with a message
     * 
     * @param message    message to send
     * @since            1.0
     *
     */
   
   public InvalidRuntimeException(String message){
      super(message);
   }
   
   /**
     *
     * Constructs an InvalidRuntimeException that throws a specific message for invalid runtime
     *
     * @param title     title of video
     * @param runtime   length of video
     * @since           1.0
     *
     */
   
   public InvalidRuntimeException(String title, int runtime){
      throw new IllegalArgumentException(title + " has invalid runtime " + runtime);
   }
}
