package gemstones.gemstone;

// class for representing Amethyst - semi precious stone
public class Amethyst extends SemiPreciousStone {

    private String pattern;

    // constructor
    public Amethyst(double weight, double cost, double transparency, String lustre, String color, String hardness, String pattern) {
        super("Amethyst", weight, cost, transparency, lustre, color, hardness);
        this.pattern = pattern;
    }

    // getter for pattern
    public String getPattern() {
        return pattern;
    }

    // setter for pattern
    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("; pattern = %s.", pattern);
    }
}
