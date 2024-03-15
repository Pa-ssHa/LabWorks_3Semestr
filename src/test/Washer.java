package test;

public class Washer extends appliances {
    private double discount;
    private double capacity;
    public Washer(String n, String com, double c, double cap, int year, int month, int day, double discount) {
        super(n, com, c, year, month, day);
        this.capacity = cap;
        this.discount = discount;
    }
    public double getDiscount() {
        return discount;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    public Double getCapacity() {
        return capacity;
    }
    public double setCapacity(Double cap) {
        return this.capacity = cap;
    }
    @Override
    public Double getCost() {
        return super.getCost() - discount;
    }
    @Override
    public String toString() {
        return super.toString() + ", Скидка:" + getDiscount() + ", Вместимость" + getCapacity();
    }
}
