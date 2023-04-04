/*                  1001. Обратный корень
Ограничение времени: 2.0 секунды
Ограничение памяти: 64 МБ

Эта задача настолько проста, что авторы даже поленились сочинить для нее условие!

                    Исходные данные
Входной поток содержит набор целых чисел Ai (0 ≤ Ai ≤ 1018), отделённых друг от друга
произвольным количеством пробелов и переводов строк. Размер входного потока не превышает 256 КБ.
                    Результат
Для каждого числа Ai, начиная с последнего и заканчивая первым, в отдельной строке
вывести его квадратный корень не менее чем с четырьмя знаками после десятичной точки.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Task_1001 {
    public static void main(String[] args) {
        ArrayList<Long> list = new ArrayList<>();
        Scanner scr = new Scanner(System.in);
        while (scr.hasNextLong()) {
            long number = scr.nextLong();
            list.add(number);
        }
        scr.close();
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.printf("%.4f\n", Math.sqrt((double) list.get(i)));
        }
    }
}