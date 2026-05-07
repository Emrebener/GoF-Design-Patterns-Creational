public final class HtmlReportBuilder implements ReportBuilder {
    private final StringBuilder html = new StringBuilder("<html><body>");

    @Override public void addTitle(String t)             { html.append("<h1>").append(t).append("</h1>"); }
    @Override public void addSection(String h, String b) { html.append("<h2>").append(h).append("</h2><p>").append(b).append("</p>"); }
    @Override public void addFooter(String f)            { html.append("<footer>").append(f).append("</footer>"); }
    @Override public Report build()                       { return new HtmlReport(html.append("</body></html>").toString()); }
}
