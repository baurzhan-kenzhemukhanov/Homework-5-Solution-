public class MarkerStyle {
    private final String icon;
    private final String color;

    public MarkerStyle(String icon, String color) {
        this.icon = icon;
        this.color = color;
    }

    public void draw(String name, int x, int y) {
        System.out.printf(
            "Drawing %s at (%d, %d) using icon: %s, color: %s%n",
            name, x, y, icon, color
        );
    }
}
