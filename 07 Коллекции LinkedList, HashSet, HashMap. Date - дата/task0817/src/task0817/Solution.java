package task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.


Requirements:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей.
4. Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
5. Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().*/

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
        map.put("Снигиревич", "Аня");
        map.put("Гузик", "Иван");
        map.put("Головко", "Юра");
        map.put("Хвалей", "Иван");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        Map<String, String> mapName = new HashMap<>(map);
        for (Map.Entry<String, String> entry1 : mapName.entrySet()) {
            for (Map.Entry<String, String> entry2 : mapName.entrySet()) {
                if (entry1.getValue().equals(entry2.getValue()) && !entry1.getKey().equals(entry2.getKey()))
                    removeItemFromMapByValue(map, entry1.getValue());
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Map<String, String> mapFinal = createMap();
        for (Map.Entry<String, String> entry : mapFinal.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println();
        removeTheFirstNameDuplicates(mapFinal);
        for (Map.Entry<String, String> entry : mapFinal.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
