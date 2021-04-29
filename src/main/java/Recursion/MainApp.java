package Recursion;

import java.util.Arrays;

public class MainApp
{
    static long curTime;

    public static void main(String[] args)
    {
        System.out.println("\nДомашнее задание №5 студента университета GeekBrains Хахалина Андрея Владимировича\n");

        //region Решение задания 5.1
        System.out.println("\nРешение задчи 5.1\n");
        /* Задание 5.1
        Приведите пример использования рекурсии. */
        System.out.println("Примеры использования рекурсии:");
        System.out.println("    5.1.1. Построение списка всех подпапок на жёстком диске от заданного каталога.");
        System.out.println("    5.1.2. Построение сетки связей в молекулярной системе.");
        System.out.println("    5.1.3. Создание генеалогического дерева.");
        //endregion-------------------------------------------------------

        //region Решение задания 5.2
        System.out.println("\nРешение задчи 5.2\n");
        /* Задание 5.2
        Реализуйте простой пример бесконечной рекурсии и обычной рекурсии с условием для выхода. */

        InfinityLoops infinityLoops = new InfinityLoops();
        // Пример бесконечной рекурсии
        infinityLoops.loopInfinity(100); // ВАЖНО!!! При запуске здесь будет переполнение стека и ошибка!!!
        // Пример обычной рекурсии с условием для выхода
        infinityLoops.loopFinal(100);
        //endregion-------------------------------------------------------

        //region Решение задания 5.3
        System.out.println("\nРешение задчи 5.3\n");
        /* Задание 5.3
        Приведите пример, изображающий стек вызова и стек вызова с рекурсией. */

        System.out.println("Примеры, изображающие стек вызова:");
        System.out.println("    5.3.1.1. Колода карт.");
        System.out.println("    5.3.1.2. Стопка тарелок.");
        System.out.println("    5.3.1.3. Матрёшка.\n");

        System.out.println("Примеры, изображающие стек вызова с рекурсией:");
        System.out.println("    5.3.2.1. Отражение объекта между двумя параллельными зеркалами.");
        System.out.println("    5.3.2.2. Любой вид самоподобного объекта: фракталы, листья папортника, дендриты.");
        System.out.println("    5.3.2.3. Вид винтовой лестницы сверху вниз.");
        //endregion-------------------------------------------------------

        //region Решение задания 5.4
        System.out.println("\nРешение задчи 5.4\n");
        /* Задание 5.4
        Реализуйте простой алгоритм, использующий цикл и простой алгоритм, использующий рекурсию.
        Оцените два алгоритма с помощью базового метода System.nanoTime(). */

        CompareLoop compareLoop = new CompareLoop();
        curTime = System.nanoTime();
        System.out.println("С помощью циклов получено " + compareLoop.loopResult(1000) + " за " + (System.nanoTime() - curTime) + " нс.");
        compareLoop.setResult(1);
        System.out.println("С помощью рекурсии получено " + compareLoop.recursionResult(1000) + " за " + (System.nanoTime() - curTime) + " нс.");
        //endregion-------------------------------------------------------

        //region Решение задания 5.5
        System.out.println("\nРешение задчи 5.5\n");
        /* Задание 5.5
        Реализуйте алгоритм двоичного рекурсивного поиска на основе массива из задания 2.1.
        Оцените алгоритм двоичного рекурсивного поиска с помощью базового метода System.nanoTime() и сравните с обычным двоичным поиском. */

        int numberToSearch = 9; // Установка числа для поиска
        TwiceSearch twiceSearch = new TwiceSearch(numberToSearch + 1); // Создание массива

        // Реализация обчыного двоичного поиска
        System.out.println(twiceSearch.classicTwiceSearch(numberToSearch));
        // Реализация рекурсивного двоичного поиска
        curTime = System.nanoTime();
        System.out.println("Индекс элемента \"" + numberToSearch + "\" в массиве - " + twiceSearch.recursionTwiceSearch(numberToSearch, 0, twiceSearch.getArray().length - 1) + ", определён рекурсивным двоичным поиском за " + (System.nanoTime() - curTime) + " нс.");
        //endregion-------------------------------------------------------

        //region Решение задания 5.6
        System.out.println("\nРешение задчи 5.6\n");
        /* Задание 5.6
        На основе массива из задания 2.1 реализуйте алгоритм сортировки слиянием.
        Оцените алгоритм сортировки слиянием с помощью базового метода System.nanoTime() и сравните с сортировкой методом sort(). */

        int sizeArray = 1000; // Установка размера массива
        ConfluenceSearch confluenceSearch = new ConfluenceSearch(sizeArray);

        // Сортировка массива слиянием
        curTime = System.nanoTime();
        System.out.println("Отсортированный массив методом слияния: " + Arrays.toString(confluenceSearch.divideMergeArray(confluenceSearch.getArray())));
        System.out.println("    Сортировка массива методом слияния заняла " + (System.nanoTime() - curTime) + " нс.");

        // Сортировка массива методом sort()
        curTime = System.nanoTime();
        Arrays.sort(confluenceSearch.getArray());
        System.out.println(" Отсортированный массив методом sort(): " + Arrays.toString(confluenceSearch.getArray()));
        System.out.println("    Сортировка массива методом sort() заняла " + (System.nanoTime() - curTime) + " нс.");
        //endregion-------------------------------------------------------
    }
}