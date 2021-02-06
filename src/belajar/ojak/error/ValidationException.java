package belajar.ojak.error;

/**
 * @author Abdul Rozak
 * @since 2/6/21
 */
public class ValidationException extends Throwable {

   public ValidationException(String message){
       super(message);
   }
}
