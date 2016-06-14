package com.steel_eyed.FizzBuzz;

import java.util.Scanner;

public class Main {
    /**
     * Prints out to System.out Fizz Buzz values from start to end.
     *
     * @param start int
     * @param end   int
     */
    private static void fizzBuzz( int start, int end ) {
        for( int i = start; i <= end; i++ ) {
            System.out.println( isFizzBuzz( i ) );
        }
    }

    /**
     * Calls fizzBuzz starting from 1 to end.
     *
     * @param end int
     */
    private static void fizzBuzz( int end ) {
        fizzBuzz( 1, end );
    }

    /**
     * Returns "Fizz", "Buzz", "Fizz Buzz" or n dependent on n.
     *
     * @param n int
     * @return String
     */
    public static String isFizzBuzz( int n ) {
        String output = "";
        if( n % 3 == 0 )
            output += "Fizz";
        if( n % 5 == 0 )
            output += ( output.equals( "" ) ? "" : " " ) + "Buzz";
        if( output.equals( "" ) )
            output += n;
        return output;
    }

    public static void main( String[] args ) {
        Scanner in = new Scanner( System.in );
        int start = 0, end = 0;
        System.out.print( "Enter either 1 to do one number or 2 to enter a range: " );
        int selection = in.nextInt();
        if( selection == 1 ) {
            System.out.print( "Enter number: " );
            start = in.nextInt();
            System.out.println( isFizzBuzz( start ) );
        } else {
            System.out.print( "Enter Start number: " );
            start = in.nextInt();
            System.out.print( "Enter End number: " );
            end = in.nextInt();
            fizzBuzz( start, end );
        }
    }
}
