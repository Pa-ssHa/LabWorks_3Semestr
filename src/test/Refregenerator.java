package test;

public class Refregenerator extends appliances{
    private double extra;
    public Refregenerator(String n, String com, double c, int year, int month, int day, double extra) {
        super(n, com, c, year, month, day);
        this.extra = extra;
    }
    public double getExtra() {
        return extra;
    }
    public void setExtra(double extra) {
        this.extra = extra;
    }
    @Override
    public Double getCost() {
        return super.getCost() + extra;
    }
    @Override
    public String toString() {
        return super.toString() + ", Наценка:" + getExtra();
    }
}

