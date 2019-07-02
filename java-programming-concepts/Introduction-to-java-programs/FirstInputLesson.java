import java.util.Scanner; // Allows us to input information into the program

public class FirstInputLesson {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);  // Creates and names a scanner object 
        System.out.println( "What is your name?" );
        keyboard.next();
        
        System.out.println( "What is 4 less than 71?" );
        keyboard.nextInt();
        
        System.out.println( "Enter a number between 0.0 and 1.0." );
        keyboard.nextDouble();
        
        System.out.println( "What have you learned today?" );
        keyboard.next();
    }
}
