import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {
        //Некоторые тесты для проверки задач. Можно также написать свои тесты.
        printArray();
        System.out.println();
        System.out.println(operation(1));
        System.out.println(operation(0));
        System.out.println(operation(-5));
        System.out.println();
        System.out.println(calculateCountOfOddElementsInMatrix(new int[]{1, 2, 3, 4, 5, 6, 9}));
        System.out.println();
        countDevs(103);
        countDevs(-20);
        countDevs(101);
        countDevs(3503412);
        countDevs(-11);
        System.out.println();
        foobar(6);
        foobar(10);
        foobar(15);
        System.out.println();
        calculateSumOfDiagonalElements();
        System.out.println();
        printMatrix();
        System.out.println();
        printPrimeNumbers();
    }

    /**
     * Необходимо прочитать с консоли значение числа типа int,
     * далее создать одноменрый массив типа int размера прочитаного с консоли
     * далее заполнить массив случайными значениями
     * далее вывести массив на консоль
     */
    private static void printArray() {
        System.out.println("Enter positive integer as a length for array.");
        Scanner input;
        int arrayLength;
        int loopCount = 0;
        while (true) {
            loopCount++;
            input = new Scanner(System.in);
            if (input.hasNextInt()) {
                arrayLength = input.nextInt();
                if (arrayLength > 0) {
                    break;
                }
            }
            if (loopCount == 5) {
                System.out.println("Input limit reached. Terminating program.");
                System.exit(1);
            }
            System.out.println("Invalid input. Try again.");
        }
        int[] array = new int[arrayLength];
        Random generator = new Random();
        for (int i = 0; i < arrayLength; i++) {
            array[i] = generator.nextInt();
        }
        System.out.println(Arrays.toString(array));
        // тут пишем логику
    }

    /**
     * Метод должен выполнять некоторую операцию с int "number" в зависимости от некоторых условий:
     * - if number положительное число, то необходимо number увеличить на 1
     * - if number отрицательное - уменьшить на 2
     * - if number равно 0 , то замените значение number на 10
     * вернуть number после выполнения операций
     */
    public static int operation(int number) {
        if (number > 0) {
            return ++number;
        } else if (number == 0) {
            return 10;
        } else {
            return number - 2;
        }
    }

    /**
     * На вход приходит массив целых чисел типа int
     * Необходимо найти количество нечетных элементов в массиве и вернуть значение в метод main,
     * в котором это значение распечатается на консоль.
     */
    public static int calculateCountOfOddElementsInMatrix(int[] ints) {
        // тут пишем логику
        int oddCount = 0;
        for (int anInt : ints) {
            if (anInt % 2 == 1) {
                oddCount++;
            }
        }
        return oddCount;
    }

    /**
     * На вход приходит число.
     * Вывести в консоль фразу из разряда "_COUNT_ программистов",
     * заменить _COUNT_ на число которое пришло на вход в метод и заменить окончание в слове "программистов" на
     * уместное с точки зрения русского языка.
     * Пример: 1 программист, 42 программиста, 50 программистов
     *
     * @param count - количество программистов
     */
    public static void countDevs(int count) {
        // тут пишем логику
        int modulo = count % 10;
        if (count % 100 < 20 && count % 100 > 10) {
            System.out.println(count + " программистов");
        } else if (modulo == 1) {
            System.out.println(count + " программист");
        } else if (modulo > 1 && modulo < 5) {
            System.out.println(count + " программиста");
        } else {
            System.out.println(count + " программистов");
        }
    }

    /**
     * Метод должен выводить разные строки в консоли в зависимости от некоторых условий:
     * - если остаток от деления на 3 равен нулю - выведите "foo" (example of number - 6)
     * - если остаток от деления на 5 равен нулю - вывести "bar" (example of number - 10)
     * - если остаток от деления на 3 и 5 равен нулю 0 ,то вывести "foobar" (example of number - 15)
     */
    public static void foobar(int number) {
        // тут пишем логику
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("book");
        } else if (number % 3 == 0) {
            System.out.println("foo");
        } else if (number % 5 == 0) {
            System.out.println("bar");
        }
    }

    /**
     * заполнить рандомно 2-х мерный массив и посчитать сумму элементов на диагонали
     */
    public static void calculateSumOfDiagonalElements() {
        //пишем логику и выводим результат используя System.out.println
        Random generator = new Random();
        int dim1 = generator.nextInt(5) + 3;
        int[][] matrix = new int[dim1][dim1];
        for (int i = 0; i < dim1; i++) {
            for (int j = 0; j < dim1; j++) {
                matrix[i][j] = generator.nextInt(21) - 10;
            }
            System.out.println(Arrays.toString(matrix[i]));
        }
        int result = 0;
        for (int i = 0; i < dim1; i++) {
            result += matrix[i][i];
        }
        System.out.println(result);
    }


    /**
     * Шаги по реализации:
     * - Прочитать два int из консоли
     * - Создайте двумерный массив int (используйте целые числа, которые вы читаете по высоте и ширине консоли)
     * - Заполнить массив случайными значениями (до 100)
     * - Вывести в консоль матрицу заданного размера, но:
     * - Если остаток от деления элемента массива на 3 равен нулю - выведите знак "+" вместо значения элемента массива.
     * - Если остаток от деления элемента массива на 7 равен нулю - выведите знак "-" вместо значения элемента массива.
     * - В противном случае выведите "*"
     * <p>
     * Example:
     * - Значения с консоли - 2 и 3
     * - Массив будет выглядеть так (значения будут разными, потому что он случайный)
     * 6 11 123
     * 1 14 21
     * - Для этого значения вывод в консоли должен быть:
     * <p>
     * + * *
     * * - +
     * <p>
     * Обратите внимание, что 21% 3 == 0 и 21% 7 = 0, но выводить надо не +-, а +
     */
    public static void printMatrix() {
        // тут пишем логику
        System.out.println("Enter two positive integers as dimensions of array.");
        Scanner input = new Scanner(System.in);
        int[] dim = new int[2];
        int loopCount = 0;
        for (int i = 0; i < 2; i++) {
            loopCount++;
            if (loopCount > 3) {
                System.out.println("Input limit reached. Terminating program.");
                System.exit(1);
            }
            if (input.hasNextInt()) {
                dim[i] = input.nextInt();
                if (dim[i] <= 0) {
                    System.out.println("Invalid input.");
                    i = -1;
                    input = new Scanner(System.in);
                    continue;
                }
            } else {
                System.out.println("Invalid input.");
                i = -1;
                input = new Scanner(System.in);
                continue;
            }
            loopCount--;
        }
        int[][] matrix = new int[dim[0]][dim[1]];
        Random generator = new Random();
        for (int i = 0; i < dim[0]; i++) {
            for (int j = 0; j < dim[1]; j++) {
                matrix[i][j] = generator.nextInt(100);
            }
        }
        for (int i = 0; i < dim[0]; i++) {
            for (int j = 0; j < dim[1]; j++) {
                if (matrix[i][j] % 3 == 0) {
                    System.out.print('+');
                } else if (matrix[i][j] % 7 == 0) {
                    System.out.print('-');
                } else {
                    System.out.print('*');
                }
            }
            System.out.println();
        }
    }

    /**
     * Задача со звездочкой!
     * Метод должен печатать все простые числа <1000
     * что такое просто число (https://www.webmath.ru/poleznoe/formules_18_5.php)
     */
    public static void printPrimeNumbers() {
        int currentNumber = 1;
        ArrayList<Integer> foundPrimes = new ArrayList<>();
        checkingPrimes:
        while (currentNumber < 1000) {
            currentNumber++;
            for (int prime : foundPrimes) {
                if (currentNumber % prime == 0) {
                    continue checkingPrimes;
                }
            }
            foundPrimes.add(currentNumber);
        }
        System.out.println(foundPrimes.toString());
        // тут пишем логику
    }
}
