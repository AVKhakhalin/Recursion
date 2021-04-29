package Recursion;

public class InfinityLoops
{
    public int loopInfinity(int n) // Бесконечная рекурсия
    {
        return loopInfinity(1);
    }

    public int loopFinal(int n) // Конечная рекурсия с базовым случаем
    {
        if (n < 2)
        {
            System.out.println(0);
            return 0;
        }
        else
        {
            System.out.println(--n);
            return loopFinal(n);
        }
    }
}
