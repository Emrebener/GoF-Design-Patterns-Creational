public final class Shape {
    private final String name;
    private final int[] points;

    public Shape(String name, int[] points) {
        this.name = name;
        this.points = points.clone();
    }

    public Shape(Shape other) {
        this.name = other.name;
        this.points = other.points.clone();
    }

    public static Shape copyOf(Shape other) {
        return new Shape(other);
    }
}
