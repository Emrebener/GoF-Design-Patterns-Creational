public final class MarkdownReportBuilder implements ReportBuilder {
    private final StringBuilder md = new StringBuilder();

    @Override public void addTitle(String t)             { md.append("# ").append(t).append("\n\n"); }
    @Override public void addSection(String h, String b) { md.append("## ").append(h).append("\n\n").append(b).append("\n\n"); }
    @Override public void addFooter(String f)            { md.append("---\n").append(f).append("\n"); }
    @Override public Report build()                       { return new MarkdownReport(md.toString()); }
}
