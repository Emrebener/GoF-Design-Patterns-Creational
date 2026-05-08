public final class PooledConnection implements AutoCloseable {
    private final Connection delegate;
    private final ConnectionPool pool;

    PooledConnection(Connection delegate, ConnectionPool pool) {
        this.delegate = delegate;
        this.pool = pool;
    }

    public void execute(String sql) {
        delegate.execute(sql);
    }

    @Override
    public void close() {
        delegate.reset();       // reset state
        pool.release(delegate); // return to pool
    }
}
