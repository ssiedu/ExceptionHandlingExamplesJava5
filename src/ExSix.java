
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ExSix {
    public static void main(String[] args) {
        
        String fname=args[0];//1st element
        try {
            FileInputStream fis=new FileInputStream(fname);
        } catch (FileNotFoundException ex) {
            
        }
        
    }
}
