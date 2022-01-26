// Nice work!

import java.util.Scanner;

public class HeartsClient {
    public static Scanner sc = new Scanner(System.in).useDelimiter(System.lineSeparator());

    public static void main(String[] args) throws Exception {
        Heart Group1 = new Heart("red", 3, "Hi", 15, 5.00, true, 50);
        Heart Group2 = new Heart("teal", 5, "Love CS-A", 25, 4.50, true, 200);
        Heart Group3 = new Heart("green", 2, "Go Girl!", 10, 3.50, true, 75);

        Heart[] store = { Group1, Group2, Group3 };
        placeOrder(store);
    }

    public static void buyOut(Heart[] store) {
        int sum = 0;
        for (int i = 0; i < store.length; i++) {
            sum += store[i].getStock();
        }
        System.out.println("The total number of hearts available is: " + sum);
    }

    public static void placeOrder(Heart[] store) {
        System.out.println("What color would you like to order: ");
        for (int i = 0; i < store.length; i++) {
            System.out.print(i + "." + store[i].getColor() + " ");
        }
        int a = sc.nextInt();
        System.out.println("There are " + store[a].getStock() + " hearts available and cost " + store[a].getCost()
                + " per lb, how many would you like to order");
        double b = sc.nextInt();
        System.out.println("Your total is: $" + (b / store[a].getSize() * store[a].getCost()));
        sc.close();
    }
}
