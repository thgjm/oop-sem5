package gemstones.gemstone;

// class for representing Opal - semi precious stone
public class Opal extends SemiPreciousStone {

    private String playOfColor;

    // constructor
    public Opal(double weight, double cost, double transparency, String lustre, String color, String hardness, String playOfColor) {
        super("Opal", weight, cost, transparency, lustre, color, hardness);
        this.playOfColor = playOfColor;
    }

    // getter for play of colors
    public String getPlayOfColor() {
        return playOfColor;
    }

    // setter for play of colors
    public void setPlayOfColor(String playOfColor) {
        this.playOfColor = playOfColor;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("; play of colors = %s.", playOfColor);
    }
}
