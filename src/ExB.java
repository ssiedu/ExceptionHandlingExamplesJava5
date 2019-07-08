
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExB {
    public static void f2(){
        try {
            ExA.f1();
        } catch (InterruptedException ex) {
           
        }
    }
}
