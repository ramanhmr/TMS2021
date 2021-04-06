import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

//        Задачи:
//         1) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
//   сколько амеб будет через 3, 6, 9, 12,..., 24 часа

        System.out.println(fission(20, 10));
        System.out.println(fission(1, 18));
        System.out.println(fission(-1, 31));
        System.out.println(fission(160, -10));
        System.out.println();

//        2) Напишите реализацию метода summ(int a, int b), вычисляющий a*b, не пользуясь операцией
//        умножения, где a и b целые числа, вызовите метод summ  в методе main и распечатайте на консоль.
        System.out.println(summ(7, 6));
        System.out.println(summ(3, 0));
        System.out.println();

//        3) Дан двухмерный массив размерностью 4 на 4, необходимо нарисовать четыре треугольника вида

//        a)                  b)
//              *        *
//            * *        * *
//          * * *        * * *
//        * * * *        * * * *
//
//        c)                  d)
//        * * * *        * * * *
//          * * *        * * *
//            * *        * *
//              *        *

        char[][] drawingBoard = new char[6][6];
        for (int i = 0; i < drawingBoard.length; i++) {
            Arrays.fill(drawingBoard[i], '*');
        }
        triangle(drawingBoard, 'c');
        triangle(drawingBoard, 'b');
        triangle(drawingBoard, 'k');
        triangle(drawingBoard, 'a');
        triangle(drawingBoard, 'd');


//        4)В переменную записываем число.
//        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
//        Например, Введите число: 5
//        "5 - это положительное число, количество цифр = 1"
        int number = -35515650;
        describe(number);
        System.out.println();

//        5) Создайте массив из всех нечётных чисел от 1 до 100, выведите его на экран в строку,
//        а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 ... 7 5 3 1).
        flippingOdds();
        System.out.println();

//        6) Создайте массив из int[] mass = new int[12]; Рандомно заполните его значениями от 0 до 15.
//        Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
//        Пример: {3,4,5,62,7,8,4,-5,7,62,5,1} Максимальный элемент 62, индекс его последнего вхождения в массив = 10
        int[] mass = new int[12];
        Random generate = new Random();
        for (int i = 0; i < 12; i++) {
            mass[i] = generate.nextInt(16);
        }
        System.out.println(Arrays.toString(mass));
        findingMax(mass);
        System.out.println();

//        7) Создайте массив размера 20, заполните его случайными целыми чиселами из отрезка от 0 до 20.
//        Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
//        Снова выведете массив на экран на отдельной строке.
        int[] massive = new int[20];
        for (int i = 0; i < 20; i++) {
            massive[i] = generate.nextInt(21);
        }
        System.out.println(Arrays.toString(massive));
        for (int i = 0; i < massive.length; i++) {
            if (i % 2 == 1) {
                massive[i] = 0;
            }
        }
        System.out.println(Arrays.toString(massive));
        System.out.println();

//        8) Найти максимальный элемент в массиве {4,5,0,23,77,0,8,9,101,2} и поменять его местами с нулевым элементом
        int[] numbers = new int[]{4, 5, 0, 23, 77, 0, 8, 9, 101, 2};
        int currentMax = Integer.MIN_VALUE;
        int maxPlace = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > currentMax) {
                currentMax = numbers[i];
                maxPlace = i;
            }
        }
        int tempMaxHolder = numbers[maxPlace];
        numbers[maxPlace] = numbers[0];
        numbers[0] = tempMaxHolder;
        System.out.println(Arrays.toString(numbers));
        System.out.println();

//        9) Проверить, различны ли все элементы массива, если не различны то вывести элемент повторяющийся
//        Пример: {0,3,46,3,2,1,2}
//        Массив имеет повторяющиеся элементы 3, 2
//        Пример: {0,34,46,31,20,1,28}
//        Массив не имеет повторяющихся элементов
        ArrayList<Integer> arr = new ArrayList<>();
        int arrLength = generate.nextInt(20) + 3;
        for (int i = 0; i < arrLength; i++) {
            arr.add(generate.nextInt(30));
        }
        System.out.println(arr);
        checkRepeat(arr);
        System.out.println();

//        10) Создаём квадратную матрицу, размер вводим с клавиатуры.
//        Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
//        Далее необходимо транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)
//        Пример:
//          1 2 3 4      1 6 3 1
//          6 7 8 9      2 7 3 5
//          3 3 4 5      3 8 4 6
//          1 5 6 7      4 9 5 7
        System.out.println("Введите размер матрицы (целое положительное число)");
        Scanner input;
        int dim;
        while (true) {
            input = new Scanner(System.in);
            if (input.hasNextInt()) {
                dim = input.nextInt();
                if (dim > 0) {
                    break;
                }
            }
            System.out.println("Введите целое положительное число");
        }
        int[][] matrix = new int[dim][dim];
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                matrix[i][j] = generate.nextInt(51);
                System.out.printf("%2d ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        transpose(matrix);
    }

    /*
            метод fission(int start, int time), где start - начальное число амеб, time - время в часах
            использование в качестве time отрицательного числа дает то, сколько было амеб time времени назад, если сейчас их start штук
            использование в качестве start отрицательного числа дает то, сколько амеб на момент time вы потеряли, из-за того, что продали start число амеб
    */
    public static int fission(int start, int time) {
        return (int) (start * Math.pow(2, (time / 3)));
    }

    public static int summ(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }
        return result;
    }

