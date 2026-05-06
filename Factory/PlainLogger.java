public final class PlainLogger extends Logger {
    @Override
    protected Formatter createFormatter() {
        return new PlainFormatter();
    }
}
