
import java.util.Scanner;

// Запрос данных
public class DataRequest {
    // запись данных
    public static void dataEntry() {
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("Введите данные пользователя в формате: " +
                "Фамилия Имя Отчество датарождения номертелефона пол\n" +
                "Форматы данных:\n" +
                "- фамилия, имя, отчество - строки\n" +
                "- датарождения - строка формата dd.mm.yyyy\n" +
                "- номертелефона - строка в виде семизначного числа\n" +
                "- пол - символ латиницей f или m.\n" +
                "- Или введите exit для выхода\n");

        boolean run = true;
        while (run) {
            String[] arr = in.nextLine().split(" ");
            if (arr[0].equalsIgnoreCase("exit")) {
                break;
            }
            DataValidator.arrayEnteredData(arr);
        }
        System.out.println("Выход из приложения");
    }
}