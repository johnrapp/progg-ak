import se.lth.cs.pt.square.Square;
import se.lth.cs.pt.window.SimpleWindow;

public class DrawThreeSquares {
    public static void main(String[] args) {
        SimpleWindow w = new SimpleWindow(600, 600, "DrawSquare");
        Square sq = new Square(250, 250, 100);
        sq.draw(w);

        int units = 20;
        sq.move(2*units, -1*units);
        sq.draw(w);
        sq.move(-2*units + 1*units, 1*units + 1*units);
        sq.draw(w);
    }
}
