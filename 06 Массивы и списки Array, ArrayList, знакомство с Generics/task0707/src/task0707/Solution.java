package task0707;

import java.util.ArrayList;

/* 
Что за список такой?
1. Создай список строк.
2. Добавь в него 5 различных строк.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.


Requirements:
1. Программа не должна ничего считывать с клавиатуры.
2. Объяви переменную типа ArrayList<String> (список строк) и сразу проинициализируй ee.
3. Программа должна добавить 5 любых строк в список.
4. Программа должна вывести размер списка на экран.
5. Программа должна вывести содержимое списка на экран, каждое значение с новой строки.*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("first");
        arrayList.add("second");
        arrayList.add("third");
        arrayList.add("fourth");
        arrayList.add("fifth");
        System.out.println(arrayList.size());
        for (String string : arrayList) {
            System.out.println(string);
        }
    }
}
