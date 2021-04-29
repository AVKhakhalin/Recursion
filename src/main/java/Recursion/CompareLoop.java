package Recursion;

public class CompareLoop
{
    double result = 1;

    public void setResult(double result)
    {
        this.result = result;
    }

    public double loopResult(int loops) // Применение циклов
    {
        for (int i = 0; i < loops; i++)
        {
            this.result *= 2;
        }
        return this.result;
    }

    public double recursionResult(int loops) // Применение рекурсии
    {
        this.result *= 2;
        if (loops <= 0)
        {
            return this.result / 2;
        }
        else
        {
            return recursionResult(loops - 1);
        }
    }
}
