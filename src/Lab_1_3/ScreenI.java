package Lab_1_3;

public class ScreenI extends PerdeviceI3 {
    private double diagonal;
    private double price;
    private String model;
    public ScreenI(double price, String model, double diagonal ){
        this.price = price;
        this.model = model;
        this.diagonal = diagonal;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setDiagonal(double diagonal){
        this.diagonal = diagonal;
    }
    public double getDiagonal() {
        return diagonal;
    }
    @Override
    public String getModel() {
        return model;
    }
    @Override
    public double getPrice() {
        return price;
    }
    @Override
    public String getInfo() {
        return "Тип: Монитор; " + "Модель: " + getModel() + "; цена: " + getPrice() + "; Диагональ: " + diagonal + " дюймов";
    }
}

