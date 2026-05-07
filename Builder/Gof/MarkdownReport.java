public final class MarkdownReport implements Report {
    private final String content;

    public MarkdownReport(String content) {
        this.content = content;
    }

    @Override
    public String content() {
        return content;
    }
}
