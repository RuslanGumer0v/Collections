package task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.


Requirements:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей по принципу «Фамилия» - «Имя».
4. Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
5. Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Гумеров", "Руслан");
        map.put("Гумерова", "Таня");
        map.put("Анисимов", "Леха");
        map.put("Анисимова", "Аня");
        map.put("Пашковский", "Паша");
        map.put("Пашковская", "Юля");
        map.put("Снигиревич", "Анна");
        map.put("Гузик", "Иван");
        map.put("Головко", "Юра");
        map.put("Хвалей", "Иван");

        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int countName = 0;
        for (String value : map.values()) {
            if (value.equals(name))
                countName++;
        }
        return countName;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int countLastName = 0;
        for (String string : map.keySet()) {
            if (string.equals(lastName))
                countLastName++;
        }
        return countLastName;

    }

    public static void main(String[] args) {
        System.out.println(getCountTheSameFirstName(createMap(), "Иван"));
        System.out.println(getCountTheSameLastName(createMap(), "Гумеров"));
    }
}
