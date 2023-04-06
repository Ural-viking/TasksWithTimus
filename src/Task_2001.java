/*                  2001. Математики и ягоды

Шли как-то два математика по лесу и собирали ягоды.
Час шли, два шли, а потом вдруг остановились и решили ягодами помериться.
Достали они весы (какой же математик пойдет в лес без весов?) и взвесили свои корзины
с собранным урожаем, а потом записали полученные числа a1 и b1 на листочек.
После этого второй математик пересыпал все ягоды в корзину к первому (полностью опустошив свою корзину),
и они снова взвесили свои корзины, получив числа a2 и b2 соответственно.
Наконец, первый математик пересыпал все ягоды в корзину ко второму (полностью опустошив свою корзину);
после взвешивания они получили числа a3 и b3 соответственно.
Этих данных оказалось достаточно для определения победителя, и довольные математики пошли дальше.
Вам же предстоит вычислить массу ягод в корзине каждого из математиков до совершения всех пересыпаний. */

import java.util.Scanner;

public class Task_2001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int basket1_1 =in.nextInt();
        int basket2_1 =in.nextInt();
        int basket1_2 =in.nextInt();
        int basket2_2 =in.nextInt();
        int basket1_3 =in.nextInt();
        int basket2_3 =in.nextInt();

        int berries_1 = basket1_1 - basket1_3;
        int berries_2 = basket2_1 - basket2_2;

        System.out.print(berries_1 +" "+ berries_2);

    }
}