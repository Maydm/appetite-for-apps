public class concatenateName {
    public static void main(String[] args) {
        String firstName = "ENTER_YOUR_NAME";
        String lastName = "ENTER_YOUR_NAME";
        String middleName = "ENTER_YOUR_NAME";
        // If you have two last or middle names then add
        // them as "middleName2" and "lastName2"

        String firstAndLastName = firstName + " " + lastName;
        String fullName = firstName + " " + middleName + " " + lastName;

        System.out.println("Most people know me as " + firstAndLastName + ".");
        System.out.println("However, my full name is " + fullName + ".");
    }
}