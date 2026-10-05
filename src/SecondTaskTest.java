import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondTaskTest {

    @Test
    void population() {
        // Проверка обычного метода
        assertEquals(54, SecondTask.populationIterative(3, 2, 3));
        assertEquals(7, SecondTask.populationIterative(4, 7, 1));
        assertEquals(0, SecondTask.populationIterative(5, 2, 0));

        // Проверка рекурсивного метода
        assertEquals(54, SecondTask.populationRecursive(3, 2, 3));
        assertEquals(7, SecondTask.populationRecursive(4, 7, 1));
        assertEquals(0, SecondTask.populationRecursive(5, 2, 0));
    }
}
