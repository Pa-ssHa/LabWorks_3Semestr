package Lab_1_2;

public class PerdeviceA2 extends PerdeviceA{
    public PerdeviceA2(double price, String model) {
        super(price, model);
    }

    public String getInfo() {
        return "Модель: " + getModel() + "; цена: " + getPrice();
    }
}
