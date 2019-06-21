public class LastIndexOfString {
    public static void main (String[] args) {
        String statement = "Maydm is Made By Them, My Maydm is Made By Me! I'm learning to code in Java!";
        int position = statement.lastIndexOf("Maydm");
        int location = statement.lastIndexOf("Made");

        System.out.println("Position of Maydm: " + position); // returns position of last occurance of Maydm
        System.out.println("Position of Made: " + location); // returns first position of last iteration of Made
        System.out.println("the last '!' is at position " + statement.lastIndexOf("!"));
    }
}