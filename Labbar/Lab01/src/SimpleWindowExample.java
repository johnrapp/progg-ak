import se.lth.cs.pt.window.SimpleWindow;

public class SimpleWindowExample {
    public static void main(String[] args) {
        SimpleWindow w = new SimpleWindow(500, 500, "Drawing window");
        w.setLineWidth(1);

        w.moveTo(0, 250);
        for(int x = 0; x < 500; x++) {
            w.setLineWidth(1 + (x*10)/500);
            w.lineTo(x, 250 - f2(x));
        }

    }

    public static int f(int x) {
        return x*x/500;
    }

    public static int f2(int x) {
        double xScaled = x / 10.0;
        return (int) (Math.sin(xScaled)*250);
    }
}
