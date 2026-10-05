import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstTaskTest {

    @Test
    void doubleFactorial() {
        // 1. Базовые случаи (n == 0 и n == 1)
        assertEquals(1, FirstTask.doubleFactorialRecursive(0));
        assertEquals(1, FirstTask.doubleFactorialRecursive(1));

        // 2. Обычные случаи из задания (5!! = 15, 6!! = 48)
        assertEquals(15, FirstTask.doubleFactorialRecursive(5));
        assertEquals(48, FirstTask.doubleFactorialRecursive(6));

        // То же самое для итеративного метода (через цикл)
        assertEquals(1, FirstTask.doubleFactorialIterative(0));
        assertEquals(1, FirstTask.doubleFactorialIterative(1));
        assertEquals(15, FirstTask.doubleFactorialIterative(5));
        assertEquals(48, FirstTask.doubleFactorialIterative(6));
    }
}
