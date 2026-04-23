import java.util.ArrayList;

public class Tile {
    private boolean upwall;
    private boolean downwall;
    private boolean leftwall;
    private boolean rightwall;
    private int x;
    private int y;
    private ArrayList<String> tags;
    private String description;
    
        public Tile(int x, int y , boolean upwall, boolean downwall, boolean leftwall, boolean rightwall) {
            this.x = x;
            this.y = y;
            this.upwall = upwall;
            this.downwall = downwall;
            this.leftwall = leftwall;
            this.rightwall = rightwall;
            this.tags = new ArrayList<>();
            this.description = "";
        }
    }
