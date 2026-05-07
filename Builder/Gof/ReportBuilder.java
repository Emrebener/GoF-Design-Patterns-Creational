public interface ReportBuilder {
    void addTitle(String title);
    void addSection(String heading, String body);
    void addFooter(String footer);
    Report build();
}
