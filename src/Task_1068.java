/*                  1068. Сумма
Ограничение времени: 2.0 секунды
Ограничение памяти: 64 МБ

Всё, что от вас требуется — найти сумму всех целых чисел, лежащих между 1 и N включительно.
Исходные данные
В единственной строке расположено число N, по модулю не превосходящее 10000.
Результат
Выведите целое число — ответ задачи. */

import java.util.Scanner;
public class Task_1068 {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        if(n<=0){
            System.out.print(((n+1)*(2-n))/2);
        }
        else{
            System.out.print(((n+1)*(n))/2);
        }
    }
}