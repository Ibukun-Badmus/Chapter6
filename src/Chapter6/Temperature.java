package Chapter6;

import java.util.Scanner;

public class Temperature {

    public void convertTemperatures() {
        Scanner input = new Scanner( System.in );
        int choice;

        do {
            System.out.println( "1. Fahrenheit to Celsius" );
            System.out.println( "2. Celsius to Fahrenheit" );
            System.out.println( "3. Exit" );
            System.out.print( "Choice: " );
            choice = input.nextInt();

            if ( choice != 3 ) {
                System.out.print( "Enter temperature: " );
                int oldTemperature = input.nextInt();

                switch ( choice ) {
                    case 1:
                        System.out.printf( "%d Fahrenheit is %d Celsius\n",
                                oldTemperature, celsius( oldTemperature ) );
                        break;
                        case 2:
                            System.out.printf( "%d Celsius is %d Fahrenheit\n",
                                    oldTemperature, fahrenheit( oldTemperature ) );
                            break;
                }
                    }
                } while ( choice != 3 );
            }

        public int celsius( int fahrenheitTemperature ) {
            return ( (int) ( 5.0 / 9.0 * ( fahrenheitTemperature - 32 ) ) );
            }


    public int fahrenheit( int celsiusTemperature ) {
        return ( (int) ( 9.0 / 5.0 * celsiusTemperature + 32 ) );
        }
        }
