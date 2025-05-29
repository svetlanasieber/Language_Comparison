import java.util.Arrays;

public class ArraysStream {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = Arrays.stream(numbers)
                        .filter(n -> n % 2 == 0)  
                        .map(n -> n * 2)          
                        .sum();                   

        System.out.println("Sum of even numbers multiplied by 2: " + sum);
    }
}
