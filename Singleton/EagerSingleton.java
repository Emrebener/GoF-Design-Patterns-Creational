public final class EagerSingleton {
    public static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() {
        // load settings, etc.
    }

    public String get(String key) {
        return null;
    }
}
