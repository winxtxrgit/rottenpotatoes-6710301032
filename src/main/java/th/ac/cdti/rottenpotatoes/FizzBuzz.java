package th.ac.cdti.rottenpotatoes;

public final class FizzBuzz {
    private FizzBuzz() {}

    public static String of(int n) {
        if (n % 15 == 0) {
            return "FizzBuzz";  // ตรวจ 15 ก่อน 3 และ 5
        }
        if (n % 3 == 0) {
            return "Fizz";
        }
        if (n % 5 == 0) {
            return "Buzz";
        }
        return Integer.toString(n);
    }
}