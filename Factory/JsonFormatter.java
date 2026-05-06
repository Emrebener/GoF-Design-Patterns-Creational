public final class JsonFormatter implements Formatter {
    @Override
    public String format(String msg) {
        return "{\"msg\":\"" + msg + "\"}";
    }
}
