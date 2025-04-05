package Flyweight;
public class Main {
    public static void main(String[] args) {
        ProductMarker product1 = new ProductMarker("Smartphone", "electronics");
        ProductMarker product2 = new ProductMarker("Laptop", "electronics");
        ProductMarker product3 = new ProductMarker("T-shirt", "clothing");
        ProductMarker product4 = new ProductMarker("Jeans", "clothing");

        product1.display();
        product2.display();
        product3.display();
        product4.display();

        System.out.println("Unique styles created: " + ProductMarkerStyleFactory.getUniqueStylesCount());
        System.out.println("Total products created: 4");
    }
}
