public class ExTwo {

    public static void main(String[] args) {
        System.out.println("Starting Calculation");
        int x = 0, y = 0, z=0; //local variables must be initialized before use
        try {
            System.out.println("Started Try");
            x = Integer.parseInt(args[0]);
            y = Integer.parseInt(args[1]);
            z = x / y;
        }catch(ArithmeticException e){
                    z=x/2;
        }catch(ArrayIndexOutOfBoundsException | NumberFormatException e){
            System.out.println("Wrong Inputs");
        }catch(Exception e){
            System.out.println("Unknown Errors");
        }
            

        System.out.println("Result : " + z);
        System.out.println("End-of-Main");
    }
}
