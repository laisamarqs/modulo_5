import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {

    @Test
    public void testFibonacciWithZero() {
        assertEquals(0, Fibonacci.fibonacci(0));
    }

    @Test
    public void testFibonacciWithOne() {
        assertEquals(1, Fibonacci.fibonacci(1));
    }

    @Test
    public void testFibonacciWithLargeNumber() {
        assertEquals(55, Fibonacci.fibonacci(10));
    }
}

//testFibonacciWithZero: Verifica se o resultado da chamada fibonacci(0) retorna 0.
//testFibonacciWithOne: Verifica se o resultado da chamada fibonacci(1) retorna 1.
//testFibonacciWithLargeNumber: Verifica se o resultado da chamada fibonacci(10)
//retorna 55, que é o décimo número na sequência de Fibonacci (0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55).
