public final class Shape implements Cloneable {
    private String name;
    private int[] points;

    public Shape(String name, int[] points) {
        this.name = name;
        this.points = points;
    }

    @Override
    public Shape clone() {
        try {
            Shape copy = (Shape) super.clone();
            copy.points = points.clone(); // deep copy the mutable array
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e); // can't happen, we implement Cloneable
        }
    }
}
