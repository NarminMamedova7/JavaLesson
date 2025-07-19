import java.util.Scanner;
public class GroceryList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi List Maker!");
        System.out.print("Please enter the amount of items you want to add: ");
        int itemCount = scanner.nextInt();
        String[] groceryList = new String[itemCount];
        for (int i = 0; i < itemCount; i++) {
            System.out.print("Please enter the item number " + (i + 1) + ": ");
            groceryList[i] = scanner.next();
        }
        System.out.println("Here is the grocery list: ");
        for (int i = 0; i < groceryList.length; i++) {
            System.out.println((i+1)+"."+groceryList[i]);
        }
        System.out.println("Now you are ready for shopping!");
    }
}
