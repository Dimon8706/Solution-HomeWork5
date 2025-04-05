package Flyweight;
public class ProductMarker {
    private ProductMarkerStyle style;
    private String productName;
    public ProductMarker(String productName, String styleType) {
        this.productName = productName;
        this.style = ProductMarkerStyleFactory.getProductStyle(styleType);
    }
    public void display() {
        System.out.println("Product: " + productName);
        style.display();
    }
}
