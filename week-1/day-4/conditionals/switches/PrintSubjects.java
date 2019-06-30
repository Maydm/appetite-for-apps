class PrintSubjects
{
    public static void main(String arg[])
    {
        char branch = 'M'; // C - CSE, E - ECE, M - Mech // Edit the character to see different options
        int year = 3; // Edit the year for different options
        
        switch( year )
        {
            case 1:
                System.out.println("English, Maths, Drawing");
                break;
            case 2:
                switch( branch ) // LINE C
                {
                    case 'C':
                        System.out.println("Data structures, Java, Computer Organization");
                        break;
                    case 'E':
                        System.out.println("Micro processors, Logic switching theory");
                        break;
                    case 'M':
                        System.out.println("Drawing, Manufacturing Machines");
                        break;
                }
                break;
            case 3:
                switch( branch ) // LINE D
                {
                    case 'C':
                        System.out.println("Operating System, RDBMS");
                        break;
                    case 'E':
                        System.out.println("Fundamentals of Logic Design, Microelectronics");
                        break;
                    case 'M':
                        System.out.println("Internal Combustion Engines, Mechanical Vibration");
                        break;
                }
                break;
            // Add a fourth case with new switch options
        }
    
    }
}