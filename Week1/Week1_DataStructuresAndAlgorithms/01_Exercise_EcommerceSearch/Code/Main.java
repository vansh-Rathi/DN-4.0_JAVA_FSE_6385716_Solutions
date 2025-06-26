import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Product[] products = {
            new Product(201, "Java Hand Book", "Books"),
            new Product(305, "Wireless Mouse", "Electronics"),
            new Product(102, "Coffee Mug", "Kitchen"),
            new Product(103, "Shoes", "Footwear"),
            new Product(104, "Laptop", "Electronics"),
            new Product(503, "Bluetooth Speaker", "Electronics"),
            new Product(301, "Notebook", "Stationery"),
            new Product(607, "Water Bottle", "Sports")
        };
        

        Product[] sortedProducts = Arrays.copyOf(products, products.length);
        Arrays.sort(sortedProducts, (p1, p2) -> Integer.compare(p1.getProductId(), p2.getProductId()));
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Available Product IDs:");
        for (Product product : products) {
            System.out.println("[" + product.getProductId() + "] " + product.getProductName() + " - " + product.getCategory());
        }
        System.out.println();
        
        // Search via LS
        System.out.print("Enter product ID to search (Linear Search): ");
        int targetId1 = scanner.nextInt();
        Product linearResult = SearchAlgorithms.linearSearch(products, targetId1);
        System.out.println("Linear Search output for input " + targetId1 + ":");
        if (linearResult != null) {
            System.out.println("Found: [" + linearResult.getProductId() + "] " + linearResult.getProductName() + " - " + linearResult.getCategory());
        } else {
            System.out.println("Product with ID " + targetId1 + " not found!");
        }
        
        // Search via BS
        System.out.print("Enter product ID to search (Binary Search): ");
        int targetId2 = scanner.nextInt();
        Product binaryResult = SearchAlgorithms.binarySearch(sortedProducts, targetId2);
        System.out.println("Binary Search output for input " + targetId2 + ":");
        if (binaryResult != null) {
            System.out.println("Found: [" + binaryResult.getProductId() + "] " + binaryResult.getProductName() + " - " + binaryResult.getCategory());
        } else {
            System.out.println("Product with ID " + targetId2 + " not found!");
        }
        
        scanner.close();
    }
} 