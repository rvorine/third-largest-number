using System;

class ThirdMax
{
    static int Solve(int[] nums)
    {
        long first = long.MinValue, second = long.MinValue, third = long.MinValue;

        foreach (int num in nums)
        {
            if (num == first || num == second || num == third) continue; // only distinct values count

            if (num > first)
            {
                third = second;
                second = first;
                first = num;
            }
            else if (num > second)
            {
                third = second;
                second = num;
            }
            else if (num > third)
            {
                third = num;
            }
        }
        return (int)(third == long.MinValue ? first : third);
    }

    static void Main()
    {
        Console.WriteLine(Solve(new int[] { 3, 2, 1 }));     // 1
        Console.WriteLine(Solve(new int[] { 1, 2 }));        // 2
        Console.WriteLine(Solve(new int[] { 2, 2, 3, 1 }));  // 1
    }
}
