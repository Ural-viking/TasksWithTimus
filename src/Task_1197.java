/*                  1197. Один в поле воин
Ограничение времени: 1.0 секунды
Ограничение памяти: 64 МБ

Условие этой задачи очень простое: вам всего лишь надо определить,
сколько клеток находится под боем шахматного коня, одиноко стоящего на шахматной доске.
На всякий случай напомним, что конь ходит буквой «Г» — на две клетки по горизонтали
или вертикали в любом направлении, и потом на одну клетку в направлении, перпендикулярном первоначальному.

Исходные данные
В первой строке находится единственное число N, 1 ≤ N ≤ 64 — количество тестов.
В каждой из последующих N строк содержится очередной тест:
два символа (маленькая латинская буква от 'a' до 'h' и цифра от 1 до 8) —
стандартное шахматное обозначение клетки, на которой стоит конь.
При этом буква обозначает вертикаль, а цифра — горизонталь.

Результат
Выведите N строк: в каждой из них должно находиться единственное число —
количество клеток шахматной доски, находящихся под боем коня. */

import java.util.Scanner;
import java.io.PrintWriter;

public class Task_1197 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = scr.nextInt(), x, y;
        char x1, y1;

        for(int i=0;i<n;i++){
            String coordinate = scr.next();
            x1 = coordinate.charAt(0);
            y1 = coordinate.charAt(1);

            x = (int)x1-96;
            y = (int)y1-48;

            pw.println(getInts()[x-1][y-1]);
        }
        pw.flush();
    }

    public static int[][] getInts(){
        return new int[][]{
                {2,3,4,4,4,4,3,2},
                {3,4,6,6,6,6,4,3},
                {4,6,8,8,8,8,6,4},
                {4,6,8,8,8,8,6,4},
                {4,6,8,8,8,8,6,4},
                {4,6,8,8,8,8,6,4},
                {3,4,6,6,6,6,4,3},
                {2,3,4,4,4,4,3,2}
        };
    }
}