/*метод triangle(char[][] board, char type) рисует треугольники на квадратной матрице board типа char[][] с любым размером и любым наполнением (не только '*').
второе вводимое значение (type) отвечает за форму треугольника, вводится в виде одного из char 'a', 'b', 'c' или 'd'.
*/
    public static void triangle(char[][] board, char type) {
        switch (type) {
            case 'a':
                for (int i = 0; i < board.length; i++) {
                    for (int j = 0; j < board.length; j++) {
                        if (j >= board.length - 1 - i) {
                            System.out.print(board[i][j]);
                        } else {
                            System.out.print(' ');
                        }
                    }
                    System.out.println();
                }
                break;
            case 'b':
                for (int i = 0; i < board.length; i++) {
                    for (int j = 0; j < board.length; j++) {
                        if (j <= i) {
                            System.out.print(board[i][j]);
                        } else {
                            System.out.print(' ');
                        }
                    }
                    System.out.println();
                }
                break;
            case 'c':
                for (int i = 0; i < board.length; i++) {
                    for (int j = 0; j < board.length; j++) {
                        if (j >= i) {
                            System.out.print(board[i][j]);
                        } else {
                            System.out.print(' ');
                        }
                    }
                    System.out.println();
                }
                break;
            case 'd':
                for (int i = 0; i < board.length; i++) {
                    for (int j = 0; j < board.length; j++) {
                        if (j <= board.length - 1 - i) {
                            System.out.print(board[i][j]);
                        } else {
                            System.out.print(' ');
                        }
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Что-то не так.");
        }
        System.out.println();
    }

    public static void describe(int number) {
        int figures = 1;
        int numberCut = number;
        while (Math.abs(numberCut) / 10 != 0) {
            figures++;
            numberCut /= 10;
        }
        if (number > 0) {
            System.out.println(number + " - это положительное число, количество цифр = " + figures);
        } else if (number < 0) {
            System.out.println(number + " - это отрицательное число, количество цифр = " + figures);
        } else {
            System.out.println(number + " - это ноль. Не положительный и не отрицательный. Количество цифр = 1");
        }
    }

    public static void flippingOdds() {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 1; i < 100; i += 2) {
            array.add(i);
        }
        System.out.println(array);
        ArrayList<Integer> yarra = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            yarra.add(array.get(array.size() - 1 - i));
        }
        System.out.println(yarra);
    }

    //        6) Создайте массив из int[] mass = new int[12]; Рандомно заполните его значениями от 0 до 15.
//        Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
//        Пример: {3,4,5,62,7,8,4,-5,7,62,5,1} Максимальный элемент 62, индекс его последнего вхождения в массив = 10
    public static void findingMax(int[] mass) {
        int currentMax = -1;
        int lastSeen = -1;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] >= currentMax) {
                currentMax = mass[i];
                lastSeen = i;
            }
        }
        System.out.println("Максимальный эелемент " + currentMax + ", индекс его последнего вхождения в массив = " + (lastSeen + 1));
    }

    //        9) Проверить, различны ли все элементы массива, если не различны то вывести элемент повторяющийся
//        Пример: {0,3,46,3,2,1,2}
//        Массив имеет повторяющиеся элементы 3, 2
//        Пример: {0,34,46,31,20,1,28}
//        Массив не имеет повторяющихся элементов
    public static void checkRepeat(ArrayList<Integer> mass) {
        ArrayList<Integer> repeats = new ArrayList<>();
        cycle:
        for (int i = 0; i < mass.size(); i++) {
            for (int j = i + 1; j < mass.size(); j++) {
                if (mass.get(i).equals(mass.get(j)) && !repeats.contains(mass.get(i))) {
                    repeats.add(mass.get(i));
                    continue cycle;
                }
            }
        }
        if (repeats.isEmpty()) {
            System.out.println("Массив не имеет повторяющихся элементов");
        } else {
            System.out.print("Массив имеет повторяющиеся эелементы " + repeats.get(0));
            for (int i = 1; i < repeats.size(); i++) {
                System.out.print(", " + repeats.get(i));
            }
            System.out.println();
        }
    }

    public static void transpose(int[][] matr) {
        int[][] transposedMatr = new int[matr.length][matr.length];
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr.length; j++) {
                transposedMatr[j][i] = matr[i][j];
            }
        }
        for (int i = 0; i < transposedMatr.length; i++) {
            for (int j = 0; j < transposedMatr.length; j++) {
                System.out.printf("%2d ", transposedMatr[i][j]);
            }
            System.out.println();
        }
    }
}
