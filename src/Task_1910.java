/*                  1910. Руины титанов: сокрытый вход
Ограничение времени: 1.0 секунды
Ограничение памяти: 64 МБ

Сорен и Альба — известные и влиятельные маги.
В своё время именно они основали магическую гильдию, которая объединила магов Северных земель
и позволила им получить свободу и независимость от Южной империи.
И несмотря на свой почтенный возраст, они всё ещё активно участвуют во всех важных событиях.
Когда исследователи Осинских ущелий обнаружили там следы построек древних титанов, сотворителей этого мира,
Сорен и Альба были одними из первых магов, кто прибыл к месту находки.
Ведь титаны были самыми могущественными магами, и почти любое изучение их следов давало мощный толчок
к развитию современной магии и помогало понять природу магии в целом.
Когда Сорен и Альба добрались до руин титанов, то они увидели лишь немного выступающую из скалы глухую стену,
разделённую на небольшие одинаковые секции.

— Где же вход? — спросил Сорен.
— Очевидно, замаскирован — ответил Альба — не думал же ты, что титаны встретят тебя открытыми вратами.
Они всегда достаточно серьёзно относились к собственной безопасности.
Но я почти уверен, что где-то среди этих секций есть настоящая дверь.
Причём во всех известных нам постройках титанов, насколько я помню, двери всегда шириной ровно в три таких секции.
— Это всё, конечно, хорошо, но как нам их найти?
Стена длинная, а заклинание рассеивания подобных иллюзий потребует большого количества магических сил,
применить его ко всей стене нам явно не удастся.
— Я чувствую, что хоть вдоль всей стены и действует заклинание маскировки, сила его весьма неравномерна.
И я почти уверен, что сильнее всего оно именно там, где находятся двери.
Я уже запустил заклинание сканирования магических полей, и скоро у нас будет информация о том,
с какой силой поле действует на каждой из секций.
Останется лишь выбрать из них три подряд идущие с максимальной суммарной силой поля,
и применить к ним заклинание рассеивания.

Исходные данные
В первой строке дано единственное целое число n — количество секций стены (3 ≤ n ≤ 1000).
Во второй строке через пробел записаны n положительных целых чисел ai — сила магического поля на каждой из секций
(1 ≤ ai ≤ 106).
Результат
Выдайте через пробел два числа — максимальную суммарную силу поля возле трёх подряд идущих секций стены и
номер средней из них. Гарантируется, что ответ всегда однозначен.
 */

import java.util.Scanner;

public class Task_1910 {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);

        int n = scr.nextInt();

        int[]wall = new int[n];
        for(int i=0;i<n;i++){
            wall[i] = scr.nextInt();
        }
        long max =0;
        long sum = 0;
        int counter = 0;
        for(int j=1;j<n-1;j++){
            sum = wall[j-1] + wall[j] + wall[j+1];
            if(sum>max){
                max = sum;
                counter = j+1;
            }
        }
        System.out.print(max + " " + counter);
    }
}