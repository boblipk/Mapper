public class Cursor {
    private int x;
    private int y;

    public Cursor() {
        this.x = 0;
        this.y = 0;
    }

    public void moveUp() {
        this.y -= 1;
    }

    public void moveDown() {
        this.y += 1;
    }

    public void moveLeft() {
        this.x -= 1;
    }

    public void moveRight() {
        this.x += 1;
    }
}
