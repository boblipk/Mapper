public class Map {
    private Tile[][] tiles;
    private int minX;
    private int maxX;
    private int minY;
    private int maxY;

    public Map() {
        this.tiles = new Tile[0][0];
        this.minX = 0;
        this.maxX = 0;
        this.minY = 0;
        this.maxY = 0;
    }
}
