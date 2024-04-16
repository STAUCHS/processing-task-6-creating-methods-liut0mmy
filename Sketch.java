import processing.core.PApplet;

public class Sketch extends PApplet {
    public static void main(String[] args) {
        PApplet.main("SmileyFace");
    }

    public void settings() {
        size(800, 800);
    }

    public void setup() {
        background(66, 135 ,245);
        drawSmileyFaces();
    }

    /**
     * Draws smiley faces vertically and horizontally.
     *
     * @param size of the smiley face.
     * @param spacing between each smiley face.
     */
    public void drawSmileyFaces() {
        int spacing = 100;
        int numHorizontal = width / (spacing + 100);
        int numVertical = height / (spacing + 100);

        for (int i = 0; i < numHorizontal; i++) {
            for (int j = 0; j < numVertical; j++) {
                drawSmiley(i * (spacing + 133), j * (spacing + 133), 100);
            }
        }
    }

    /**
     * Smiley face
     *
     * @param x coordinate
     * @param y coordinate
     * @param size
     */
    public void drawSmiley(int x, int y, int size) {
        // Draw face
        ellipseMode(CENTER);
        fill(255, 255, 0);
        ellipse(x + size / 2, y + size / 2, size, size);

        // Draw eyes
        fill(0);
        ellipse(x + size / 3, y + size / 3, size / 8, size / 8);
        ellipse(x + 2 * size / 3, y + size / 3, size / 8, size / 8);

        // Draw mouth
        noFill();
        strokeWeight(2);
        arc(x + size / 2, y + 2 * size / 3, size / 2, size / 4, 0, PI);
    }
}