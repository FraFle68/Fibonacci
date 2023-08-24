import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest {
    @Test
    public void return0when0isGiven() {
        //GIVEN
        int n = 0;
        //WHEN
        int actual = Fibonacci.getFibonacci(n);
        //THEN
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void return1when1isGiven() {
        //GIVEN
        int n = 1;
        //WHEN
        int actual = Fibonacci.getFibonacci(n);
        //THEN
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void return5when5isGiven() {
        //GIVEN
        int n = 1;
        //WHEN
        int actual = Fibonacci.getFibonacci(n);
        //THEN
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void return21when8isGiven() {
        //GIVEN
        int n = 8;
        //WHEN
        int actual = Fibonacci.getFibonacci(n);
        //THEN
        int expected = 21;
        Assertions.assertEquals(expected, actual);
    }
}