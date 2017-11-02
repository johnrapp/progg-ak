import java.awt.*;

public class Mole {
    private Graphics g = new Graphics(30, 30, 20);
    int skyHeight = 6;
    int grassHeight = 1;

    public static void main(String[] args) {
        Mole m = new Mole();
        m.drawWorld();
        m.dig();
    }

    public void drawWorld() {
        g.rectangle(0, 0, g.getWidth(), skyHeight, Colors.SKY);
        g.rectangle(0, skyHeight, g.getWidth(), grassHeight, Colors.GRASS);
        g.rectangle(0, skyHeight + grassHeight, g.getWidth(), g.getHeight() - 4, Colors.SOIL);
    }

    public void dig() {
        int x = g.getWidth() / 2;
        int y = g.getHeight() / 2;

        while(true) {
            g.block(x, y, Colors.MOLE);

            char key = g.waitForKey();
            int lastX = x, lastY = y;
            boolean digged = true;
            switch (key) {
                case 'w': y--; break;
                case 'a': x--; break;
                case 's': y++; break;
                case 'd': x++; break;
                default: digged = false;
            }
            if (digged && y < skyHeight + grassHeight) {
                y = skyHeight + grassHeight;
                digged = false;
            }
            if (digged) g.block(lastX, lastY, Colors.TUNNEL);
        }
    }
}
