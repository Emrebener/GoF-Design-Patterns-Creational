public final class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public Shape copy() {
        return new Circle(this.radius);
    }
}
