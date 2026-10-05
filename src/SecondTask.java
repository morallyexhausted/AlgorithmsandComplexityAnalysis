public class SecondTask {

    // Обычный (итеративный) метод
    public static int populationIterative(int n, int first, int ratio) {
        int result = first;
        for (int i = 0; i < n; i++) {
            result *= ratio;
        }
        return result;
    }

    // Рекурсивный метод
    public static int populationRecursive(int n, int first, int ratio) {
        if (n == 0) {
            return first;
        }
        return populationRecursive(n - 1, first, ratio) * ratio;
    }
}