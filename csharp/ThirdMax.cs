using System;

class ThirdMax
{
    static int Solve(int[] nums)
    {
        int? first = null, second = null, third = null;

        foreach (int num in nums)
        {
            if (num == first || num == second || num == third) continue; // only distinct values count

            if (first == null || num > first)
            {
                third = second;
                second = first;
                first = num;
            }
            else if (second == null || num > second)
            {
                third = second;
                second = num;
            }
            else if (third == null || num > third)
            {
                third = num;
            }
        }
        return third ?? first.Value;
    }

    static void Main()
    {
        Console.WriteLine(Solve(new int[] { 3, 2, 1 }));     // 1
        Console.WriteLine(Solve(new int[] { 1, 2 }));        // 2
        Console.WriteLine(Solve(new int[] { 2, 2, 3, 1 }));  // 1
    }
}
