package Flyweight;
import java.util.HashMap;
import java.util.Map;

public class ЫProductMarkerStyleFactory {
    private static Map<String, ProductMarkerStyle> styleMap = new HashMap<>();

    public static ProductMarkerStyle getProductStyle(String styleType) {
        ProductMarkerStyle style = styleMap.get(styleType);
        if (style == null) {
            switch (styleType) {
                case "electronics":
                    style = new ElectronicsMarkerStyle();
                    break;
                case "clothing":
                    style = new ClothingMarkerStyle();
                    break;
                // Добавить другие категории, если нужно
            }
            styleMap.put(styleType, style);
        }
        return style;
    }

    public static int getUniqueStylesCount() {
        return styleMap.size();
    }
}
