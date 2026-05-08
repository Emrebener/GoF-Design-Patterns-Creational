public interface Connection {
    void execute(String sql);
    void reset();
}
