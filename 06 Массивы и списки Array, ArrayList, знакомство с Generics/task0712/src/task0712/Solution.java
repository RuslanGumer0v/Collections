package task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Самые-самые
1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3. Должна быть выведена одна строка.


Requirements:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
3. Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
4. Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.
5. Должна быть выведена только одна строка.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        List<String> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(in.nextLine());
        }
        int minIndex = 0;
        int minStringLength = list.get(0).length();
        for (int i = 0; i < list.size(); i++) {
            if (minStringLength > list.get(i).length()) {
                minStringLength = list.get(i).length();
                minIndex = i;
            }
        }
        int maxIndex = 0;
        int maxStringLength = list.get(0).length();
        for (int i = 0; i < list.size(); i++) {
            if (maxStringLength < list.get(i).length()) {
                maxStringLength = list.get(i).length();
                maxIndex = i;
            }
        }
        if (minIndex < maxIndex) System.out.println(list.get(minIndex));
        else if (maxIndex < minIndex) System.out.println(list.get(maxIndex));
        else System.out.println(list.get(0));
    }
}
