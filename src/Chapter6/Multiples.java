package Chapter6;

import java.util.Scanner;

public class Multiples {

    public void checkMultiples(){
        Scanner input = new Scanner( System.in );

        int first;
        int second;
        System.out.print( "Enter first number (0 to exit): " );

        first = input.nextInt();


        while ( first != 0 ) {
            System.out.print( "Enter second number: " );
            second = input.nextInt();

            if ( multiple( first, second ) )
                System.out.printf( "%d is a multiple of %d\n", second, first );
            else
            System.out.printf( "%d is not a multiple of %d\n", second, first );

            System.out.print( "Enter first number (0 to exit): " );
            first = input.nextInt();
            }
        }

        public boolean multiple( int firstNumber, int secondNumber ) {
        return secondNumber % firstNumber == 0;
        }
 }