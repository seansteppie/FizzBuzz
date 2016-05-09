import org.junit.Test;

import static com.steel_eyed.FizzBuzz.Main.isFizzBuzz;
import static org.junit.Assert.assertTrue;

public class FizzBuzzTest {
    @Test
    public void fizzTest() {
        assertTrue( isFizzBuzz( 3 ).equals( "Fizz" ) );
        assertTrue( isFizzBuzz( 6 ).equals( "Fizz" ) );
        assertTrue( isFizzBuzz( 9 ).equals( "Fizz" ) );
    }
    @Test
    public void buzzTest() {
        assertTrue( isFizzBuzz( 5 ).equals( "Buzz" ) );
        assertTrue( isFizzBuzz( 10 ).equals( "Buzz" ) );
        assertTrue( isFizzBuzz( 20 ).equals( "Buzz" ) );
    }
    @Test
    public void digitTest() {
        assertTrue( isFizzBuzz( 1 ).equals( "1" ) );
        assertTrue( isFizzBuzz( 2 ).equals( "2" ) );
        assertTrue( isFizzBuzz( 4 ).equals( "4" ) );
    }
    @Test
    public void fizzBuzzTest() {
        assertTrue( isFizzBuzz( 15 ).equals( "Fizz Buzz" ) );
        assertTrue( isFizzBuzz( 30 ).equals( "Fizz Buzz" ) );
        assertTrue( isFizzBuzz( 45 ).equals( "Fizz Buzz" ) );
    }
}