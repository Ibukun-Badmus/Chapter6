package Chapter6;

import java.util.Scanner;
public class Round {

  public void printRoundings() {
         Scanner input = new Scanner( System.in );

        System.out.printf( "%s\n%s\n %s\n %s\n", "Enter decimal numbers.",
                "Type the end-of-file indicator to terminate input:",
                 "On UNIX/Linux/Mac OS X type <ctrl> d then press Enter",
                "On Windows type <ctrl> z then press Enter" );

        while ( input.hasNext() ) {
            double x = input.nextDouble();

           System.out.printf( "The number: %f\n", x);
           System.out.printf( "rounded to Integer: %f\n", roundToInteger( x ) );
           System.out.printf( "rounded to Tenth: %f\n", roundToTenths( x ) );
           System.out.printf( "rounded to Hundredth: %f\n", roundToHundredths( x ) );
           System.out.printf( "rounded to Thousandth: %f\n", roundToThousandths( x ) );
        }
        }

         public double roundToInteger( double number ) {
        return( Math.floor( number + .5 ) );
        }


         public double roundToTenths( double number ) {
         return( Math.floor( number * 10 + .5 ) / 10 );
        }
         public double roundToHundredths( double number ) {
        return( Math.floor( number * 100 + .5 ) / 100 );
         }
         public double roundToThousandths( double number ) {
        return( Math.floor( number * 1000 + .5 ) / 1000 );
        }
}
