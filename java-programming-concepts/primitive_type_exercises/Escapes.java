public class Escapes {
    public static void main( String[] args ) {
        // Remember this is a comment. Use this to explain difficult bits of code
        /* This is a multi
           line comment
        */
        System.out.print( "\tI am a tab. \t I have tabbed again." );
        System.out.print( "\nLet's\nStart\nA\nNew\nLine\nFor\nEvery\nWord!" );
        System.out.println( "Escape quotations: \" \n Escape backslash \\ " );
        System.out.println( "Let's see what happens: \\\\ " );
        System.out.println( "What if I // write a comment in a string?" );
        System.out.println( "hmm /* How about this? */\n\n-------------" );
        
        System.out.println( "Concatonation" + "fun" );
        
        String con, cat, on, ation;
        
        con = "con";
        cat = "cat";
        on = "on";
        ation = "ation";
        
        System.out.print( "You ready for this? When I say " + con );
        System.out.println(" you say " + cat );
        System.out.print( con );
        System.out.println( cat );
        System.out.print( con );
        System.out.println( cat );
        System.out.println( "Now when I say " + on + " you say " + ation );
        System.out.print( on );
        System.out.println( ation );
        System.out.println( "Now put it all together!" );
        System.out.println( con + cat + on + ation );
    }
}
