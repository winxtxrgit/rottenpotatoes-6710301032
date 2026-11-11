package th.ac.cdti.rottenpotatoes;

/** A tiny class so the template builds green on day one. Students add FizzBuzz next to it. */
public final class Greeting {
  private Greeting() {}

  /** Returns a greeting: {@code hello("Potato")} gives {@code "Hello, Potato!"}. */
  public static String hello(String name) {
    return "Hello, " + name + "!";
  }
}
