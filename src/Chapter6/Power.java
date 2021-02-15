package Chapter6;

import java.util.Scanner;

public class Power {

  public void calculate() {

        Scanner input = new Scanner( System.in );
        System.out.print( "Enter base: " );

        int base = input.nextInt();
        System.out.print( "Enter exponent (negative to quit): " );

        int exponent = input.nextInt();

        while ( exponent >= 0 ) {
            System.out.printf( "%d to the %d is %d\n", base, exponent, integerPower( base, exponent ) );
            System.out.print( "Enter base: " );
            base = input.nextInt();
            System.out.print( "Enter exponent (negative to quit): " );
            exponent = input.nextInt();
            }
        }

        public int integerPower( int base, int exponent ){
        int product = 1;

        for ( int i = 1; i <= exponent; i++ )
            product *= base;
            return product;
        }
 }
