package th.ac.cdti.rottenpotatoes;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class GreetingTest {
  @Test
  void helloGreetsByName() {
    assertThat(Greeting.hello("Potato")).isEqualTo("Hello, Potato!");
  }
}
