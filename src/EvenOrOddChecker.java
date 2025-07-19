import java.util.Arrays;
import java.util.Scanner;

public class EvenOrOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers will you enter? ");
        int count = scanner.nextInt();
        Integer[] numbers = new Integer[count];
        for(int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Results:");
        for(int i = 0; i < count; i++) {
            System.out.print(numbers[i]+" is ");
            if(numbers[i] % 2 == 0) {
                System.out.println("even");
            }
            else {
                System.out.println("odd");
            }
        }
    }
}
