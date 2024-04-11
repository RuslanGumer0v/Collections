package task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
Используй коллекции.


Requirements:
1. Программа должна считывать одно значение с клавиатуры.
2. Программа должна выводить текст на экран.
3. Программа должна использовать коллекции.
4. Программа должна считывать с клавиатуры имя месяца и выводить его номер на экран по заданному шаблону.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Map<String, Integer> mapMonth = new HashMap<>();
//        mapMonth.put("Январь", 1);
//        mapMonth.put("Февраль", 2);
//        mapMonth.put("Март", 3);
//        mapMonth.put("Апрель", 4);
//        mapMonth.put("Май", 5);
//        mapMonth.put("Июнь", 6);
//        mapMonth.put("Июль", 7);
//        mapMonth.put("Август", 8);
//        mapMonth.put("Сентябрь", 9);
//        mapMonth.put("Октябрь", 10);
//        mapMonth.put("Ноябрь", 11);
//        mapMonth.put("Декабрь", 12);
        Calendar calendar = Calendar.getInstance();
        mapMonth = calendar.getDisplayNames(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH);
        Scanner in = new Scanner(System.in);
        do {
            String nameMonth = in.nextLine();

            for (Map.Entry<String, Integer> entry : mapMonth.entrySet()) {
                if (entry.getKey().equalsIgnoreCase(nameMonth))
                    System.out.println((entry.getValue() + 1) + " это " + entry.getKey() + " месяц.");
            }
        } while (true);
    }
}
