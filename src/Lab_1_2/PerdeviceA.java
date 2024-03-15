package Lab_1_2;

public abstract class PerdeviceA {
    private double price;

    private String model;
    public PerdeviceA(double price, String model) {
        this.price = price;
        this.model = model;
    }
    public String getModel() {
        return model;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public abstract String getInfo();
}
