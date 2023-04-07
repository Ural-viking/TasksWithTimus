/*                                 1785. Трудности локализации
Компания Lavin Interactive, разработчик пошаговой стратегии Losers-V, постоянно расширяет рынки сбыта
и создаёт локализации своей игры даже на самые малоизвестные языки.
В том числе, их заинтересовал язык племени австралийских аборигенов аниндилъяква.
Но в языке аниндилъяква нет числительных.
Как же, например, перевести на него фразу «у вас семь чёрных драконов, а у вашего врага — сорок»?
Локализаторы решили перевести её так: «у вас немного чёрных драконов, а у вашего врага — толпа».
Они составили таблицу, в которой указали правила замены чисел, обозначающих количество монстров,
на существительные и местоимения:
Обозначение на русском языке	Обозначение на языке аниндилъяква
              от 1 до 4	                      несколько	  few
              от 5 до 9	                      немного	  several
              от 10 до 19	                  отряд	      pack
              от 20 до 49	                  толпа	      lots
              от 50 до 99	                  орда	      horde
              от 100 до 249	                  множество	  throng
              от 250 до 499	                  сонмище	  swarm
              от 500 до 999	                  полчище	  zounds
              от 1000	                      легион	  legion.
Помогите локализаторам автоматизировать процесс — напишите программу,
которая по количеству монстров выдаст соответствующее этому количеству слово. */

import java.util.Scanner;
public class Task_1785 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(num > 999){
            System.out.print("legion");
        }
        else if(num > 999){
            System.out.print("legion");
        }
        else if(num > 499){
            System.out.print("zounds");
        }
        else if(num > 249){
            System.out.print("swarm");
        }
        else if(num > 99){
            System.out.print("throng");
        }
        else if(num > 49){
            System.out.print("horde");
        }
        else if(num > 49){
            System.out.print("horde");
        }
        else if(num > 19){
            System.out.print("lots");
        }
        else if(num > 9){
            System.out.print("pack");
        }
        else if(num > 4){
            System.out.print("several");
        }
        else {
            System.out.print("few");
        }
        return ;
    }
}