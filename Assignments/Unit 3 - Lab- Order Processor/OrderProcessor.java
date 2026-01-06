public class OrderProcessor {

    public static OrderSummary processCustomerOrder(Item[] items, double taxRate) {
        // changed 0 to the method calculate subtotal
        double subtotal = calculateSubtotal(items);
        // changed the string premium items to the method collect premium items 
        String[] premiumItems = collectPremiumItems(items);
        double tax = calculateTax(subtotal, taxRate);
        double total = calculateTotal(subtotal, tax);

        printOrderSummary(subtotal, tax, total, premiumItems.length);

        return new OrderSummary(total, subtotal, tax, premiumItems);
    }

    // helper methods

    // calculates the subtotal cost of all items in the array.
    private static double calculateSubtotal(Item[] items) {
        double subtotal = 0;

        for (Item item : items) {
            subtotal += calculateItemTotal(item);
        }

        return subtotal;
    }

    // Calculates the total cost of a single item by multiplying price by quantity.
    private static double calculateItemTotal(Item item) {
        return item.getPrice() * item.getQuantity();
    }

    //creates a new String[] that only has items > $50
    private static String[] collectPremiumItems(Item[] items) {
        String[] temp = new String[items.length];
        int count = 0;

        for (Item item : items) {
            if (isPremiumItem(item)) {
                temp[count] = formatPremiumItem(item);
                count++;
            }
        }

        return trimArray(temp, count);
    }

    // determines whether an item is premium or not
    private static boolean isPremiumItem(Item item) {
        return item.getPrice() > 50.0;
    }

    // formats a premium item into a readable string
    private static String formatPremiumItem(Item item) {
        return item.getName() + " is a premium item at $" + String.format("%.2f", item.getPrice());
    }

    //trims an array to the specificed size (int size)
    private static String[] trimArray(String[] source, int size) {
        String[] result = new String[size];

        for (int i = 0; i < size; i++) {
            result[i] = source[i];
        }

        return result;
    }

    // calculates tax based on subtotal and tax rate
    private static double calculateTax(double subtotal, double taxRate) {
        if (subtotal <= 0) {
            return 0;
        }
        return subtotal * taxRate;
    }

    // calculates the final total including tax
    private static double calculateTotal(double subtotal, double tax) {
        if (subtotal <= 0) {
            return 0;
        }
        return subtotal + tax;
    }

    //prints a summary of the whole order
    private static void printOrderSummary(double subtotal, double tax, double total, int premiumCount) {
        System.out.println("Subtotal: $" + String.format("%.2f", subtotal));
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", total));
        System.out.println("Number of premium items: " + premiumCount);
    }
}
