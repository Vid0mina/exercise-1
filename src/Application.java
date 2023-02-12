import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Практика: В методе main консольного приложения извлечь числа из текста
 * (текст передать параметром при запуске приложения).
 * Результат программы выводит сумму найденных чисел в консоль.
 * Пишу этот текст 12 февраля 2023 года в 20:20   12+2023+20+20=2075
 * @author Ushakova Valentina E.
 * @version 1.0
 */
public class Application {
    public static void main(String[] args) {
        int sum = 0;
        if (args == null || args.length == 0) return;
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(args[0]);

        while (matcher.find()) {
            sum += Integer.parseInt(matcher.group());
        }

        System.out.println(sum);
    }
}