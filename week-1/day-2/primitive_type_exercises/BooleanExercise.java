import java.util.Scanner;

public class BooleanExercise {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        boolean boolA, boolB;
        double x, y;
        
        System.out.print( "Enter the first number: " );
        x = keyboard.nextDouble();
        System.out.print( "Enter a second number: " );
        y = keyboard.nextDouble();
        
        boolA = ( x <= y );
        boolB = ( y == x );
        
        System.out.println( x + " is less than or equal to " + y + ": " + boolA );
        System.out.println( y + " is equal to " + x + ": " + boolB );
    }
}
