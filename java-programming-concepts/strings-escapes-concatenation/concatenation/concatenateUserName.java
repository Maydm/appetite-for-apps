import java.util.Scanner;

public class concatenateUserName {
    public static void main(String[] args) {
        String firstName;
        String middleName;
        String lastName;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is your first name? ");
        firstName = keyboard.next();

        System.out.print("What is your middle name? ");
        middleName = keyboard.next();

        System.out.print("What is your last name? ");
        lastName = keyboard.next();
        
        String fullName = firstName + " " + middleName + " " + lastName;

        System.out.println("Pleased to meet you " + fullName + ".");
    }
}