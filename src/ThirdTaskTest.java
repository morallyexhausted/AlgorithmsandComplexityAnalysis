import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThirdTaskTest {

    @Test
    void generateBrackets() {
        int n = 3;
        ThirdTask.generateBrackets("", 0, 0, n);
    }
}
