package Chapter6;

import java.util.Scanner;

public class RoundingNumbers {
    public static void main( String args[] ){
        Scanner input = new Scanner( System.in );

        System.out.printf( "%s\n%s\n %s\n %s\n", "Enter decimal numbers.",
                "Type the end-of-file indicator to terminate input:",
                "On UNIX/Linux/Mac OS X type <ctrl> d then press Enter",
                "On Windows type <ctrl> z then press Enter" );

            while ( input.hasNext() ) {
            double x = input.nextDouble();
          System.out.printf( "Number: %f\tMath.floor( x + .5 ): %f\n",
                  x, Math.floor( x + .5 ) );
            }
         }
 }

