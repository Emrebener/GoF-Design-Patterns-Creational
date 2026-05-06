public final class JsonLogger extends Logger {
    @Override
    protected Formatter createFormatter() {
        return new JsonFormatter();
    }
}
