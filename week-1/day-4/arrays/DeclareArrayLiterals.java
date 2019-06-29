public class DeclareArrayLiterals {
    public static void main(String[] args) {

        String[] cities = {"Madison", "Milwaukee", "Green Bay"};
        // This array holds three strings.

        // Now let's write an array of integers
        int[] numbers = {1, 2, 4, 8, 16, 32, 64, 128};

        // Access elements in an array with bracket notation
        System.out.println(cities[0]);
        System.out.println(cities[1]);

        // TODO: Access the first, second, and last elements in the array "numbers"


        // Let's change the values in the arrays
        cities[0] = "Chicago";
        cities[1] = "St. Paul";
        // TODO: Change the third element to a new city in the cities array.

        // TODO: Change the third, fourth, and fifth elements in the numbers array.


    }
}

// What now? 

// How many indices would there be in the cities array if we only used
//  one set of quotation marks? i.e. "Madison, Milwaukee, Green Bay"

// What happens if you try to place a string in the numbers array?
// What will happen if you place an integer in the strings array?
// What about adding a double or a float to the numbers array?
// Write your own array in this new way. 