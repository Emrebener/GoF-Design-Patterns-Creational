import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public final class ConnectionPool {
    private final BlockingQueue<Connection> idle;

    public ConnectionPool(ConnectionFactory factory, int size) {
        this.idle = new ArrayBlockingQueue<>(size);
        for (int i = 0; i < size; i++) {
            idle.offer(factory.create());
        }
    }

    public Connection acquire() throws InterruptedException {
        return idle.take(); // blocks until one is available
    }

    public void release(Connection c) {
        idle.offer(c);
    }
}
