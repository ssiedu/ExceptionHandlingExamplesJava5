
public class ExOne {

    public static void main(String[] args) {
        System.out.println("Starting Calculation");
        int x = 0, y = 0, z=0; //local variables must be initialized before use
        try {
            System.out.println("Started Try");
            x = Integer.parseInt(args[0]);
            y = Integer.parseInt(args[1]);
            z = x / y;
        }catch(ArithmeticException e){
            System.out.println("ArithmeticException Handled");
                try{
                    z=x/Integer.parseInt(args[2]);
                }catch(ArrayIndexOutOfBoundsException e1){
                    z=x/2;
                }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Insufficient Values");
        }catch(NumberFormatException e){
            System.out.println("Invalid Numbers");
        }
            

        System.out.println("Result : " + z);
        System.out.println("End-of-Main");
    }
}
