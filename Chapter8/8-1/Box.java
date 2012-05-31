public class Box implements Describable {

    private String description;
    private int height;
    private int width;
    private int length;

    public Box(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
        this.description = "A box that is " + height + " high, " + length + " long and " + width + " wide";
    }

    public String getDescription() {
        return description;
    }
}