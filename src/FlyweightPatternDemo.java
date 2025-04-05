import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FlyweightPatternDemo {
    private static final String[] TYPES = {"Hospital", "Gas Station", "Restaurant"};
    private static final String[] ICONS = {"H", "G", "R"};
    private static final String[] COLORS = {"Red", "Blue", "Green"};

    public static void main(String[] args) {
        List<MapMarker> markers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            int index = random.nextInt(TYPES.length);
            String type = TYPES[index];
            MarkerStyle style = MarkerStyleFactory.getStyle(ICONS[index], COLORS[index]);
            
            MapMarker marker = new MapMarker(
                random.nextInt(1000), 
                random.nextInt(1000), 
                type, 
                style
            );
            markers.add(marker);
        }

        // Render the first marker as an example
        markers.get(0).render();

        System.out.println("Total markers: " + markers.size());
        System.out.println("Unique styles: " + MarkerStyleFactory.getStyleCount());
    }
}
