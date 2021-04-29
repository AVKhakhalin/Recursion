package Recursion;


import java.util.Arrays;
import java.util.Random;

public class TwiceSearch
{
    int[] array;
    Random random = new Random();

    TwiceSearch(int sizeArray)
    {
        array = new int[sizeArray];
        boolean exitCikl;
        for (int i = 0; i < sizeArray; i++)
        {
            exitCikl = false;
            while(exitCikl == false)
            {
                exitCikl = true;
                array[i] = random.nextInt(sizeArray);
                for (int j = 0; j < i; j++)
                {
                    if (array[i] == array[j])
                    {
                        exitCikl = false;
                    }
                }
            }
        }
        Arrays.sort(array);
    }

    public int[] getArray()
    {
        return array;
    }

    public String classicTwiceSearch(int keyNumber) // Реализация обычного двоичного поиска
    {
        long curTime = System.nanoTime();
        boolean exit = false;
        int begin = 0;
        int end = array.length - 1;
        int middle = array.length / 2;
        System.out.println("Массив для поиска элемента: " + Arrays.toString(array));
        while (exit == false)
        {
            if (keyNumber == array[middle])
            {
                exit = true;
            }
            else if (keyNumber > array[middle])
            {
                begin = middle + 1;
                middle = (begin + end) / 2;
            }
            else
            {
                end = middle - 1;
                middle = (begin + end) / 2;
            }
        }
        return "Индекс элемента \"" + keyNumber + "\" в массиве - " + middle + ", определён обычным двоичным поиском за " + (System.nanoTime() - curTime) + " нс.";
    }

    public int recursionTwiceSearch(int keyNumber, int start, int end) // Реализация рекурсивного двоичного поиска
    {
        int middle = (start + end) / 2;
        if (keyNumber == array[middle])
        {
            return middle;
        }
        else if(keyNumber > array[middle])
        {
            start = middle + 1;
        }
        else
        {
            end = middle - 1;
        }
        return recursionTwiceSearch(keyNumber, start, end);
    }
}
