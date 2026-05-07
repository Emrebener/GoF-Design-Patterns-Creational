public final class HtmlReport implements Report {
    private final String content;

    public HtmlReport(String content) {
        this.content = content;
    }

    @Override
    public String content() {
        return content;
    }
}
