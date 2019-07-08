
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExA {
    public static void f1() throws InterruptedException{
            Thread.sleep(100);
            
        try {
            Class.forName("abc");
        } catch (ClassNotFoundException ex) {
            
        }
            
            
            
    }
}
