package th.ac.cdti.rottenpotatoes;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {
    @Test void oneIsOne()          { assertThat(FizzBuzz.of(1)).isEqualTo("1"); }
    @Test void threeIsFizz()       { assertThat(FizzBuzz.of(3)).isEqualTo("Fizz"); }
    @Test void fiveIsBuzz()        { assertThat(FizzBuzz.of(5)).isEqualTo("Buzz"); }
    @Test void fifteenIsFizzBuzz() { assertThat(FizzBuzz.of(15)).isEqualTo("FizzBuzz"); }
}