
public class ExFour {

    public static void main(String[] args) {
        System.out.println("Starting Calculation");
        int x = 0, y = 0, z = 0; //local variables must be initialized before use
        try {
            x = Integer.parseInt(args[0]);
            y = Integer.parseInt(args[1]);
            
            if(y>x){
                //ArithmeticException ob=new ArithmeticException();
                LargeNumberException ob=new LargeNumberException();
                throw ob;
            }
            z = x / y;
            
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Handled");
            z = x / 2;
        } catch (LargeNumberException e){
            System.out.println("You Cant Divide Small No By Larger One");
        }
        System.out.println("Result : " + z);
        System.out.println("End-of-Main");
    }
}
