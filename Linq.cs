using System;
using System.Linq;

class Linq
{
    static void Main()
    {
        int[] numbers = {1, 2, 3, 4, 5};

        
        int sum = numbers
                    .Where(n => n % 2 == 0) 
                    .Select(n => n * 2)
                    .Sum();
        Console.WriteLine("Sum of even numbers multiplied by 2: " + sum);
    }
}
