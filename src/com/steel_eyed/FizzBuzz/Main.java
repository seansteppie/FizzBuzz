package com.steel_eyed.FizzBuzz;

public class Main {
    /**
     * Prints out to System.out Fizz Buzz values from start to end
     *
     * @param start int
     * @param end int
     */
    private static void fizzBuzz( int start, int end ) {
        for ( int i = start; i <= end; i++ ) {
            System.out.println( isFizzBuzz( i ) );
        }
    }

    /**
     * Returns "Fizz", "Buzz", "Fizz Buzz" or n dependent on n.
     *
     * @param n int
     * @return String
     */
    public static String isFizzBuzz( int n ) {
        String output = "";
        if ( n % 3 == 0 )
            output += "Fizz";
        if ( n % 5 == 0 )
            output += ( output.equals( "" ) ? "" : " " ) + "Buzz";
        if ( output.equals( "" ) )
            output += n;
        return output;
    }

    /**
     * Calls fizzBuzz starting from 1 to end.
     *
     * @param end int
     */
    private static void fizzBuzz( int end ) {
        fizzBuzz( 1, end );
    }

    public static void main( String[] args ) {
        fizzBuzz( 100 );
    }
}
