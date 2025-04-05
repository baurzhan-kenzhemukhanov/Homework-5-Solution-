public class MapMarker {
    private final int x;
    private final int y;
    private final String name;
    private final MarkerStyle style;

    public MapMarker(int x, int y, String name, MarkerStyle style) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.style = style;
    }

    public void render() {
        style.draw(name, x, y);
    }
}
