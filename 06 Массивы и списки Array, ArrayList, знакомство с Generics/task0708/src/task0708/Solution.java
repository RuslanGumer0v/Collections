package task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.


Requirements:
1. В методе main инициализируй существующее поле strings класса Solution новым ArrayList<>
2. Программа должна считывать 5 строк с клавиатуры и записывать их в поле strings класса Solution.
3. Программа должна выводить самую длинную строку на экран.
4. Если есть несколько строк с длиной равной максимальной, то нужно вывести каждую из них с новой строки.*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        strings = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int maxSize = Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
            strings.add(in.nextLine());
            if (maxSize < strings.get(i).length()) {
                maxSize = strings.get(i).length();
            }
        }
        for (int i = 0; i < strings.size(); i++) {
            if (maxSize == strings.get(i).length()) {
                System.out.println(strings.get(i));
            }
        }
    }
}
