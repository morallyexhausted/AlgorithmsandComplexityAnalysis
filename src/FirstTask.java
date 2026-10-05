public class FirstTask {

    // Рекурсивный метод
    public static int doubleFactorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * doubleFactorialRecursive(n - 2);
    }

    // Обычный метод
    public static int doubleFactorialIterative(int n) {
        int result = 1;
        for (int i = n; i > 0; i -= 2) {
            result *= i;
        }
        return result;
    }
}
