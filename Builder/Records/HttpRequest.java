import java.net.URI;
import java.time.Duration;

public record HttpRequest(
    URI url, String method, Duration timeout, int retries
) {
    public static Builder builder(URI url) {
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

        public Builder method(String method)     { this.method = method;     return this; }
        public Builder timeout(Duration timeout) { this.timeout = timeout;   return this; }
        public Builder retries(int retries)      { this.retries = retries;   return this; }

        public HttpRequest build() {
            return new HttpRequest(url, method, timeout, retries);
        }
    }
}
