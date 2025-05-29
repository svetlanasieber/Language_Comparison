# Java Functional Interfaces vs C# Delegates

This table provides a comparison between commonly used Java functional interfaces and their equivalents in C#.

| No. | Java Interface         | Description                                | C# Delegate Equivalent              | C# Example                                                              |
|-----|------------------------|--------------------------------------------|-------------------------------------|-------------------------------------------------------------------------|
| 1   | `Consumer<T>`         | Accepts T, returns nothing                  | `Action<T>`                         | `Action<string> a = x => Console.WriteLine(x);`                         |
| 2   | `BiConsumer<T, U>`    | Accepts T and U, returns nothing            | `Action<T, U>`                      | `Action<int, string> a = (i, s) => Console.WriteLine($"{i}: {s}");`     |
| 3   | `Supplier<T>`         | Returns T, accepts nothing                  | `Func<T>`                           | `Func<int> f = () => 42;`                                               |
| 4   | `Function<T, R>`      | Accepts T, returns R                        | `Func<T, R>`                        | `Func<int, string> f = x => x.ToString();`                              |
| 5   | `BiFunction<T, U, R>` | Accepts T and U, returns R                  | `Func<T, U, R>`                     | `Func<int, int, string> f = (x, y) => (x + y).ToString();`              |
| 6   | `Predicate<T>`        | Accepts T, returns boolean                  | `Predicate<T>` / `Func<T, bool>`   | `Func<int, bool> f = x => x > 0;`                                       |
| 7   | `UnaryOperator<T>`    | Transforms T to T (`Function<T, T>`)        | `Func<T, T>`                        | `Func<int, int> square = x => x * x;`                                   |
| 8   | `BinaryOperator<T>`   | Combines two T values into one T            | `Func<T, T, T>`                     | `Func<int, int, int> add = (x, y) => x + y;`                             |
| 9   | `Runnable`            | Accepts nothing, returns nothing            | `Action`                            | `Action run = () => Console.WriteLine("Run");`                          |
| 10  | `Callable<T>`         | Accepts nothing, returns T (can throw)      | `Func<T>`                           | `Func<int> call = () => 5;`                                             |

> **Note:** C# delegates do not have `throws` declarations like Java's `Callable<T>`.
