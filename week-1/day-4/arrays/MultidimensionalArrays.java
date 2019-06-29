public class MultidimensionalArrays {
    public static void main (String[] args) {
        String[][] statesAndCapitols = {{"Madison", "Springfield", "Rochester"}, {"Wisconsin", "Illinois", "Minnesota"}};
        int[][][] numberMatrix = {{{2, 4, 6}, {5, 10, 15}}, {{10, 20, 30, 20, 40, 60, 30, 60, 90}}};

        // Print a value in a multidimensional array by recalling
        // the appropriate number of indices. 
        // In a 2D array, the first index calls the array grouping
        // that you want to access and the second index calls the 
        // element within that array. 
        // In a 3D array you must call the first two array groupings
        // followed by the element desired.

        System.out.println(statesAndCapitols[0][0]);
        System.out.println(numberMatrix[1][0][8]);

        // We can also save a value in the multidimensional array
        // to a variable or another array.


        int myFavoriteNumber = numberMatrix[0][1][2];

        String[] myStateAndCapitol;
        myStateAndCapitol = new String[2];
        myStateAndCapitol[0] = statesAndCapitols[0][0];
        myStateAndCapitol[1] = statesAndCapitols[1][0];

        System.out.println(myFavoriteNumber);
        System.out.println(myStateAndCapitol[0] + ", " + myStateAndCapitol[1]);
    }
}