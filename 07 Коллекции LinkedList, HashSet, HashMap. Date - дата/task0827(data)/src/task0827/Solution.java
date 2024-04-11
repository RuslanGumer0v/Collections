package task0827;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.SimpleTimeZone;

/* 
Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате FEBRUARY 1 2013
Не забудь учесть первый день года.

Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false


Requirements:
1. Программа должна выводить текст на экран.
2. Класс Solution должен содержать два метода.
3. Метод isDateOdd() должен возвращать true, если количество дней с начала года - нечетное число, иначе false.
4. Метод main() должен вызывать метод isDateOdd().*/

public class Solution {
    public static void main(String[] args) {

        System.out.println(isDateOdd("MAY 1 2013"));

    }

    public static boolean isDateOdd(String date) {
        Date date1 = new Date(date);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
        Date date2 = new Date("JAN 1 " + formatter.format(date1));
        long result = (date1.getTime() - date2.getTime()) / 1000 / 3600 / 24;
        return result % 2 == 0;
    }
}
