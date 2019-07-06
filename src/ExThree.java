
public class ExThree {
    public static void main(String[] args) {
        System.out.println("Starting Calculation");
        int x = 0, y = 0, z = 0; //local variables must be initialized before use
        try {
            System.out.println("Started Try");
            x = Integer.parseInt(args[0]);
            y = Integer.parseInt(args[1]);
            z = x / y;
            System.out.println("Try Completed");
        } catch (ArithmeticException e) {
            System.out.println("Catch Started");
            z = x / Integer.parseInt(args[2]);
            System.out.println("Catch Completed");
        } finally{
            System.out.println("--------FINALLY RUNNING---------");
        }
        
        System.out.println("Result : " + z);
        System.out.println("End-of-Main");
    }
}
