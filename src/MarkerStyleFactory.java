import java.util.HashMap;
import java.util.Map;

public class MarkerStyleFactory {
    private static final Map<String, MarkerStyle> styles = new HashMap<>();

    public static MarkerStyle getStyle(String icon, String color) {
        String key = icon + "_" + color;
        return styles.computeIfAbsent(key, k -> new MarkerStyle(icon, color));
    }

    public static int getStyleCount() {
        return styles.size();
    }
}
