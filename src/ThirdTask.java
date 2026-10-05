public class ThirdTask {

    public static void generateBrackets(String current, int opened, int closed, int n) {
        // Базовый случай (завершение рекурсии)
        if (current.length() == 2 * n) {
            System.out.println(current);
            return;
        }

        // Рекурсивный случай 1: добавление открывающей скобки
        if (opened < n) {
            generateBrackets(current + "(", opened + 1, closed, n);
        }

        // Рекурсивный случай 2: добавление закрывающей скобки
        if (opened > closed) {
            generateBrackets(current + ")", opened, closed + 1, n);
        }
    }
}