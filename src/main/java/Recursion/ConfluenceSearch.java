package Recursion;

import java.util.Arrays;
import java.util.Random;

public class ConfluenceSearch
{
    int[] array;
    Random random = new Random();

    ConfluenceSearch(int sizeArray)
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


}
