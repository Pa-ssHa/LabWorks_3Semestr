package Lab_1_1;

public class Perdevice {

    private double price;

    private String model;
    private double diagonal;
    private double guaranteeYear;
    private boolean wireless;
    public Perdevice(double price, String model) {
        this.price = price;
        this.model = model;
    }
    public Perdevice(String model, double price, double diagonal, double guaranteeYear, boolean wireless) {
        this.model = model;
        this.price = price;
        this.diagonal = diagonal;
        this.guaranteeYear = guaranteeYear;
        this.wireless = wireless;
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
    public String toString() {
        return "Модель: " + getModel() + "; цена: " + getPrice();
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public void setGuaranteeYear(double guaranteeYear) {
        this.guaranteeYear = guaranteeYear;
    }

    public double getGuaranteeYear() {
        return guaranteeYear;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    public boolean isWireless() {
        return wireless;
    }
}
