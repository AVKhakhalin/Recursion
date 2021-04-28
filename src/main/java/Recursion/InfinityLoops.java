package Recursion;

public class InfinityLoops
{
    public int loopInfinity(int n)
    {
        return loopInfinity(1);
    }

    public int loopFinal(int n)
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
