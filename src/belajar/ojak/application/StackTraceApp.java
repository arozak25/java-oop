package belajar.ojak.application;

/**
 * @author Abdul Rozak
 * @since 2/6/21
 */
public class StackTraceApp {

    public static void main(String[] args) {

        try{
            sampleError();
        }catch (RuntimeException exception){
            exception.printStackTrace();
        }
    }

    public static void sampleError(){
        try{
            String[] names = {
                    "ojak", "ojakun"
            };

            System.out.println(names[100]);
        }catch (Throwable throwable){
            throw new RuntimeException(throwable);
        }
    }
}
