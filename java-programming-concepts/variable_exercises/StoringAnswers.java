import java.util.Scanner;

public class StoringAnswers {
    public static void main( String[] args ) {
        String firstName;
        String lastName;
        int age, height, grade;
        double wages;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print( "Enter your first name. " );
        firstName = keyboard.next();
        
        System.out.print( "Ok, thank you " + firstName + ". What is your last name? " );
        lastName = keyboard.next();
        
        System.out.print( "So your name is " + firstName + " " + lastName + ". Is that correct? " );
        keyboard.next();
        
        System.out.println( "How old are you " + firstName + " " + lastName + "?" );
        age = keyboard.nextInt();
        
        System.out.println( "How tall are you in inches?" );
        height = keyboard.nextInt();
        
        System.out.print( "Wow! " + height + " inches! Amazing. " );
        System.out.println( "Ok, what grade will you be in next school year?" );
        grade = keyboard.nextInt();
        
        System.out.print( "Last question. How much money, in dollars and cents, would you like to earn after graduation? " );
        wages = keyboard.nextDouble();
        
        System.out.println( "Keep learning to expand your comfort zone and you just may earn " + wages + "!" );
    }
}
