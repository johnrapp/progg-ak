import se.lth.cs.pt.square.Square;
import se.lth.cs.pt.window.SimpleWindow;

public class MoveTheSquareWithTrace {
    public static void main(String[] args) {
        SimpleWindow w = new SimpleWindow(600, 600, "MoveTheSquare");

        int x = 250, y = 250;
        Square sq = new Square(x, y, 100);

        sq.draw(w);
        while (true) {
            w.waitForMouseClick();
            int mouseX = w.getMouseX();
            int mouseY = w.getMouseY();
            int dx = mouseX - x;
            int dy = mouseY - y;

            int steps = 10;

            int ddx = dx / steps;
            int ddy = dy / steps;
            for (int i = 0; i < steps; i++) {
                sq.move(ddx, ddy);
                sq.draw(w);
            }

            x = sq.getX();
            y = sq.getY();
        }
    }
}