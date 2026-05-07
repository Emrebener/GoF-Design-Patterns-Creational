public final class Color {
    private final int r, g, b;

    private Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public static Color fromRGB(int r, int g, int b) {
        return new Color(r, g, b);
    }

    public static Color fromHex(String hex) {
        // ...hex → RGB parsing
        return new Color(0, 0, 0);
    }

    public static Color fromHSV(float h, float s, float v) {
        // ...HSV → RGB conversion
        return new Color(0, 0, 0);
    }
}
