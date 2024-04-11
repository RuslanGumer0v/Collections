package task0807;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Нужно создать два списка - LinkedList и ArrayList.


Requirements:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Программа должна содержать только три метода.
4. Метод createArrayList() должен создавать и возвращать список ArrayList.
5. Метод createLinkedList() должен создавать и возвращать список LinkedList.*/

public class Solution {
    public static Object createArrayList() {
        //напишите тут ваш код
        List<Object> list = new ArrayList<>();
        return list;
    }

    public static Object createLinkedList() {
        //напишите тут ваш код
        List<Object> list = new LinkedList<>();
        return list;
    }

    public static void main(String[] args) {
        System.out.println(createArrayList());
        System.out.println(createLinkedList());
    }
}
