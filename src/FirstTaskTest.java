import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstTaskTest {

    @Test
    void doubleFactorial() {
        // Базовые случаи
        assertEquals(1, FirstTask.doubleFactorialRecursive(0));
        assertEquals(1, FirstTask.doubleFactorialRecursive(1));

        // Обычные случаи
        assertEquals(15, FirstTask.doubleFactorialRecursive(5));
        assertEquals(48, FirstTask.doubleFactorialRecursive(6));

        // Через цикл
        assertEquals(1, FirstTask.doubleFactorialIterative(0));
        assertEquals(1, FirstTask.doubleFactorialIterative(1));
        assertEquals(15, FirstTask.doubleFactorialIterative(5));
        assertEquals(48, FirstTask.doubleFactorialIterative(6));
    }
}
