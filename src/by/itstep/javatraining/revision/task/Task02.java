package by.itstep.javatraining.revision.task;

/*	Task 02. The same Numbers [совпадающие числа]
 *
 *	Даны четыре целых числа. Определите, сколько из них совпадающих.
 *	Если числа не совпадают, то необходимо возвратить ноль.
 *
 *	Формат входных данных [input]
 *	На вход метод получает четыре целых числа типа int.
 *
 *	Формат выходных данных [output]
 *	Метод должен возвратить количество совпадающих чисел
 *  или ноль, если таких чисел нет.
 *
 *	[ input 1]: 7 7 7 7
 *	[output 1]: 4
 *
 *	[ input 2]: 7 7 7 8
 *	[output 2]: 3
 *
 *	[ input 3]: 7 7 8 9
 *	[output 3]: 2
 *
 *	[ input 4]: 6 7 8 9
 *	[output 4]: 0
 */

public class Task02 {
    public static int start(int a, int b, int c, int d) {
        int counter = 0;
        /*if (a == b) {
            counter = 2;
            counter = a == c ? ++counter : counter;
            counter = a == d ? ++counter : counter;
        } else if (b == c) {
            counter = 2;
            counter = b == d ? ++counter : counter;
        } else if (c == d) {
            counter = 2;
            counter = a == d ? ++counter : counter;
        } else if (a == d) {
            counter = 2;
        }

        return counter;*/

        if (a == b && b == c && c == d) {
            counter = 4;
        } else if ((a == b && (b == c || b == d))
                || (c == d) && (c == b || c == a)) {
            counter = 3;
        } else if (a == b || a == c || a == d
                || b == c || b == d || c == d) {
            counter = 2;
        }

        return counter;
    }
}