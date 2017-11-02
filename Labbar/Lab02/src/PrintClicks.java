import se.lth.cs.pt.square.Square;
import se.lth.cs.pt.window.SimpleWindow;

public class PrintClicks {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "PrintClicks");
		Square sq = new Square(250, 250, 100);
		sq.draw(w);
		while (true) {
			w.waitForMouseClick();
			w.moveTo(w.getMouseX(), w.getMouseY());
			w.writeText("x = " + w.getMouseX() + ", " + "y = " + w.getMouseY());
		}
	}
}
