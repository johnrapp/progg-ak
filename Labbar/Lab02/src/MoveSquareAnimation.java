import se.lth.cs.pt.square.Square;
import se.lth.cs.pt.window.SimpleWindow;

import javax.lang.model.util.SimpleElementVisitor6;

public class MoveSquareAnimation {
    public static void main(String[] args) {
        SimpleWindow w = new SimpleWindow(600, 600, "MoveTheSquare");

        int x = 250, y = 250;
        Square sq = new Square(x, y, 100);

        sq.draw(w);
        while (true) {
            w.waitForMouseClick();
            sq.setSide(100);
            int mouseX = w.getMouseX();
            int mouseY = w.getMouseY();
            int dx = mouseX - x;
            int dy = mouseY - y;

            int steps = 30;

            int ddx = dx / steps;
            int ddy = dy / steps;
            sq.erase(w);
            for (int i = 0; i < steps; i++) {
                sq.move(ddx, ddy);
                double dSize = 100.0 * size((i + 1) / ((double) steps));
                sq.setSide((int) dSize);
                sq.draw(w);
                SimpleWindow.delay(30);
                sq.erase(w);
            }
            sq.draw(w);

            x = sq.getX();
            y = sq.getY();
        }
    }

    // [0,1] -> {0,1]
    static double size(double t) {
        // \sin\left(\pi\cdot x\cdot1.25\cdot1.2\right)^2
        return Math.pow(Math.sin(Math.PI * 1.25 * 1.2 * t), 2);
    }
}
