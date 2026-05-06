public abstract class Logger {
    public final void log(String msg) {
        Formatter f = createFormatter();
        write(f.format(msg));
    }

    protected abstract Formatter createFormatter();

    protected void write(String formatted) {
        // append to file, send to stdout, etc.
    }
}
