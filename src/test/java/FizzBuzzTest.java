import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {
// Ejemplo de tests, se crea un test por cada casuistica
    /*
    Si el número es divisible por 3, retorna “Fizz”
    Si el número es divisible por 5, retorna “Buzz”
    Si el número es divisible por 3 y por 5, retorna “FizzBuzz”
    En otro caso, retorna el mismo número
    */

    @Test
    public void fizz_when_num_is_divisible_by_3() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(6));
    }

    @Test
    public void buzz_when_num_is_divisible_by_5() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
    }

    @Test
    public void fizzBuzz_when_num_is_divisible_by_3_and_5() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(30));
    }

    @Test
    public void same_num_when_is_not_divisble_by_3_or_5() {
        assertEquals("2", FizzBuzz.fizzBuzz(2));
        assertEquals("16", FizzBuzz.fizzBuzz(16));
    }
}