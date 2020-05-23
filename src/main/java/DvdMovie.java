public class DvdMovie implements RetailItem{
    private String title;
    private int runningTime;
    private double retailPrice;

    public DvdMovie(String title, int runTime, double price) {
        this.title = title;
        runningTime = runTime;
        retailPrice = price;
    }

    public String getTitle() {
        return title;
    }

    public int getRunningTime() {
        return runningTime;
    }

    @Override
    public double getRetailPrice() {
        return retailPrice;
    }
}
