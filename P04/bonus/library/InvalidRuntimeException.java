package library;
import java.lang.ArithmeticException;

public class InvalidRuntimeException extends ArithmeticException{
   
   public InvalidRuntimeException(){
      super();
   }
   
   public InvalidRuntimeException(String message){
      super(message);
   }
   
   public InvalidRuntimeException(String title, int runtime){
      throw new IllegalArgumentException(title + " has invalid runtime " + runtime);
   }
}
