import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class Task2_1Test {

    @Test
    public void ShouldReturnSumOfDigits() {
        assertEquals("Success", 4, Task2_1.intMethod(2,2));
    }

    @Test
    public void shouldReturnHelloString() {
        assertEquals("Test returned hello","Hello",Task2_1.hello());
    }

    @Test (expected = ArrayIndexOutOfBoundsException.class)
    public void shouldThrowArrayIndexOutOfBoundsException() {
        Task2_1.exceptionThrower();
    }

    @Test (timeout = 100)
    public void timeoutTest() {
        for (int i = 0; i < 1; i++) {

        }
    }
}