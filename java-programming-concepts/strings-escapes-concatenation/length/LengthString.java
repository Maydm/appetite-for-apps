import java.util.Scanner;

public class LengthString {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String fName = "Jane";
        String lName = "Doe";
        System.out.print("What is your first name? ");
        fName = keyboard.nextLine();
        System.out.print("What is your last name? ");
        lName = keyboard.nextLine();
        String fullName = fName + " " + lName;

        System.out.println("The length of your first name is " + fName.length() + " charcaters.");
        System.out.println("The length of your last name is " + lName.length() + " characters.");
        System.out.println("The length of your full name is " + (fullName.length() - 1) + " characters");

        if (fullName.length() <= 10) {
            System.out.println("Wow, your full name is " + (fullName.length() - 1) + " characters. \nThat must have made printing your name in kindergarden easier");
        } else if (fullName.length() >= 25) {
            System.out.println("Wow, your name is " + (fullName.length() - 1) + " characters. \nThat must take a lot of ink to write out.");
        }

        String a = "a";
        String nothing = "";
        String abc = "abc";

        System.out.println("The length of \"" + a + "\" is " + a.length());
        System.out.println("The length of \"" + nothing + "\" is " + nothing.length());
        System.out.println("The length of \"" + abc + "\" is " + abc.length());

        // What happens if you try to use Char a instead of String a?
        // what happens if you try to name String nothing as String null?
    }
}