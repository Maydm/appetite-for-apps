public class OneOfEachArray {
    public static void main(String[] args) {
        byte[] byteArray; // what happens if you try to compile when this line is commented out?
        byteArray = new byte[2];
        byteArray[0] = -128;
        byteArray[1] = 127;

        short[] shortArray = new short[2];
        shortArray[0] = -32768;
        shortArray[1] = 32767;

        int[] intArray = new int[2];
        intArray[0] = -2^31;
        intArray[1] = 2^31-1;

        long[] longArray = new long[2];
        longArray[0] = -2^63;
        longArray[1] = 2^63-1;

        float[] floatArray = new float[2];
        floatArray[0] = 2^-126;
        floatArray[1] = 2^127;

        double[] doubleArray = new double[2];
        doubleArray[0] = 3.1415926535;
        doubleArray[1] = -3.1415926535;

        char[] charArray = new char[2];
        charArray[0] = '\u0000';
        charArray[1] = '\uffff';

        String[] stringArray = new String[2];
        stringArray[0] = "Zeroth index";
        stringArray[1] = "First index";
    }
}