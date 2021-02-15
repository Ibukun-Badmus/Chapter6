package Chapter6;

import java.util.Scanner;

public class Triangle {

    public void calculateHypotenuse(){
       Scanner input = new Scanner( System.in );

         double side1;
        double side2;

        System.out.print( "Enter side 1 (negative to quit): " );
        side1 = input.nextDouble();

        while ( side1 > 0 ) {
            System.out.print( "Enter side 2: " );
            side2 = input.nextDouble();
            System.out.printf( "Hypotenuse is: %f\n", hypotenuse( side1, side2 ) );

            System.out.print( "Enter side 1 (negative to quit): " ); side1 = input.nextDouble();
            }
        }

 public double hypotenuse( double side1, double side2 ){
        double hypotenuseSquared = Math.pow( side1, 2 ) +
                 Math.pow( side2, 2 );
       return Math.sqrt( hypotenuseSquared );
        }
 }

