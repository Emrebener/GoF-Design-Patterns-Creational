public final class ReportDirector {
    public Report assembleQuarterlyReport(ReportBuilder b) {
        b.addTitle("Q3 Results");
        b.addSection("Revenue", "...");
        b.addSection("Costs", "...");
        b.addFooter("Confidential");
        return b.build();
    }
}
