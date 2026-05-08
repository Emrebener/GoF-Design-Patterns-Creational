import java.net.URI;
import java.time.Duration;

public final class HttpRequest {
    private final URI url;
    private final String method;
    private final Duration timeout;
    private final int retries;

    private HttpRequest(Builder b) {
        this.url = b.url;
        this.method = b.method;
        this.timeout = b.timeout;
        this.retries = b.retries;
    }

    public static Builder builder(URI url) { // ← this is the static entry point
        return new Builder(url);
    }

    public static final class Builder {
        private final URI url;
        private String method = "GET";
        private Duration timeout = Duration.ofSeconds(30);
        private int retries = 0;

        private Builder(URI url) {
            this.url = url;
        }

        public Builder method(String method) {
            this.method = method;
            return this;
        }

        public Builder timeout(Duration timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder retries(int retries) {
            this.retries = retries;
            return this;
        }

        public HttpRequest build() {
            return new HttpRequest(this);
        }
    }
}
