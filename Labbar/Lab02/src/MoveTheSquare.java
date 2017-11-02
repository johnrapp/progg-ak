import se.lth.cs.pt.square.Square;
import se.lth.cs.pt.window.SimpleWindow;

public class MoveTheSquare {
    public static void main(String[] args) {
        SimpleWindow w = new SimpleWindow(600, 600, "MoveTheSquare");

        int x = 250, y = 250;
        Square sq = new Square(x, y, 100);

        sq.draw(w);
        while (true) {
            w.waitForMouseClick();
            int mouseX = w.getMouseX();
            int mouseY = w.getMouseY();
            sq.erase(w);
            int dx = mouseX - x;
            int dy = mouseY - y;
            sq.move(dx, dy);
            sq.draw(w);
            x = mouseX;
            y = mouseY;
        }
    }
}
